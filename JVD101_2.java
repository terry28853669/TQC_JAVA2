import java.text.DecimalFormat;
public class JVD101_2 {
	public static void main(String[] args) {
		// 1.�ŧi�@�Ӱ}�C
		int num[] = new int[7];
		int a = 0;
		int i;
		// 2.�H���]�@�ӼƨçP�_�O�_����
		for (i = 0; i <= 6; i++) {
			//�����ͤ@�ӼƦr�Ȧs�ba
			a = (int) (Math.random() * 42) + 1;
			//��a�򤧫e���Ʀr���A�p�G�����ƴN���s���Ͷü�
			int j = 0;
			while (j < i) {
				if (num[j] == a) {
					a = (int) (Math.random() * 42) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			//�S���Ƥ~��ȵ��}�C
			num[i] = a;
			// �p�G�Oflag=true�Y�b�üƤ@���A����S���üƬ���
			// 3.��X���G
			DecimalFormat f=new DecimalFormat();
			if (i < 6) {
				System.out.println("��" + (i + 1) + "�Ӹ��X:" + f.format(num[i])) ;
			} else {
				System.out.print("�S�O��:"+ f.format(num[i]));
			}
			
//			if (num[i] < 10) {
//				System.out.println("0" + num[i]);
//			} else {
//				System.out.println(num[i]);
//			}
		}
	}
}