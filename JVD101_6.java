public class JVD101_6 {
	public static void main(String args[]) {
		String args1[] = new String[43];
		for (int i = 1; i < args1.length; i++) {
			args1[i] = String.valueOf(i);
			if (i < 10)
				args1[i] = "0" + args1[i];
		}

		for (int j = 1; j < args1.length; j++) {
			int l = (int) (Math.random() * 43D);
			args1[0] = args1[j];
			args1[j] = args1[l];
			args1[l] = args1[0];
		}

		for (int k = 1; k < 7; k++)
			System.out.println("\u7B2C" + k + "\u500B\u865F\u78BC:" + args1[k]);

		System.out.println("\u7279\u5225\u865F:" + args1[7]);
	}
}