
public class JVD101_1 {
	public static void main(String[] args) {
		// 1.�ŧi�@�Ӱ}�C
		int num[] = new int[7];
		int i;
		boolean flag; // �P�_�üƬO�_����
		// 2.�H���]�@�ӼƨçP�_�O�_����
		for (i = 0; i <= 6; i++) {
			do {
				flag = false;
				num[i] = (int) (Math.random() * 42) + 1;
				// �Ĥ@���üƤ��ΧP�_
				if (i != 0) {
					for (int j = 0; j < i; j++) {
						// num[i]�ثe�}�C�Pnum[j]��L�}�C�Ȥ��
						if (num[i] == num[j]) {
							flag = true;
						}
					}
				}
			} while (flag); // �p�G�Oflag=true�Y�b�üƤ@���A����S���üƬ���
			//4.��X���G
			if (i < 6) {
				System.out.print("��" + (i + 1) + "�Ӹ��X:");
			} else {
				System.out.print("�S�O��:");
			}
			if (num[i] < 10) {
				System.out.println("0" + num[i]);
			} else {
				System.out.println(num[i]);
			}
		}
	}
}