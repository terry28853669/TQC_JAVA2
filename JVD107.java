public class JVD107 {
	public static void main(String args[]) {
		double sum = 0;
		// 1.羆┮Τま计
		for (int i = 1; i < args.length; i++) {
			sum += Double.valueOf(args[i]);
		}
		//2.程ぶㄢ把计
		if (args.length >= 2) {
		// 3.彼き暗猭
			if (args[0].equals("0")) {
				System.out.printf("キА:%.0f", sum / (args.length - 1));
			} else if (args[0].equals("1")) {
				System.out.printf("キА:%.1f", sum / (args.length - 1));
			} else if (args[0].equals("2")) {
				System.out.printf("キА:%.2f", sum / (args.length - 1));
			}
		} else {
			System.out.println("程ぶ惠块2计");
		}
	}
}