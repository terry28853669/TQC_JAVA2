
import java.util.Arrays; //�i�H�ϥ�Array���Ѫ�sort��k
import java.util.Scanner;

public class JVD103_1 {
	public static void main(String args[]) {
		boolean flag; // �P�_�üƬO�_����
		//1.��J�Ʀr�Ӽ�
		System.out.println("�п�J�n���ͤ����Ʀr�Ӽ�:");
		Scanner scanner = new Scanner(System.in);
//		long l1=System.currentTimeMillis();
		int size = Integer.valueOf(scanner.nextLine());
		int n[] = new int[size];
		//2.�j�鲣�Ͷü�
		for (int i = 0; i < size; i++) {
			//3.�P�_�O�_����
			do {
				flag = false;
				n[i] = (int) (Math.random() * 999) + 1;
				// �Ĥ@���üƤ��ΧP�_
				if (i != 0) {
					for (int j = 0; j < i; j++) {
						// num[i]�ثe�}�C�Pnum[j]��L�}�C�Ȥ��
						if (n[i] == n[j]) {
							flag = true;
						}
					}
				}
			} while (flag); // �p�G�Oflag=true�Y�b�üƤ@���A����S���üƬ���
		}
		//4.��Arrays.sort�Ƨ�
			Arrays.sort(n);
			for (int k = 0; k < size; k++) {
				System.out.print(n[k] + "\t");			
		}
//			System.out.println();
//			System.out.println("�ӮɡG"+ (System.currentTimeMillis()-l1)/1000 +"�@��");
	}
}