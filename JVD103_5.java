import java.util.Arrays; //可以使用Array提供的sort方法
import java.util.Scanner;

public class JVD103_5 {
	public static void main(String args[]) {
		// 1.輸入數字個數
		System.out.println("請輸入要產生之的數字個數:");
		Scanner scanner = new Scanner(System.in);
		int size = Integer.valueOf(scanner.nextLine());
		int n[] = new int[size];
		// 2.迴圈產生亂數
		for (int i = 0; i < size; i++) {
			// 3.判斷是否重複
			int a = (int) (Math.random() * 999) +1;
			//把a跟之前的數字比對，如果有重複就重新產生亂數
			int j = 0;
			while (j < i) {
				if (n[j] == a) {
					a = (int) (Math.random() * 999) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			//沒重複才把值給陣列
			n[i] = a;
			// 把a跟之前的數字比對，如果有重複就重新產生亂數 }
			// 4.用Arrays.sort排序
		}
		Arrays.sort(n);
		for (int k = 0; k < size; k++) {
			System.out.print(n[k] + "\t");

		}
	}
}