import java.util.Arrays; //�i�H�ϥ�Array���Ѫ�sort��k
import java.util.Scanner;

public class JVD103_5 {
	public static void main(String args[]) {
		// 1.��J�Ʀr�Ӽ�
		System.out.println("�п�J�n���ͤ����Ʀr�Ӽ�:");
		Scanner scanner = new Scanner(System.in);
		int size = Integer.valueOf(scanner.nextLine());
		int n[] = new int[size];
		// 2.�j�鲣�Ͷü�
		for (int i = 0; i < size; i++) {
			// 3.�P�_�O�_����
			int a = (int) (Math.random() * 999) +1;
			//��a�򤧫e���Ʀr���A�p�G�����ƴN���s���Ͷü�
			int j = 0;
			while (j < i) {
				if (n[j] == a) {
					a = (int) (Math.random() * 999) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			//�S���Ƥ~��ȵ��}�C
			n[i] = a;
			// ��a�򤧫e���Ʀr���A�p�G�����ƴN���s���Ͷü� }
			// 4.��Arrays.sort�Ƨ�
		}
		Arrays.sort(n);
		for (int k = 0; k < size; k++) {
			System.out.print(n[k] + "\t");

		}
	}
}