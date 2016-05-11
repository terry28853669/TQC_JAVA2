
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
			label.setText("�A��ܤF�ɮצW�٬�" + file.getName());
		} else if (i == 1) {
			label.setText("�A�S����ܥ����ɮ�");
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
			pmi = new ProgressMonitorInputStream(frame, "�ɮ�Ū�����_.....",
					fileinputstream);
			ProgressMonitor pm = pmi.getProgressMonitor();

			/*
			 * �o�G�Ӥ�k�Ψ���ܶi�׹�ܲ����ɾ��A
			 * setMillisToDecideToPopup�]�^�@�O����t�ΰ���ɶ��W�L�X�@��ɡA�h�X�{��ܲ�
			 * setMillisToPopup() ����{������ɶ��W�L�t�ιw���ɶ��ɫh�X�{�C
			 */
			pm.setMillisToDecideToPopup(10);
			pm.setMillisToPopup(1);

			int j;
			try {
				while ((j = pmi.read()) != -1) {
					textarea.append(String.valueOf((char) j)); // �`�N�o��.....
					Thread.sleep(5L);

					if (pm.isCanceled()) { // isCanceled()��k�ӳB�z�ϥΪ̫��Ucancel�䪺�ƥ�
						textarea.append("Ū���ɮפ��_");
					}
				}
			} catch (Exception ioexception) {
				label.setText("�ɫ�Ū�����_....");
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
