import java.util.*;

public class JVD103_3 {
	public static void main(String[] args) {
		System.out.println("請輸入欲產生的亂數個數:");
		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = (int) (Math.random() * 999) + 1;
		}
		Arrays.sort(num);
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}