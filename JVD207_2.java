import java.util.Arrays;

/*
 �q�R�O�C����J���Ӿ�ƨ��x�s�ܰ}�C array_data ���C
 �n�D�G�Ч�X�̤j���Ʀr�B�íp��_�ƪ��ӼƤ΢��ӼƦr���`�M�C
 */
public class JVD207_2 {
	public static void main(String[] args) {
		// 2.�ŧi�_�ƻP�`�M�ܼ�
		int sum = 0, odd = 0;
		// 3.�[�`
		for (int i = 0; i < args.length; i++) {
			if (Integer.valueOf(args[i]) % 2 == 1)
				odd++;
			sum += Integer.valueOf(args[i]);
		}
		// 4.�}�C�ƧǨ���ܵ��G
		Arrays.sort(args);
		System.out.println("�̤j��:" + args[args.length - 1]);
		System.out.println("�_�ƭӼ�:" + odd);
		System.out.println("�Ʀr�`�M:" + sum);
	}
}
/*
 * �̤j��:88 �`�M:429 �_�ƭӼ�:3
 */
