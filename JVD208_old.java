//208三角形邊長判斷
public class JVD208_old {
	public static void main(String args[]) {
		double a, b, c;
		// 1.判斷引數是否為3個
		if (args.length == 3) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
			//2.等邊三角形
			if (a == b && b == c) {
				System.out.println("您所輸入的是一個等邊三角形的邊長資料 !");
				//等腰直角三角形
			} else if (a * a + b * b == c * c && a == b) {
				System.out.println("您所輸入的是一個等腰直角三角形的邊長資料 !");
				//等腰三角形
			} else if (a + b > c && a == b) {
				System.out.println("您所輸入的是一個等腰三角形的邊長資料 !");
				//直角三角形
			} else if (a * a + b * b == c * c) {
				System.out.println("您所輸入的是一個直角三角形的邊長資料 !");
				//鈍角三角形
			} else if (a * a + b * b < c * c) {
				System.out.println("您所輸入的是一個鈍角三角形的邊長資料 !");
				//銳角三角形
			} else if (a * a + b * b > c * c) {
				System.out.println("您所輸入的是一個的邊長資料 !");
				//三角形不存在
			} else {
				System.out.println(" 三角形不存在 !");
			}
		} else {
			// 請在此撰寫判斷三角形錯誤的資訊
			System.out.println("參數數目錯誤：三角形的總邊長應有三個參數");
		}
	}
}// end
