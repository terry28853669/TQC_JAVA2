import java.text.DecimalFormat;
public class Double_index {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		double x = 39.6565834;
		String s = String.valueOf(x);
		String s2 = s.substring(s.indexOf(".") + 1, s.length() - s.indexOf(".")
				+ 2);
		DecimalFormat f=new DecimalFormat("0.0");
		System.out.println("點的位置" + s.indexOf("."));
		System.out.println("字串長度" + s.length());
		System.out.println(s2);
		System.out.println("小數點幾位" + s2.length());
	}
}