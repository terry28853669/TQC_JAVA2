import java.util.Scanner;

public class JVD110_02 {
	static long start; // �}�l�ɶ�
	static long end; // �����ɶ�
	static Scanner scanner = new Scanner(System.in);
	static int right = 0; // ���T�p��

	public static void main(String args[]) {
		// 1.�}�l�X�D
		System.out.println("�бN�D�ت�������J½Ķ���^���r!");
		System.out.println("��J�^���r���׫�Ы�Enter��G");
		System.out.println("");
		int total = args.length;
		int pairs = total / 2;
		// JVD110_ tte = new JVD110();
		if (total != 0 && pairs != 0) {
			// String items[][] = new String[pairs][2];
			start = System.currentTimeMillis();
			for (int i = 0; i < total; i += 2) {
				System.out.println("��" + (i / 2 + 1) + "�D_:" + args[i]);
				if (args[i + 1].equalsIgnoreCase(scanner.next())) {
					System.out.println("����F");
					System.out.println();
					right++;

				} else {
					System.out.println("���T���׬�:" + args[i + 1]);
					System.out.println();
				}
			}
			end = System.currentTimeMillis();
			System.out.println("�A��O�ɶ���" + (end - start) / 1000 + "��A�b"
					+ args.length/2 + "�D���A����F" + right + "�D");
		} else {
			// 2.Ū�J�D�ئܰ}�C
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
			// 3.���o�ɶ��T��
			start = System.currentTimeMillis();

			for (int i = 0; i < 5; i++) {
				// �ҡG��0�D_:�q��
				System.out.println("��" + i + "�D_:" + items[i][0]);
				if (items[i][1].equalsIgnoreCase(scanner.next())) { // ���覡�����j�p�g
					System.out.println("����F\n");
					right++;
				} else {
					System.out.println("�����F�I\n���T���׬�:" + items[i][1] + "\n"); //
				}
			}
			end = System.currentTimeMillis();
			System.out.println("�A��O�ɶ���" + (end - start) / 1000 + "��A�b"
					+ items.length + "�D���A����F" + right + "�D");
		}
	}
}
