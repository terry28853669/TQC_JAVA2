import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JVD410 extends JFrame {
	// ��Ʈw�s������
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	// GUI ����
	Container container;
	JTextField averageScore;

	public JVD410() {
		super("���Z�p��");
		container = getContentPane();
		JPanel panel = new JPanel();
		JButton actionButton = new JButton("�ƦW�έp�⥭��");
		actionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computeRankAndAverage();
			}
		});
		panel.add(actionButton, BorderLayout.WEST);
		JLabel label = new JLabel("    �������Z: ");
		panel.add(label, BorderLayout.CENTER);
		averageScore = new JTextField(12);
		panel.add(averageScore, BorderLayout.EAST);
		container.add(panel, BorderLayout.NORTH);
		// ���JJDBC�X�ʵ{���P�s����Ʈw
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connection = DriverManager.getConnection("jdbc:odbc:JVD410");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load JDBC/ODBC driver.");
		} catch (SQLException e) {
			System.out.println("Unable to connect");
		}
		// Ū������ܸ�ƪ��e
		getTable();
		setSize(500, 600);
		show();
	}

	private void computeRankAndAverage() {
		try {
			String query = "select �Ǹ�, ���Z from score order by ���Z desc";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			Vector idOrderPairs = new Vector();
			// �Цb���[�J�{���X�H�����U�C�u�@:
			// 1�B�M�w�C�@�ǥͪ��W���A�ñN�Ǹ��P�W���������s��idOrderPairs�̡A
			// 2�B�p����Z�������Z�A
			// 3�B�N�������Z��ܦb��������r���̡C
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
			// �I�s��kwriteRank�N�W���g�J��ƪ�
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
					.prepareStatement("update score set �W��=? where �Ǹ�=?");
			// �Цb���[�J�{���X�A��Enumeration���O�qidOrderPairs���X�W�����
			// �A��PreparedStatement����prepStmt�N��Ƽg�J��ƪ�C
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
			// �Цb���[�J�{���X�H��ܸ�Ʀb�����W�C
			// ���u�H�סv����ƥH�u�O�v�Ρu�_�v��ܡC
			// �Х�columnNames�x�s���W�١A��rows�x�s�Ҧ��O���C
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
				v.addElement((resultSet.getBoolean(2) ? "�O" : "�_"));
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
