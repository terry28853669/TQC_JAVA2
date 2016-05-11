
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class JVD402 extends JFrame implements ActionListener {
	// 第一個JPanel用來放置所選取檔案
	JPanel pn1 = new JPanel();
	// 顯示訊息的標籤
	JLabel msg = new JLabel("請選取兩個 txt 檔來做合併");
	// 按鈕上的圖示
	ImageIcon image1 = new ImageIcon("JVA04-1.gif");
	ImageIcon image2 = new ImageIcon("JVA04-1.gif");
	ImageIcon image3 = new ImageIcon("JVA04-2.gif");
	// 選取檔案的按鈕
	JButton bn1 = new JButton("選取要合併的第一個檔案", image1);
	JButton bn2 = new JButton("選取要合併的第二個檔案", image2);
	JButton bn3 = new JButton("選取合併後要存入的檔案", image3);
	// 顯示所選取檔案名稱
	JTextField tfIn[] = { new JTextField(), new JTextField() };
	// 顯示所要輸出的檔案名稱
	JTextField tf3 = new JTextField(3);
	// 第二個JPanel用來放置按鈕
	JPanel pn2 = new JPanel();
	JButton bnOK = new JButton("確定");
	JButton bnExit = new JButton("離開");
	// 合併檔案所用的 IO 類別
	JFileChooser jfc = new JFileChooser(".");
	InputStream is;
	SequenceInputStream sis;
	File outputFile;
	FileOutputStream out;

	public JVD402() {
		addWindowListener(new WinListener());
	}

	public static void main(String[] args) throws IOException {
		JVD402 test = new JVD402();
		test.setTitle("文字檔合併器--CSF範例");
		test.setup();
		test.setSize(300, 200);
		test.setVisible(true);
	}

	// 設定畫面元件及 Listener
	void setup() {
		Container content = this.getContentPane();
		pn1.setLayout(new GridLayout(0, 1));
		pn1.add(msg);
		bn1.addMouseListener(new MouseListen());
		bn2.addMouseListener(new MouseListen());
		bn3.addMouseListener(new MouseListen());
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		pn1.add(bn1);
		pn1.add(tfIn[0]);
		pn1.add(bn2);
		pn1.add(tfIn[1]);
		pn1.add(bn3);
		pn1.add(tf3);
		content.add(pn1);
		bnOK.addMouseListener(new MouseListen());
		bnExit.addMouseListener(new MouseListen());
		bnOK.addActionListener(this);
		bnExit.addActionListener(this);
		pn2.add(bnOK);
		pn2.add(bnExit);
		content.add(pn2, BorderLayout.SOUTH);
	}

	// 顯示開啟檔案對話方塊,並將所選取的檔案名稱放入 JTextField tfIn[] 中
	void selectInFile(int i) {
		// 回傳值為 0 代表使用者不是選擇 Cancel
		if (jfc.showOpenDialog(this) == 0) {
			tfIn[i - 1].setText(jfc.getSelectedFile().toString());
		}
	}

	// 顯示開啟檔案對話方塊,並將所選取的檔案名稱放入 JTextField tf3 中
	void selectOutFile() {
		// 回傳值為 0 代表使用者不是選擇 Cancel
		if (jfc.showOpenDialog(this) == 0) {
			tf3.setText(jfc.getSelectedFile().toString());
		}
	}

	// 進行檔案合併的動作
	void combineFiles() {
		try {
			InputStream in0 = new FileInputStream(tfIn[0].getText().trim());
			InputStream in1 = new FileInputStream(tfIn[1].getText().trim());
			sis = new SequenceInputStream(in0, in1);
			outputFile = new File(tf3.getText().trim());
			out = new FileOutputStream(outputFile);
			int c;
			while ((c = sis.read()) != -1) {
				System.out.write(c);
				out.write(c);
			}
			sis.close();
			out.close();
			msg.setText("檔案合併完成");
			tfIn[0].setText("");
			tfIn[1].setText("");
			tf3.setText("");
		} catch (Exception ex) {
			msg.setText("檔案合併沒成功");
		}
	}

	// 對按鈕的動作做出回應
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bnExit) {
			// 結束程式
			dispose();
			System.exit(0);
		} else if (e.getSource() == bnOK) {
			// 進行檔案合併
			combineFiles();
		} else if (e.getSource() == bn1) {
			// 顯示開啟檔案對話方塊,並將所選取的檔案名稱放入 JTextField tf[0] 中
			selectInFile(1);
		} else if (e.getSource() == bn2) {
			// 顯示開啟檔案對話方塊,並將所選取的檔案名稱放入 JTextField tfIn[1] 中
			selectInFile(2);
		} else if (e.getSource() == bn3) {
			// 顯示開啟檔案對話方塊,並將所選取的檔案名稱放入 JTextField tf3 中
			selectOutFile();
		}
	}

	// 用來讓JFrame可以正常結束
	class WinListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().dispose();
			System.exit(0);
		}
	}

	// 讓按鈕在滑鼠進入會變色
	class MouseListen extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			((JButton) e.getSource()).setBackground(Color.yellow);
		}

		public void mouseExited(MouseEvent e) {
			((JButton) e.getSource()).setBackground(new Color(204, 204, 204));
		}
	}
}
