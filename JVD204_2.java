import java.util.Arrays;
public class JVD204_2 {
	public static void main(String[] args) {
		int sum=0;
		int big60=0;
		for (String str:args){
			int x=Integer.valueOf(str);
			if (x>=60){
				big60++;
			}
			sum+=x;
		}
		int n=args.length;
		Arrays.sort(args);
		System.out.println("===�V�鸪�p�Z�����ҭ����]===");
		System.out.println("���Z�̰���:" + args[n - 1]);
		System.out.println("���Z�̧C��:" + args[0]);
		System.out.println("���Z�ή�H��:" + big60 +"�H60���H�W");
		System.out.print("���Z�������`�����O�G");
		System.out.printf("%.6f",(float) sum/n);		
	}
}
