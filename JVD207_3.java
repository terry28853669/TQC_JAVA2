
import java.util.*;

/*
 �q�R�O�C����J���Ӿ�ƨ��x�s�ܰ}�C array_data ���C
 �n�D�G�Ч�X�̤j���Ʀr�B�íp��_�ƪ��ӼƤ΢��ӼƦr���`�M�C
 */
public class JVD207_3 {
	public static void main(String args[]) {
		// 2.�ŧi�_�ƻP�`�M�ܼ�
		int sum = 0, odd = 0;
		// 3.�[�`		
		for (String s : args) {
			sum += Integer.valueOf(s);
			if (1 == Integer.valueOf(s) % 2)
				odd++;			
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
