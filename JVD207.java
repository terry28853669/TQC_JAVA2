import java.util.Arrays;
public class JVD207 {
	public static void main(String[] args) {
		//1.块5ま计
		//2.计籔羆㎝跑计
		int odd = 0;
		int sum = 0;
		//3.羆
		for (String str : args) {
			int n = Integer.valueOf(str);
			sum += n;
			if (n % 2 == 1) {
				odd++; }
		}
		//4.皚逼陪ボ挡狦
		Arrays.sort(args);
		System.out.println("程:" + args[args.length - 1]);		
		System.out.println("计计:" + odd);
		System.out.println("计羆㎝:" + sum);
	}
}
