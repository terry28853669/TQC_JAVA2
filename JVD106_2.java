public class JVD106_2 {
	public static void main(String[] args) {
		int sum = 0, j = 0, k = 0;
		try {
			for (int i = 0; i <= args.length; i++) {
				sum += Integer.valueOf(args[i]);
				j++;
			}
		} catch (Exception e) {
			k++;
		}
		System.out.println("计ぇ羆㎝:" + sum);
		System.out.println("獶计计:" + k);
		System.out.println("计计:" + j);
	}
}