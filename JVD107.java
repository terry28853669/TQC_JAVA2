public class JVD107 {
	public static void main(String args[]) {
		double sum = 0;
		// 1.�[�`�Ҧ��޼�
		for (int i = 1; i < args.length; i++) {
			sum += Double.valueOf(args[i]);
		}
		//2.�̤֨�ӰѼ�
		if (args.length >= 2) {
		// 3.�|�ˤ��J�����k
			if (args[0].equals("0")) {
				System.out.printf("������:%.0f", sum / (args.length - 1));
			} else if (args[0].equals("1")) {
				System.out.printf("������:%.1f", sum / (args.length - 1));
			} else if (args[0].equals("2")) {
				System.out.printf("������:%.2f", sum / (args.length - 1));
			}
		} else {
			System.out.println("�ֻ̤ݿ�J2�ӼƦr");
		}
	}
}