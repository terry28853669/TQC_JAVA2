import java.util.*;

public class JVD105_2 {
	public static void main(String[] args) {
		System.out.println("�п�J�}�C�C��");
		Scanner keyin = new Scanner(System.in);
		int m = keyin.nextInt();
		System.out.println("�C�@�C�}�C�̭n�X�ӼƤl?");
		int n = keyin.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[n][m];
		for (int i = 0; i < m; i++) {
			System.out.println("�п�J��" + i + "�C");
			for (int j = 0; j < n; j++) {
				a[i][j] = keyin.nextInt();// �쥻��m*n
				b[j][i] = a[i][j]; // �ഫ��*n*m
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
	}
}