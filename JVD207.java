import java.util.Arrays;
public class JVD207 {
	public static void main(String[] args) {
		//1.��J5�Ӥ޼�
		//2.�ŧi�_�ƻP�`�M�ܼ�
		int odd = 0;
		int sum = 0;
		//3.�[�`
		for (String str : args) {
			int n = Integer.valueOf(str);
			sum += n;
			if (n % 2 == 1) {
				odd++; }
		}
		//4.�}�C�ƧǨ���ܵ��G
		Arrays.sort(args);
		System.out.println("�̤j��:" + args[args.length - 1]);		
		System.out.println("�_�ƭӼ�:" + odd);
		System.out.println("�Ʀr�`�M:" + sum);
	}
}
