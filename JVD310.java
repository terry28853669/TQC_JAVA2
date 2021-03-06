
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JVD310 extends JFrame {
	private JPanel jp1; // 放置輸入出生年月日元件
	private JTextField ty, tm, td;
	private JLabel label1, label2, label3, label4;
	private JButton b;
	private int year, month, day;
	private int yearNow, monthNow, dayNow;
	private int result;

	public JVD310() {
		super("計算年齡");
		Container con = getContentPane();//
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout()); //
		// 求得目前系統日期
		Calendar cal = Calendar.getInstance(); //
		// 求得目前系統的西元年
		yearNow = cal.get(1);//
		// 求得目前系統的月份(一月會回傳0,故加1後才是真正的月份)
		monthNow = cal.get(2) + 1;//
		// 求得目前系統的日期
		dayNow = cal.get(5);//
		// 設定GUI
		label4 = new JLabel("請輸入出生年月日");// ;
		con.add(label4, BorderLayout.NORTH);
		label1 = new JLabel("年(yyyy)");//
		jp1.add(label1);//
		ty = new JTextField(4);//
		jp1.add(ty);//
		label2 = new JLabel("月(MM) ");// 後面要留空白哦！
		jp1.add(label2);//
		tm = new JTextField(4);//
		jp1.add(tm);//
		label3 = new JLabel("日(DD) ");//
		jp1.add(label3);//
		td = new JTextField(4);//
		jp1.add(td);//
		con.add(jp1, BorderLayout.CENTER);
		b = new JButton("計算結果");//
		// 該按鈕被按下時的事件驅動
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/****************************************************************/
				try {
					if (Integer.parseInt(ty.getText()) > yearNow
							|| Integer.parseInt(tm.getText()) > 12
							|| Integer.parseInt(td.getText()) > 31) // 檢查是否所輸入出生年月日不正確
						JOptionPane.showMessageDialog(null, "輸入不正確");
					else {
						year = Integer.parseInt(ty.getText());
						month = Integer.parseInt(tm.getText());
						day = Integer.parseInt(td.getText());
						JOptionPane.showMessageDialog(null, "您現在實際的年齡為" + String.valueOf(yearNow - year)+"歲","計算年齡",2);
					}
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(null, "請輸入完整的出生年月日");
				}
				/****************************************************************/
			}
		});
		con.add(b, BorderLayout.SOUTH);
		// 設定JFrame大小
		setSize(150, 180);
		// 讓JFrame不能設定大小
		setResizable(false);
		setVisible(true);
	}

	public static void main(String args[]) {
		JVD310 age = new JVD310();
		// 讓JFrame結束的事件驅動
		age.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
