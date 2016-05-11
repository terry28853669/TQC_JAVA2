
import java.util.*;

public class JVD103_2 {
	public static void main(String[] args) {
		System.out.println("請輸入欲產生的亂數個數:");
		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = (int) (Math.random() * 1000) + 1;
			//用氣泡排序法排序
			int j = 0;
			//1.第一次不用排序
			while (j < i) {
				//2.當前面比後面的大
				if (num[j] > num[j + 1]) {
					//3重新排列，把大的值丟給tmp，再把小的值移到大的，再把tmp移到小的位置
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
					j = 0;//歸零重排
				} else {
					j++;//繼續比較
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}