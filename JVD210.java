//210 �r���j�M��
import java.util.Scanner;
public class JVD210 {
	// �P�_�O�_���

	public static void main(String args[]) {
		// 1.�ŧi��쪺��m�P�}�l�j�M����m=0
		// ��쪺�Ӽ�
		int findIt = 0;
		// ��쪺��m
		int index = 0;
		// �q���̶}�l��A���N���U��index+����r����
		int be = 0;
		System.out.println("�п�J�r��");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); // Ū�J�@��
		System.out.println("�п�J�n�j�M���r���Φr��:");
		String str1 = s.nextLine(); // Ū�J�r��

		do {
			index = str.indexOf(str1, be); // �bstr������be�Ӧr���M��str1
			if (index != -1) {
				findIt += 1;
				if (findIt == 1) {
					System.out.println("�ĴX�Ӧ�m���F");
				}
				System.out.println(index + 1);
				be = index + str1.length();

			}
		} while (index != -1);
		if (findIt == 0)
			System.out.println("�r�����b�r�ꤤ");
	}
}
