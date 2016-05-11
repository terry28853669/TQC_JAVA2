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
public class JVD302 extends JFrame implements ItemListener {
	JTextField tf;
	JCheckBox bBox, iBox;
	int bold = Font.PLAIN, italic = Font.PLAIN;
	int align = JTextField.LEFT, fonts = 14;

	private JRadioButton lr, cr, rr;
	private ButtonGroup buttonGroup;
	// 下拉選項
	private String name[] = { "14", "16", "18", "20" };
	private JComboBox comboBox = new JComboBox(name);

	public JVD302() {
		super("字體設定選擇器");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		tf = new JTextField("Just a font Tester", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));

		/*--------------------------*/
		lr = new JRadioButton("向左");
		rr = new JRadioButton("向右");
		cr = new JRadioButton("置中");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(lr);
		buttonGroup.add(rr);
		buttonGroup.add(cr);
		bBox = new JCheckBox("粗体", false);
		iBox = new JCheckBox("斜体", false);
		c.add(tf);
		c.add(lr);
		c.add(rr);
		c.add(cr);
		c.add(bBox);
		c.add(iBox);
		c.add(comboBox);
		/*--------------------------*/
		// 設定Listener
		addWindowListener(new MyListener());
		bBox.addItemListener(this);
		iBox.addItemListener(this);
		lr.addItemListener(this);
		cr.addItemListener(this);
		rr.addItemListener(this);
		comboBox.setMaximumRowCount(3);
		comboBox.addItemListener(this);
		// 加入介面
		/*
		 * 請在此處加上程式碼，您必須 1、顯示文字欄位 2、顯示選項鈕 3、顯示核取方塊 4、顯示下拉選單
		 */
		// 設定大小，顯示JFrame
		setSize(280, 150);
		setVisible(true);
	}
	// 處理程式關閉
	class MyListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		/*
		 * 請在此處加上程式碼，您必須 1、設定粗體、斜體處理程式 2、設定對齊處理程式 3、設定字體大小處理程式 4、依不同的設定值顯示文字
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
