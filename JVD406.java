
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JVD406 implements ActionListener, Runnable {
	public JVD406() {
		frame = null;
		label = null;
		textarea = null;
		fileChooser = null;

		frame = new JFrame("ProgressBar Example");
		Container container = frame.getContentPane();
		/*************************/
		frame.setBounds(100, 100, 400, 300);
		/*************************/
		textarea = new JTextArea();
		JScrollPane jscrollpane = new JScrollPane(textarea);
		jscrollpane.setPreferredSize(new Dimension(350, 350));
		JButton jbutton = new JButton("Read File");
		jbutton.addActionListener(this);
		label = new JLabel(" ", 0);
		fileChooser = new JFileChooser();
		container.add(label, "North");
		container.add(jscrollpane, "Center");
		container.add(jbutton, "South");
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		new JVD406();
	}

	public void actionPerformed(ActionEvent actionevent) {
		/******************************************************/
		athread = new Thread(this);
		athread.start();
		/******************************************************/
	}

	public void run() {

		File file = null;
		int i = fileChooser.showOpenDialog(frame);
		textarea.setText("");
		/********************* start *******************************/
		if (i == 0) {
			file = fileChooser.getSelectedFile();
			label.setText("你選擇了檔案名稱為" + file.getName());
		} else if (i == 1) {
			label.setText("你沒有選擇任何檔案");
		}
		/********************* end *************************************/
		if (file != null) {
			FileInputStream fileinputstream;
			try {
				fileinputstream = new FileInputStream(file);
			} catch (FileNotFoundException filenotfoundexception) {
				label.setText("File Not Found");
				return;
			}
			/*********************** start ***********************************/
			ProgressMonitorInputStream pmi;
			pmi = new ProgressMonitorInputStream(frame, "檔案讀取中斷.....",
					fileinputstream);
			ProgressMonitor pm = pmi.getProgressMonitor();

			/*
			 * 這二個方法用來顯示進度對話盒的時機，
			 * setMillisToDecideToPopup（）　是指當系統執行時間超過幾毫秒時，則出現對話盒
			 * setMillisToPopup() 指當程式執行時間超過系統預估時間時則出現。
			 */
			pm.setMillisToDecideToPopup(10);
			pm.setMillisToPopup(1);

			int j;
			try {
				while ((j = pmi.read()) != -1) {
					textarea.append(String.valueOf((char) j)); // 注意這行.....
					Thread.sleep(5L);

					if (pm.isCanceled()) { // isCanceled()方法來處理使用者按下cancel鍵的事件
						textarea.append("讀取檔案中斷");
					}
				}
			} catch (Exception ioexception) {
				label.setText("檔按讀取中斷....");
			}
		}
		/********************* end *************************************/

	}

	JFrame frame;
	JLabel label;
	JTextArea textarea;
	JFileChooser fileChooser;
	Thread athread;
}// end class
