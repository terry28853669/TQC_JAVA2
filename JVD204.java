import java.util.Arrays;
public class JVD204 {
	public static void main(String[] args) {
		int sum = 0;  //�ŧi�[�`
		int big60 = 0;  //�ŧi�ή�
		//1.��J�޼ƭ�
		int n = args.length;
		//2.�N�r���ഫ���ƭ�,�çP�_�O�_�ή�
		for (String str : args) {
			int x = Integer.valueOf(str);
			if (x >= 60) {
				big60++;
			}
			sum += x;
		}
		//3.�Ƨ�
		Arrays.sort(args);
		System.out.println("===�V�鸪�p�Z�����ҭ����]===");
		System.out.println("���Z�̰���:" + args[n - 1]);
		System.out.println("���Z�̧C��:" + args[0]);
		System.out.println("���Z�ή�H��:" + big60 +"�H60���H�W");
		System.out.printf("���Z�������`�����O�G%.2f",(float) sum/n);
	}
}