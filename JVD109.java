import java.text.DecimalFormat;
public class JVD109 {
	public static void main(String args[]) {
		int a = (int) (Math.random() * 100) + 1;
		//�b�|
		System.out.println("�H�����ͪ��b�|��:" + a);
		System.out.println();
		//1.���|
		System.out.println("�p��᪺���|:" + (2 * a));
		//2.���n
		double b = Math.PI * Math.pow(a, 2); // �i��Math�̭�����k�N���AMath.PI
		//3.��n
		double c = 4 * Math.PI * Math.pow(a, 3) / 3;
		System.out.println();
		System.out.println("�p���,�ꭱ�n��:" + b);
		//.1���p���I��@��i��
		DecimalFormat f=new DecimalFormat("0.0");
//		System.out.printf("�|�ˤ��J�ܤp�Ʋ�1��,�h�ꭱ�n��:%.1f", b); 
		System.out.println("�|�ˤ��J�ܤp�Ʋ�1��,�h�ꭱ�n��:" +f.format(b));
		System.out.println("�L����i��,�h�ꭱ�n��:" +(int) Math.rint(b));
		System.out.println("�L����˥h�p���I,�h�ꭱ�n��:" +(int) Math.floor(b));
		System.out.println();
		System.out.println();
		System.out.printf("�p���,����n��:" + c);
		System.out.println();
		System.out.printf("�|�ˤ��J�ܤp�Ʋ�1��,�h�ꭱ�n��:%.1f", c);
		System.out.println();
		System.out.println(f.format(Math.PI));
	}
}