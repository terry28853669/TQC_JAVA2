import java.util.Scanner;

public class JVD105_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ��J�C��
		System.out.println("�п�J�C��:");
		int row = scanner.nextInt();
		// ��J���
		System.out.println("�п�J���:");
		int column = scanner.nextInt();

		String num[][] = new String[row][column];
		scanner.nextLine(); // *Ū��\r\n�_�h�|���Ϳ��~
		// 1.Ū�����
		for (int i = 0; i < row; i++) {
			System.out.println("�п�J��:" + i + "�C");
			String str = scanner.nextLine();
			String strArr[] = str.split(" ");
			// 2.���Φr��é��G���}�C��
			for (int j = 0; j < column; j++) {
				// temp�Ȧs�A��Jnum�G���}�C��
				String temp;
				temp = strArr[j];
				num[i][j] = temp;
			}
		}
		// 3.��X���G
		System.out.println("�B�z�᪺�r��:");
		for (int i = 0; i < num[0].length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j][i] + " "); // [j][i]�A�˿�X
			}
			System.out.println(""); // ����
		}
	}
}
