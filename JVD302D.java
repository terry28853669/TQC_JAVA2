//=================== JVA03 ===================
/*
 �]�w��r�ݩʡA
 1�B�إ߿ﶵ�s�]�w���P������覡�A���u�����䤤�@�ع���覡�C
 2�B�إ߮֨�����]�w�u����v�Ρu����v�C
 3�B�إߤU�߿ﶵ�]�w�r��j�p

 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JVD302D extends JFrame implements ItemListener

{
	JTextField tf;
	JCheckBox boldBox, italicBox;
	int bold = Font.PLAIN, italic = Font.PLAIN;
	int align = JTextField.LEFT, fonts = 14;

	private JRadioButton leftRadio, centerRadio, rightRadio;
	private ButtonGroup buttonGroup;

	// �U�Կﶵ
	private String name[] = { "14", "16", "18", "20" };
	private JComboBox comboBox = new JComboBox(name);

	public JVD302D() {
		super("�r��]�w��ܾ�");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		tf = new JTextField("Just a font Tester", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));

		// �ﶵ�s
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B�]�w�֨����
		 */
		leftRadio = new JRadioButton("�V��");
		centerRadio = new JRadioButton("�m��");
		rightRadio = new JRadioButton("�V�k");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(leftRadio);
		buttonGroup.add(centerRadio);
		buttonGroup.add(rightRadio);

		// �֨����
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B�]�w�֨����
		 */
		boldBox = new JCheckBox("���^", false);
		italicBox = new JCheckBox("���^", false);

		// �[�J����
		c.add(tf);
		c.add(leftRadio);
		c.add(centerRadio);
		c.add(rightRadio);
		c.add(boldBox);
		c.add(italicBox);
		c.add(comboBox);

		// �]�wListener
		addWindowListener(new MyListener());

		boldBox.addItemListener(this);
		italicBox.addItemListener(this);

		leftRadio.addItemListener(this);
		centerRadio.addItemListener(this);
		rightRadio.addItemListener(this);

		comboBox.setMaximumRowCount(3);
		comboBox.addItemListener(this);

		// �[�J����
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B��ܤ�r��� 2�B��ܿﶵ�s 3�B��ܮ֨���� 4�B��ܤU�Կ��
		 */

		// �]�w�j�p�A���JFrame
		setSize(280, 150);
		show();
	}

	// �B�z�{������
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}
	}

	public void itemStateChanged(ItemEvent e) {

		// 2�B�]�w����B�z�{��
		int n = 0;
		if (e.getSource() == leftRadio) {
			// n = JTextField.LEFT;
			n = 2;
		} else if (e.getSource() == rightRadio) {
			// n = JTextField.RIGHT;
			n = 4;
		} else if (e.getSource() == centerRadio) {
			// n = JTextField.CENTER;
			n = 0;
		}
		tf.setHorizontalAlignment(n);
		// 1�B�]�w����B����B�z�{��
		int b = 0, i = 0;
		if (e.getSource() == boldBox) {
			if (e.getStateChange() == 1) {
				b = 1;
			} else {
				b = 0;
			}
		} else if (e.getSource() == italicBox) {
			if (e.getStateChange() == 1) {
				i = 2;
			} else {
				i = 0;
			}
		}
		// 3�B�]�w�r��j�p�B�z�{��
		String big = "14";
		if (e.getSource() == comboBox) {
			big = (String) comboBox.getSelectedItem();
		}
		// 4�B�̤��P���]�w����ܤ�r
		tf.setFont(new Font("Serif", b + i, Integer.parseInt(big)));

	}

	public static void main(String args[]) {
		new JVD302D();
	}
}
