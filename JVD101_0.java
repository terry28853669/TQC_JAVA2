public class JVD101_0 {
	public static void main(String[] args) {
		// 1.�ŧi�@�Ӱ}�C
		int num[] = new int[7];
		int i;
		// 2.�H���]�@�ӼƨçP�_�O�_����
		for (i = 0; i <= 6; i++) {
			num[i] = (int) (Math.random() * 42) + 1;
			//3.��X���G
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