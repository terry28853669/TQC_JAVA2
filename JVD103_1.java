
import java.util.Arrays; //可以使用Array提供的sort方法
import java.util.Scanner;

public class JVD103_1 {
	public static void main(String args[]) {
		boolean flag; // 判斷亂數是否重複
		//1.輸入數字個數
		System.out.println("請輸入要產生之的數字個數:");
		Scanner scanner = new Scanner(System.in);
//		long l1=System.currentTimeMillis();
		int size = Integer.valueOf(scanner.nextLine());
		int n[] = new int[size];
		//2.迴圈產生亂數
		for (int i = 0; i < size; i++) {
			//3.判斷是否重複
			do {
				flag = false;
				n[i] = (int) (Math.random() * 999) + 1;
				// 第一次亂數不用判斷
				if (i != 0) {
					for (int j = 0; j < i; j++) {
						// num[i]目前陣列與num[j]其他陣列值比較
						if (n[i] == n[j]) {
							flag = true;
						}
					}
				}
			} while (flag); // 如果是flag=true即在亂數一次，直到沒有亂數為止
		}
		//4.用Arrays.sort排序
			Arrays.sort(n);
			for (int k = 0; k < size; k++) {
				System.out.print(n[k] + "\t");			
		}
//			System.out.println();
//			System.out.println("耗時："+ (System.currentTimeMillis()-l1)/1000 +"毫秒");
	}
}