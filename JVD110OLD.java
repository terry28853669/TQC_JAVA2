import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class JVD110OLD {
	String[][] items;
	long start, end;
	Date d;
	static Scanner scanner = new Scanner(System.in);
	static int right = 0; //

	public static void main(String args[]) {
		int total = args.length;
		int pairs = total / 2;
		JVD110 tte = new JVD110();
		if (total != 0 && pairs != 0) {
			tte.items = new String[pairs][2];
			// �Цb�����g�{��
			/********************************************/
			for (int i = 0; i < total; i += 2) {
				try {
					System.out.println("��" + i + "�D_:" + args[i]);
					if (args[i + 1].equalsIgnoreCase(scanner.next().trim())) {
						System.out.println("����F");
						right++;
					} else {
						System.out.println("���T���׬�:" + args[i + 1]);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			tte.start();
		}
		/*********************************************/
	}
	JVD110OLD() {
		items = new String[5][2];
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
	}

	void start() {
		try {
			d = new Date();
			start = d.getTime();
			System.out.println("�бN�D�ت�������J½Ķ���^���r!");
			System.out.println("��J�^���r���׫�Ы�Enter��G");
			System.out.println("           ");
			// �Цb�����g�{��
			/******************************************************/
			for (int i = 0; i < 5; i++) {
				System.out.println("��" + i + "�D_:" + items[i][0]);
				if (items[i][1].equalsIgnoreCase(scanner.next())) {
					System.out.println("����F");
					right++;
				} else {
					System.out.println("���T���׬�:" + items[i][1]);
				}
			}
			/******************************************************/
			d = new Date();
			end = d.getTime();
			// �Цb�����g�{��
			System.out.println("�A����F" + right + "�D�A��O�ɶ���"
					+ ((end - start) / 1000) + "��"); // �٦��o��
			// �ФW�輶�g�{��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end start;
}
