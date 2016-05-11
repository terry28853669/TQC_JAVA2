//=================== JVA03 ===================
/*
 設定文字屬性，
 1、建立選項鈕設定不同的對齊方式，但只能選取其中一種對齊方式。
 2、建立核取方塊設定「粗體」或「斜體」。
 3、建立下立選項設定字體大小

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

	// 下拉選項
	private String name[] = { "14", "16", "18", "20" };
	private JComboBox comboBox = new JComboBox(name);

	public JVD302D() {
		super("字體設定選擇器");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		tf = new JTextField("Just a font Tester", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));

		// 選項鈕
		/*
		 * 請在此處加上程式碼，您必須 1、設定核取方塊
		 */
		leftRadio = new JRadioButton("向左");
		centerRadio = new JRadioButton("置中");
		rightRadio = new JRadioButton("向右");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(leftRadio);
		buttonGroup.add(centerRadio);
		buttonGroup.add(rightRadio);

		// 核取方塊
		/*
		 * 請在此處加上程式碼，您必須 1、設定核取方塊
		 */
		boldBox = new JCheckBox("粗体", false);
		italicBox = new JCheckBox("斜体", false);

		// 加入介面
		c.add(tf);
		c.add(leftRadio);
		c.add(centerRadio);
		c.add(rightRadio);
		c.add(boldBox);
		c.add(italicBox);
		c.add(comboBox);

		// 設定Listener
		addWindowListener(new MyListener());

		boldBox.addItemListener(this);
		italicBox.addItemListener(this);

		leftRadio.addItemListener(this);
		centerRadio.addItemListener(this);
		rightRadio.addItemListener(this);

		comboBox.setMaximumRowCount(3);
		comboBox.addItemListener(this);

		// 加入介面
		/*
		 * 請在此處加上程式碼，您必須 1、顯示文字欄位 2、顯示選項鈕 3、顯示核取方塊 4、顯示下拉選單
		 */

		// 設定大小，顯示JFrame
		setSize(280, 150);
		show();
	}

	// 處理程式關閉
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}
	}

	public void itemStateChanged(ItemEvent e) {

		// 2、設定對齊處理程式
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
		// 1、設定粗體、斜體處理程式
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
		// 3、設定字體大小處理程式
		String big = "14";
		if (e.getSource() == comboBox) {
			big = (String) comboBox.getSelectedItem();
		}
		// 4、依不同的設定值顯示文字
		tf.setFont(new Font("Serif", b + i, Integer.parseInt(big)));

	}

	public static void main(String args[]) {
		new JVD302D();
	}
}
