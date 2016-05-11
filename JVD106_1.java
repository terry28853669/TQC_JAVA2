public class JVD106_1 {
	public static void main(String args[]) {
		int sum = 0; // 1.羆
		int j = 0; // 2.俱计癘计
		int k = 0; // 3.獶俱计癘计
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.valueOf(args[i]);
				j++;
			} catch (Exception e) {
				k++;
			}
		}
		System.out.println("计ぇ羆㎝:" + sum);
		System.out.println("獶计计:" + k);
		System.out.println("计计:" + j);
	}
}
