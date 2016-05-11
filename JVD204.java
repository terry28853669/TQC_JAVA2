import java.util.Arrays;
public class JVD204 {
	public static void main(String[] args) {
		int sum = 0;  //宣告加總
		int big60 = 0;  //宣告及格
		//1.輸入引數值
		int n = args.length;
		//2.將字串轉換為數值,並判斷是否及格
		for (String str : args) {
			int x = Integer.valueOf(str);
			if (x >= 60) {
				big60++;
			}
			sum += x;
		}
		//3.排序
		Arrays.sort(args);
		System.out.println("===向日葵小班期末考風雲榜===");
		System.out.println("本班最高分:" + args[n - 1]);
		System.out.println("本班最低分:" + args[0]);
		System.out.println("本班及格人數:" + big60 +"人60分以上");
		System.out.printf("本班期末考總平均是：%.2f",(float) sum/n);
	}
}