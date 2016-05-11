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
public class JVD302 extends JFrame implements ItemListener {
	JTextField tf;
	JCheckBox bBox, iBox;
	int bold = Font.PLAIN, italic = Font.PLAIN;
	int align = JTextField.LEFT, fonts = 14;

	private JRadioButton lr, cr, rr;
	private ButtonGroup buttonGroup;
	// �U�Կﶵ
	private String name[] = { "14", "16", "18", "20" };
	private JComboBox comboBox = new JComboBox(name);

	public JVD302() {
		super("�r��]�w��ܾ�");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		tf = new JTextField("Just a font Tester", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));

		/*--------------------------*/
		lr = new JRadioButton("�V��");
		rr = new JRadioButton("�V�k");
		cr = new JRadioButton("�m��");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(lr);
		buttonGroup.add(rr);
		buttonGroup.add(cr);
		bBox = new JCheckBox("���^", false);
		iBox = new JCheckBox("���^", false);
		c.add(tf);
		c.add(lr);
		c.add(rr);
		c.add(cr);
		c.add(bBox);
		c.add(iBox);
		c.add(comboBox);
		/*--------------------------*/
		// �]�wListener
		addWindowListener(new MyListener());
		bBox.addItemListener(this);
		iBox.addItemListener(this);
		lr.addItemListener(this);
		cr.addItemListener(this);
		rr.addItemListener(this);
		comboBox.setMaximumRowCount(3);
		comboBox.addItemListener(this);
		// �[�J����
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B��ܤ�r��� 2�B��ܿﶵ�s 3�B��ܮ֨���� 4�B��ܤU�Կ��
		 */
		// �]�w�j�p�A���JFrame
		setSize(280, 150);
		setVisible(true);
	}
	// �B�z�{������
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		/*
		 * �Цb���B�[�W�{���X�A�z���� 1�B�]�w����B����B�z�{�� 2�B�]�w����B�z�{�� 3�B�]�w�r��j�p�B�z�{�� 4�B�̤��P���]�w����ܤ�r
		 */
		/*----------------------------------*/
		int n = 0;
		if (e.getSource() == lr) {
			n = JTextField.LEFT;
		} else if (e.getSource() == rr) {
			n = JTextField.RIGHT;
		} else if (e.getSource() == cr) {
			n = JTextField.CENTER;
		}
		tf.setHorizontalAlignment(n);
		//
		//
		int b = 0, i = 0;
		if (e.getSource() == bBox) {
			if (e.getStateChange() == 1) {
				b = 1;
			} else {
				b = 0;
			}
		} else if (e.getSource() == iBox) {
			if (e.getStateChange() == 1) {
				i = 2;
			} else {
				i = 0;
			}
		}
		String big = "14";
		if (e.getSource() == comboBox) {
			big = (String) comboBox.getSelectedItem();
		}
		tf.setFont(new Font("Serif", b + i, Integer.parseInt(big)));
		/*----------------------------------*/
	}
	public static void main(String args[]) {
		new JVD302();
	}
}
