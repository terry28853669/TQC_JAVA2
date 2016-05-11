import java.util.*;

public class JVD105_2 {
	public static void main(String[] args) {
		System.out.println("請輸入陣列列數");
		Scanner keyin = new Scanner(System.in);
		int m = keyin.nextInt();
		System.out.println("每一列陣列裡要幾個數子?");
		int n = keyin.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[n][m];
		for (int i = 0; i < m; i++) {
			System.out.println("請輸入第" + i + "列");
			for (int j = 0; j < n; j++) {
				a[i][j] = keyin.nextInt();// 原本的m*n
				b[j][i] = a[i][j]; // 轉換為*n*m
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