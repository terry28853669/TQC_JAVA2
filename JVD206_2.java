
public class JVD206_2 {
	public static void main(String args[]) {
		//1.�P�_�޼ƬO�_��3�ӡA�Y�_�h��ܿ��~�T��
		if (args.length != 3) {
			System.out.println("�޼Ʈ榡����A�Шϥή榡�p�U\n Calc 1+2");
		//2.�Ϥ��A�ŧi3���ܼƱ��޼�
		} else {
			double ans = 0;
			double n = 0;
			double n1 = 0;
			n = Double.valueOf((args[0]));
			n1 = Double.valueOf((args[2]));
			
			//3.��if&else if�P�_+�B-�B*�B/
			if (args[1].equals("+")) {
				ans = n + n1;
			} else if (args[1].equals("-")) {
				ans = n - n1;
			} else if (args[1].equals("/")) {
				if (n1 == 0) {
					System.out.println("���Ƥ��o��0");
					System.exit(0);
				}
				ans = n / n1;
			} else if  (args[1].equalsIgnoreCase("x")) {
				ans = n * n1;
			}
			else{
				System.out.println("�Шϥ� + - * / ���䤤�@���B��Ÿ��I");
			}
			System.out.printf(n+args[1]+n1+"=%.1f", ans);
		}
		
	}
}