public class JVD109_2 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100) + 1;
		System.out.println("�H�����ͪ��b�|��:" + a);
		System.out.println();
		System.out.println("�p���,���|��:" + a * 2);
		System.out.println();
		System.out.println("�p���,�ꭱ�n��:" + a * 2 * Math.PI);
		System.out.printf("�|�ˤ��J�ܤp�Ʋ�1��,�h�ꭱ�n��: %.1f", a * 2 * Math.PI);
		System.out.println();
		System.out.println();
		System.out.println("�p���,����n��:" + (a * 4 * Math.PI * 3 / 3));
		System.out.printf("�|�ˤ��J�ܤp�Ʋ�1��,�h�ꭱ�n��: %.1f", a * 4 * Math.PI * 3 / 3);
	}
}
