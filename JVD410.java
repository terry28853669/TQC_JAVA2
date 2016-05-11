import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JVD410 extends JFrame {
	// 資料庫存取物件
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	// GUI 物件
	Container container;
	JTextField averageScore;

	public JVD410() {
		super("成績計算");
		container = getContentPane();
		JPanel panel = new JPanel();
		JButton actionButton = new JButton("排名及計算平均");
		actionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computeRankAndAverage();
			}
		});
		panel.add(actionButton, BorderLayout.WEST);
		JLabel label = new JLabel("    平均成績: ");
		panel.add(label, BorderLayout.CENTER);
		averageScore = new JTextField(12);
		panel.add(averageScore, BorderLayout.EAST);
		container.add(panel, BorderLayout.NORTH);
		// 載入JDBC驅動程式與連結資料庫
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connection = DriverManager.getConnection("jdbc:odbc:JVD410");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load JDBC/ODBC driver.");
		} catch (SQLException e) {
			System.out.println("Unable to connect");
		}
		// 讀取並顯示資料表內容
		getTable();
		setSize(500, 600);
		show();
	}

	private void computeRankAndAverage() {
		try {
			String query = "select 學號, 成績 from score order by 成績 desc";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			Vector idOrderPairs = new Vector();
			// 請在此加入程式碼以完成下列工作:
			// 1、決定每一學生的名次，並將學號與名次的對應存到idOrderPairs裡，
			// 2、計算全班平均成績，
			// 3、將平均成績顯示在視窗的文字欄位裡。
			/******************************************************/
			float total = 0f;
			float max = 101.0f;
			int seq = 0;
			int people = 0;

			while (resultSet.next()) {
				int n[] = new int[2];
				n[0] = resultSet.getInt(1);
				float score = resultSet.getFloat(2);
				System.out.println("                     " + score);
				people++;
				total += score;
				if (score == max) {
					n[1] = seq;
				} else {
					n[1] = seq++;
				}
				score = max;
				System.out.println(score + "  " + n[1]);
				idOrderPairs.addElement(n);
			}

			float average = total / people;
			averageScore.setText(String.valueOf(average));
			/******************************************************/

			resultSet.close();
			statement.close();
			// 呼叫方法writeRank將名次寫入資料表
			writeRank(idOrderPairs);
			getTable();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void writeRank(Vector v) {
		PreparedStatement prepStmt;
		try {
			prepStmt = connection
					.prepareStatement("update score set 名次=? where 學號=?");
			// 請在此加入程式碼，用Enumeration類別從idOrderPairs取出名次資料
			// 再用PreparedStatement物件prepStmt將資料寫入資料表。
			Enumeration em = v.elements();
			while (em.hasMoreElements()) {
				int a[] = (int[]) em.nextElement();
				prepStmt.setInt(1, a[1]);
				prepStmt.setInt(2, a[0]);
				prepStmt.executeUpdate();
			}
			prepStmt.close();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
	}

	public void getTable() {
		try {
			String query = "select * from score";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			displayResultSet();
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void displayResultSet() throws SQLException {
		Vector columnNames = new Vector();
		Vector rows = new Vector();
		try {
			// 請在此加入程式碼以顯示資料在視窗上。
			// 欄位「隨修」的資料以「是」或「否」表示。
			// 請用columnNames儲存欄位名稱，用rows儲存所有記錄。
			// /////////////////////////////////////////////////////////////
			ResultSetMetaData rsm = resultSet.getMetaData();

			int len = rsm.getColumnCount();
			for (int i = 1; i <= len; i++) {
				columnNames.addElement(rsm.getColumnLabel(i));
			}

			String s = "";

			while (resultSet.next()) {
				Vector v = new Vector();
				v.addElement(resultSet.getLong(1));
				v.addElement((resultSet.getBoolean(2) ? "是" : "否"));
				v.addElement(new Float(resultSet.getFloat(3)));
				v.addElement(new Integer(resultSet.getInt(4)));
				rows.addElement(v);
			}

			// /////////////////////////////////////////////////////////////////

			JTable table = new JTable(rows, columnNames);
			JScrollPane scroller = new JScrollPane(table);
			container.add(scroller, BorderLayout.CENTER);
			container.validate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		final JVD410 jva04 = new JVD410();
		jva04.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent eve) {

				try {
					jva04.connection.close();
				} catch (SQLException e) {
					System.out.println("Unable to disconnect");
				}
				System.exit(0);
			}
		});
	}
}// end class
