
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JVD310 extends JFrame {
	private JPanel jp1; // ��m��J�X�ͦ~��餸��
	private JTextField ty, tm, td;
	private JLabel label1, label2, label3, label4;
	private JButton b;
	private int year, month, day;
	private int yearNow, monthNow, dayNow;
	private int result;

	public JVD310() {
		super("�p��~��");
		Container con = getContentPane();//
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout()); //
		// �D�o�ثe�t�Τ��
		Calendar cal = Calendar.getInstance(); //
		// �D�o�ثe�t�Ϊ��褸�~
		yearNow = cal.get(1);//
		// �D�o�ثe�t�Ϊ����(�@��|�^��0,�G�[1��~�O�u�������)
		monthNow = cal.get(2) + 1;//
		// �D�o�ثe�t�Ϊ����
		dayNow = cal.get(5);//
		// �]�wGUI
		label4 = new JLabel("�п�J�X�ͦ~���");// ;
		con.add(label4, BorderLayout.NORTH);
		label1 = new JLabel("�~(yyyy)");//
		jp1.add(label1);//
		ty = new JTextField(4);//
		jp1.add(ty);//
		label2 = new JLabel("��(MM) ");// �᭱�n�d�ťծ@�I
		jp1.add(label2);//
		tm = new JTextField(4);//
		jp1.add(tm);//
		label3 = new JLabel("��(DD) ");//
		jp1.add(label3);//
		td = new JTextField(4);//
		jp1.add(td);//
		con.add(jp1, BorderLayout.CENTER);
		b = new JButton("�p�⵲�G");//
		// �ӫ��s�Q���U�ɪ��ƥ��X��
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/****************************************************************/
				try {
					if (Integer.parseInt(ty.getText()) > yearNow
							|| Integer.parseInt(tm.getText()) > 12
							|| Integer.parseInt(td.getText()) > 31) // �ˬd�O�_�ҿ�J�X�ͦ~��餣���T
						JOptionPane.showMessageDialog(null, "��J�����T");
					else {
						year = Integer.parseInt(ty.getText());
						month = Integer.parseInt(tm.getText());
						day = Integer.parseInt(td.getText());
						JOptionPane.showMessageDialog(null, "�z�{�b��ڪ��~�֬�" + String.valueOf(yearNow - year)+"��","�p��~��",2);
					}
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(null, "�п�J���㪺�X�ͦ~���");
				}
				/****************************************************************/
			}
		});
		con.add(b, BorderLayout.SOUTH);
		// �]�wJFrame�j�p
		setSize(150, 180);
		// ��JFrame����]�w�j�p
		setResizable(false);
		setVisible(true);
	}

	public static void main(String args[]) {
		JVD310 age = new JVD310();
		// ��JFrame�������ƥ��X��
		age.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
