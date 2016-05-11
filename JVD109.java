import java.text.DecimalFormat;
public class JVD109 {
	public static void main(String args[]) {
		int a = (int) (Math.random() * 100) + 1;
		//半徑
		System.out.println("隨機產生的半徑為:" + a);
		System.out.println();
		//1.直徑
		System.out.println("計算後的直徑:" + (2 * a));
		//2.面積
		double b = Math.PI * Math.pow(a, 2); // 可用Math裡面的方法代替，Math.PI
		//3.體積
		double c = 4 * Math.PI * Math.pow(a, 3) / 3;
		System.out.println();
		System.out.println("計算後,圓面積為:" + b);
		//.1指小數點後一位進位
		DecimalFormat f=new DecimalFormat("0.0");
//		System.out.printf("四捨五入至小數第1位,則圓面積為:%.1f", b); 
		System.out.println("四捨五入至小數第1位,則圓面積為:" +f.format(b));
		System.out.println("無條件進位,則圓面積為:" +(int) Math.rint(b));
		System.out.println("無條件捨去小數點,則圓面積為:" +(int) Math.floor(b));
		System.out.println();
		System.out.println();
		System.out.printf("計算後,圓體積為:" + c);
		System.out.println();
		System.out.printf("四捨五入至小數第1位,則圓面積為:%.1f", c);
		System.out.println();
		System.out.println(f.format(Math.PI));
	}
}