import java.text.DecimalFormat;
public class Double_index {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		double x = 39.6565834;
		String s = String.valueOf(x);
		String s2 = s.substring(s.indexOf(".") + 1, s.length() - s.indexOf(".")
				+ 2);
		DecimalFormat f=new DecimalFormat("0.0");
		System.out.println("�I����m" + s.indexOf("."));
		System.out.println("�r�����" + s.length());
		System.out.println(s2);
		System.out.println("�p���I�X��" + s2.length());
	}
}