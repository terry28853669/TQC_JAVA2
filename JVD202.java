class JVD202 {
	public static void main(String args[]) {
		// 在此處加上原始碼
		double sumA = 0, sumB = 0;
		System.out.println("年\tA銀行＜複利>\tB銀行<單利>");
		System.out.println("-----------------------------");
		for (int i = 1; i < 21; i++) {
			sumA = 1000000 * (Math.pow(1 + 0.05, i));
			sumB = 1000000 * (1 + i * 0.05);
			System.out.println(i + "\t" + Math.round(sumA) + "\t\t"
					+ Math.round(sumB));
		}
	}
}
