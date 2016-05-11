import java.util.Arrays;
public class JVD204_2 {
	public static void main(String[] args) {
		int sum=0;
		int big60=0;
		for (String str:args){
			int x=Integer.valueOf(str);
			if (x>=60){
				big60++;
			}
			sum+=x;
		}
		int n=args.length;
		Arrays.sort(args);
		System.out.println("===向日葵小班期末考風雲榜===");
		System.out.println("本班最高分:" + args[n - 1]);
		System.out.println("本班最低分:" + args[0]);
		System.out.println("本班及格人數:" + big60 +"人60分以上");
		System.out.print("本班期末考總平均是：");
		System.out.printf("%.6f",(float) sum/n);		
	}
}
