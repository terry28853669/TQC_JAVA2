
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JVD308 extends JFrame {
	private JRadioButton button[][] = new JRadioButton[4][3]; // new�X12��JRadioButton
	private ButtonGroup radiogroup[] = new ButtonGroup[4]; // new�X4��ButtonGroup
	private RadioButtonHandler handler[] = new RadioButtonHandler[4]; // new�X4��RadioButtonGroup
	private JTextArea note; // new�X1��JTextArea
	private JPanel innerpanel, outerpanel, artistpanel; // �гy�X���panel
	private JLabel bestlabel, showcommentlabel; // new�X2��JLabel
	private String character[][] = { { "�����}", "�P�N��", "�i����", "0" }, // �k���H���W�r
			{ "�ˤߦa�K", "�Y�L���", "��", "1" }, // �����}�۹L���T���q
			{ "��,�ڦ^�ӤF", "���I��", "�w�R", "2" }, // �P�N�۰۹L���T���q
			{ "���", "May I Love You", "����I��", "3" } }; // �i�����۹L���T���q
	private String songinfo[][] = {
			{ "�o���O�i�ˤߦa�K�j\n\n���ֵ���:����������", "�o���O�i�Y�L��ơj\n\n���ֵ���:����������",
					"�o���O�i���j\n\n���ֵ���:����������" },
			{ "�o���O�i���A�ڦ^�ӤF�j\n\n���ֵ���:����������", "�o���O�i���I�ҡj\n\n���ֵ���:����������",
					"�o���O�i�w�R�j\n\n���ֵ���:����������" },
			{ "�o���O�i��ߡj\n\n���ֵ���:����������", "�o���O�iMay I Love You�j\n\n���ֵ���:����������",
					"�o���O�i����I��j\n\n���ֵ���:����������" } };
	static int choice = 1; // switch case����

	public JVD308() {
		super("���H���ֵ���");
		Container container = getContentPane(); // �s�W�@��container
		// �]�w��GridLayout
		innerpanel = new JPanel(new GridLayout(3, 1)); // �q��
		outerpanel = new JPanel(new GridLayout(1, 2)); // ��q�����y�T��
		choice();
		outerpanel.add(innerpanel); // ��innerpanel�[�Jouterpanel��
		note = new JTextArea(); // �s�WJTextArea
		note.setLineWrap(true); // �]�w�۰ʴ���;
		note.setText(songinfo[0][0]);
		note.setEditable(false); // �]�w���i�s��

		Box box = Box.createHorizontalBox();
		box.add(new JScrollPane(note)); // �[�W�@��JScrollPane
		outerpanel.add(box); // �g��Box��textArea��i�houterpanel�i�h
		container.add(outerpanel);
		artistpanel = new JPanel(new GridLayout(1, 3)); // ��q��m�W
		// �I�saddradiobutton�o��method�A��J���Ѽƫ��A�O( String, JPanel)
		addradiobutton(character[0], artistpanel);
		container.add(artistpanel, BorderLayout.SOUTH); // �]�wartistpanel��BorderLayout��SOUTH

		setSize(300, 200); // �]�w�j�p
		show(); // ��{�X��
	}

	// �o��method�B�z�n�Ҧ�����JRadioButton���Ʊ�!
	public void addradiobutton(String s[], JPanel panel) {
		int temp = Integer.parseInt(s[3]);
		// �s�W3��JRadioButton
		button[temp][0] = new JRadioButton(s[0], true);
		panel.add(button[temp][0]);

		button[temp][1] = new JRadioButton(s[1], false);
		panel.add(button[temp][1]);

		button[temp][2] = new JRadioButton(s[2], false);
		panel.add(button[temp][2]);
		// ��JRadioButton�[�i�hhandler�̭�

		handler[temp] = new RadioButtonHandler();
		for (int count = 0; count < button[temp].length; count++)
			button[temp][count].addItemListener(handler[temp]);
		// �M��A�]���P�@��ButtonGroup
		radiogroup[temp] = new ButtonGroup();
		for (int count = 0; count < button[temp].length; count++)
			radiogroup[temp].add(button[temp][count]);
	}

	public void choice() {
		innerpanel.removeAll(); // �N�Ҧ�innerpanel�̪�(�q��)���󲾰���
		// ��switch case�ӧP�w�T�ӤH�Ұ۪��T���q
		switch (choice) {
		case 1: {
			addradiobutton(character[1], innerpanel); // character[1]�O���}���q��A�ç�pannel�[�J
		}
			break;

		case 2: {
			addradiobutton(character[2], innerpanel); // character[2]�O�P�N�۪��q��A�ç�pannel�[�J
		}
			break;

		case 3: {
			addradiobutton(character[3], innerpanel); // character[3]�O�i�������q��A�ç�pannel�[�J
		}
			break;

		default:
		}
		innerpanel.validate(); // ���s�[�Jinnerpanel�̪�����X�{
	}

	public static void main(String args[]) {
		JFrame.setDefaultLookAndFeelDecorated(true); // �����JFrame�ݰ_�Ӧn��
		JVD308 newartist = new JVD308(); // new�X�@��artist������
		newartist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �]�w����
	}

	// �B�zRadioButton���ƥ�
	private class RadioButtonHandler implements ItemListener {
		public void itemStateChanged(ItemEvent itemevent) {
			//���I�鷺�e�����H�m�W
			if (itemevent.getSource() == button[0][0]) {
				JVD308.choice = 1;
				choice();
				note.setText(songinfo[0][0]);
			} else if (itemevent.getSource() == button[0][1]) {
				JVD308.choice = 2;
				choice();
				note.setText(songinfo[1][0]);
			
			} else if (itemevent.getSource() == button[0][2]) {
				JVD308.choice = 3;
				choice();
				note.setText(songinfo[2][0]);
			}
			//���I�鷺�e�����}���q
			if (itemevent.getSource() == button[1][0])
				note.setText(songinfo[0][0]);
			else if (itemevent.getSource() == button[1][1])
				note.setText(songinfo[0][1]);
			else if (itemevent.getSource() == button[1][2])
				note.setText(songinfo[0][2]);
			//���I�鷺�e���P�N�۪��q
			if (itemevent.getSource() == button[2][0])
				note.setText(songinfo[1][0]);
			else if (itemevent.getSource() == button[2][1])
				note.setText(songinfo[1][1]);
			else if (itemevent.getSource() == button[2][2])
				note.setText(songinfo[1][2]);
			//���I�鷺�e���i�������q
			if (itemevent.getSource() == button[3][0])
				note.setText(songinfo[2][0]);
			else if (itemevent.getSource() == button[3][1])
				note.setText(songinfo[2][1]);
			else if (itemevent.getSource() == button[3][2])
				note.setText(songinfo[2][2]);
            //�����B�z���e
		}
	}
}


