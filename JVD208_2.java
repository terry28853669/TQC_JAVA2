//208�T��������P�_
public class JVD208_2 {
	public static void main(String args[]) {
		double a, b, c;
		// 1.�P�_�޼ƬO�_��3��
		if (args.length == 3) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
			//2.����T����
			if (a == b && b == c) {
				System.out.println("�z�ҿ�J���O�@�ӵ���T���Ϊ������� !");
				//���y�����T����
			} else if (a * a + b * b == c * c && a == b) {
				System.out.println("�z�ҿ�J���O�@�ӵ��y�����T���Ϊ������� !");
				//���y�T����
			} else if (a + b > c && a == b) {
				System.out.println("�z�ҿ�J���O�@�ӵ��y�T���Ϊ������� !");
				//�����T����
			} else if (a * a + b * b == c * c) {
				System.out.println("�z�ҿ�J���O�@�Ӫ����T���Ϊ������� !");
				//�w���T����
			} else if (a * a + b * b < c * c) {
				System.out.println("�z�ҿ�J���O�@�Ӷw���T���Ϊ������� !");
				//�U���T����
			} else if (a * a + b * b > c * c) {
				System.out.println("�z�ҿ�J���O�@�Ӫ������� !");
				//�T���Τ��s�b
			} else {
				System.out.println(" �T���Τ��s�b !");
			}
		} else {
			// �Цb�����g�P�_�T���ο��~����T
			System.out.println("�ѼƼƥؿ��~�G�T���Ϊ��`��������T�ӰѼ�");
		}
	}
}// end
