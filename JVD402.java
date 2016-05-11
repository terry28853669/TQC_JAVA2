
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class JVD402 extends JFrame implements ActionListener {
	// �Ĥ@��JPanel�Ψө�m�ҿ���ɮ�
	JPanel pn1 = new JPanel();
	// ��ܰT��������
	JLabel msg = new JLabel("�п����� txt �ɨӰ��X��");
	// ���s�W���ϥ�
	ImageIcon image1 = new ImageIcon("JVA04-1.gif");
	ImageIcon image2 = new ImageIcon("JVA04-1.gif");
	ImageIcon image3 = new ImageIcon("JVA04-2.gif");
	// ����ɮת����s
	JButton bn1 = new JButton("����n�X�֪��Ĥ@���ɮ�", image1);
	JButton bn2 = new JButton("����n�X�֪��ĤG���ɮ�", image2);
	JButton bn3 = new JButton("����X�֫�n�s�J���ɮ�", image3);
	// ��ܩҿ���ɮצW��
	JTextField tfIn[] = { new JTextField(), new JTextField() };
	// ��ܩҭn��X���ɮצW��
	JTextField tf3 = new JTextField(3);
	// �ĤG��JPanel�Ψө�m���s
	JPanel pn2 = new JPanel();
	JButton bnOK = new JButton("�T�w");
	JButton bnExit = new JButton("���}");
	// �X���ɮשҥΪ� IO ���O
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
		test.setTitle("��r�ɦX�־�--CSF�d��");
		test.setup();
		test.setSize(300, 200);
		test.setVisible(true);
	}

	// �]�w�e������� Listener
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

	// ��ܶ}���ɮ׹�ܤ��,�ñN�ҿ�����ɮצW�٩�J JTextField tfIn[] ��
	void selectInFile(int i) {
		// �^�ǭȬ� 0 �N��ϥΪ̤��O��� Cancel
		if (jfc.showOpenDialog(this) == 0) {
			tfIn[i - 1].setText(jfc.getSelectedFile().toString());
		}
	}

	// ��ܶ}���ɮ׹�ܤ��,�ñN�ҿ�����ɮצW�٩�J JTextField tf3 ��
	void selectOutFile() {
		// �^�ǭȬ� 0 �N��ϥΪ̤��O��� Cancel
		if (jfc.showOpenDialog(this) == 0) {
			tf3.setText(jfc.getSelectedFile().toString());
		}
	}

	// �i���ɮצX�֪��ʧ@
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
			msg.setText("�ɮצX�֧���");
			tfIn[0].setText("");
			tfIn[1].setText("");
			tf3.setText("");
		} catch (Exception ex) {
			msg.setText("�ɮצX�֨S���\");
		}
	}

	// ����s���ʧ@���X�^��
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bnExit) {
			// �����{��
			dispose();
			System.exit(0);
		} else if (e.getSource() == bnOK) {
			// �i���ɮצX��
			combineFiles();
		} else if (e.getSource() == bn1) {
			// ��ܶ}���ɮ׹�ܤ��,�ñN�ҿ�����ɮצW�٩�J JTextField tf[0] ��
			selectInFile(1);
		} else if (e.getSource() == bn2) {
			// ��ܶ}���ɮ׹�ܤ��,�ñN�ҿ�����ɮצW�٩�J JTextField tfIn[1] ��
			selectInFile(2);
		} else if (e.getSource() == bn3) {
			// ��ܶ}���ɮ׹�ܤ��,�ñN�ҿ�����ɮצW�٩�J JTextField tf3 ��
			selectOutFile();
		}
	}

	// �Ψ���JFrame�i�H���`����
	class WinListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().dispose();
			System.exit(0);
		}
	}

	// �����s�b�ƹ��i�J�|�ܦ�
	class MouseListen extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			((JButton) e.getSource()).setBackground(Color.yellow);
		}

		public void mouseExited(MouseEvent e) {
			((JButton) e.getSource()).setBackground(new Color(204, 204, 204));
		}
	}
}
