//import java.util.Scanner;

import javax.swing.JOptionPane;

public class JVD110_swing {
	static long start; // �}�l�ɶ�
	static long end; // �����ɶ�
//	static Scanner scanner = new Scanner(System.in);
	static int right = 0; // ���T�p��

	public static void main(String args[]) {
		// 1.Ū�J�D�ئܰ}�C
		String items[][] = new String[5][2];
		items[0][0] = "�q��";
		items[0][1] = "Computer";
		items[1][0] = "��Ʈw";
		items[1][1] = "DataBase";
		items[2][0] = "�y�k";
		items[2][1] = "syntax";
		items[3][0] = "�Ǯ�";
		items[3][1] = "School";
		items[4][0] = "����";
		items[4][1] = "Vocation";
		// 2.���o�ɶ��T��
		start = System.currentTimeMillis();
		// 3.�}�l�X�D
//		System.out.println("�бN�D�ت�������J½Ķ���^���r!");
//		System.out.println("��J�^���r���׫�Ы�Enter��G");
//		System.out.println("");
		JOptionPane.showMessageDialog(null, "�бN�D�ت�������J½Ķ���^���r!\n��J�^���r���׫�Ы�Enter��G\n");
		for (int i = 0; i < 5; i++) {
			// �ҡG��0�D_:�q��
//			System.out.println("��" + (i + 1) + "�D_:" + items[i][0]);
			String S = JOptionPane.showInputDialog("��" + (i + 1) + "�D_:" + items[i][0]);
			if (items[i][1].equalsIgnoreCase(S)) { // ���覡�����j�p�g
//				System.out.println("����F\n");
				JOptionPane.showMessageDialog(null,"����F\n");
				right++;
			} else {
//				System.out.println("�����F�I\n���T���׬�:" + items[i][1] + "\n"); //
				JOptionPane.showMessageDialog(null,"�����F�I\n���T���׬�:" + items[i][1] + "\n");
			}
		}
		end = System.currentTimeMillis();
//		System.out.println("�A��O�ɶ���" + (end - start) / 1000 + "��A�b"+ items.length + "�D���A����F" + right + "�D");
		JOptionPane.showMessageDialog(null,"�A��O�ɶ���" + (end - start) / 1000 + "��A�b"+ items.length + "�D���A����F" + right + "�D");
	}
}
