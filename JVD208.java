//208�T��������P�_
public class JVD208 {
	public static void main(String args[]) {
		double a, b, c;
		args = new String[] { "2", "2", "5" };
		// 1.�P�_�޼ƬO�_��3��
		if (args.length == 3) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
			System.out.println(JVD208.check(a, b, c));
		} else {
			// �Цb�����g�P�_�T���ο��~����T
			System.out.println("�ѼƼƥؿ��~�G�T���Ϊ��`��������T�ӰѼ�");
		}
	}

	static String check(double a, double b, double c) {
		if (a == b && b == c) {
			return ("�z�ҿ�J���O�@�ӵ���T���Ϊ������� !");
		} else if (a * a + b * b == c * c && a == b) {
			return ("�z�ҿ�J���O�@�ӵ��y�����T���Ϊ������� !");
		} else if (a + b > c && a == b) {
			return ("�z�ҿ�J���O�@�ӵ��y�T���Ϊ������� !");
		} else if (a * a + b * b == c * c) {
			return ("�z�ҿ�J���O�@�Ӫ����T���Ϊ������� !");
		} else if (a * a + b * b < c * c) {
			return ("�z�ҿ�J���O�@�Ӷw���T���Ϊ������� !");
		} else if (a * a + b * b > c * c) {
			return ("�z�ҿ�J���O�@�ӾU���T���Ϊ������� !");
		} else {
			return (" �T���Τ��s�b !");
		}
	}// end identify
}// end
