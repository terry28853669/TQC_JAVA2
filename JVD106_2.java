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
		System.out.println("�ƭȤ��`�M��:" + sum);
		System.out.println("�D�ƭȭӼƬ�:" + k);
		System.out.println("�ƭȭӼƬ�:" + j);
	}
}