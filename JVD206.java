
public class JVD206 {
	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("引數格式不對，請使用格式如下\n Calc 1+2");
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
					System.out.println("除數不得為0");
					return;
				}
				ans = n / n1;
			} else if  (args[1].equals("*")) {
				ans = n * n1;
			}
			else{
				System.out.println("請使用 + - * / 的其中一中運算符號！");
			}
			System.out.printf(n+args[1]+n1+"=%.1f", ans);
		}
	}
}