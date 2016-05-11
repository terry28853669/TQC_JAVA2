//208三角形邊長判斷
public class JVD208 {
	public static void main(String args[]) {
		double a, b, c;
		args = new String[] { "2", "2", "5" };
		// 1.判斷引數是否為3個
		if (args.length == 3) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
			System.out.println(JVD208.check(a, b, c));
		} else {
			// 請在此撰寫判斷三角形錯誤的資訊
			System.out.println("參數數目錯誤：三角形的總邊長應有三個參數");
		}
	}

	static String check(double a, double b, double c) {
		if (a == b && b == c) {
			return ("您所輸入的是一個等邊三角形的邊長資料 !");
		} else if (a * a + b * b == c * c && a == b) {
			return ("您所輸入的是一個等腰直角三角形的邊長資料 !");
		} else if (a + b > c && a == b) {
			return ("您所輸入的是一個等腰三角形的邊長資料 !");
		} else if (a * a + b * b == c * c) {
			return ("您所輸入的是一個直角三角形的邊長資料 !");
		} else if (a * a + b * b < c * c) {
			return ("您所輸入的是一個鈍角三角形的邊長資料 !");
		} else if (a * a + b * b > c * c) {
			return ("您所輸入的是一個銳角三角形的邊長資料 !");
		} else {
			return (" 三角形不存在 !");
		}
	}// end identify
}// end
