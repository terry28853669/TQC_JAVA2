
public class JVD206 {
	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("�޼Ʈ榡����A�Шϥή榡�p�U\n Calc 1+2");
		} else {
			double ans = 0;
			double n = 0;
			double n1 = 2;
			n = Double.valueOf((args[0]));
			n1 = Double.valueOf((args[2]));
			if (args[1].equals("+")) {
				ans = n + n1;
			} else if (args[1].equals("-")) {
				ans = n - n1;
			} else if (args[1].equals("/")) {
				if (n1 == 0) {
					System.out.println("���Ƥ��o��0");
					return;
				}
				ans = n / n1;
			} else if  (args[1].equals("*")) {
				ans = n * n1;
			}
			else{
				System.out.println("�Шϥ� + - * / ���䤤�@���B��Ÿ��I");
			}
			System.out.printf(n+args[1]+n1+"=%.1f", ans);
		}
	}
}