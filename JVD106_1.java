public class JVD106_1 {
	public static void main(String args[]) {
		int sum = 0; // 1.�[�`
		int j = 0; // 2.��ưO��
		int k = 0; // 3.�D��ưO��
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.valueOf(args[i]);
				j++;
			} catch (Exception e) {
				k++;
			}
		}
		System.out.println("�ƭȤ��`�M��:" + sum);
		System.out.println("�D�ƭȭӼƬ�:" + k);
		System.out.println("�ƭȭӼƬ�:" + j);
	}
}
