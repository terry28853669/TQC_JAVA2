
import java.util.*;

/*
 眖㏑い块⒋俱计纗皚 array_data い
 璶―叫т程计璸衡计计の⒋计羆㎝
 */
public class JVD207_3 {
	public static void main(String args[]) {
		// 2.计籔羆㎝跑计
		int sum = 0, odd = 0;
		// 3.羆		
		for (String s : args) {
			sum += Integer.valueOf(s);
			if (1 == Integer.valueOf(s) % 2)
				odd++;			
		}
		// 4.皚逼陪ボ挡狦
		Arrays.sort(args);
		System.out.println("程:" + args[args.length - 1]);
		System.out.println("计计:" + odd);
		System.out.println("计羆㎝:" + sum);
	}
}
/*
 * 程:88 羆㎝:429 计计:3
 */
