class JVD202 {
	public static void main(String args[]) {
		// �b���B�[�W��l�X
		double sumA = 0, sumB = 0;
		System.out.println("�~\tA�Ȧ�սƧQ>\tB�Ȧ�<��Q>");
		System.out.println("-----------------------------");
		for (int i = 1; i < 21; i++) {
			sumA = 1000000 * (Math.pow(1 + 0.05, i));
			sumB = 1000000 * (1 + i * 0.05);
			System.out.println(i + "\t" + Math.round(sumA) + "\t\t"
					+ Math.round(sumB));
		}
	}
}
