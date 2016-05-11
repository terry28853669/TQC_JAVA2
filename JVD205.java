import java.util.Scanner;
class JVD205 {
	public static void main(String[] args){
		System.out.println("輸入兩個數字 x 和 y, 以逗號分隔: ");
		// 請在此建立輸入物件，並讀取從鍵盤輸入的資料。
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.next().split(",");
		float x = Float.valueOf(str[0]);
		float y = Float.valueOf(str[1]);
		System.out.println("小於或等於 x 的最大整數為:  " + Math.floor(x));
		// 請在此寫出程式碼以取得小於或等於 x 的最大整數。
		System.out.println("大於或等於 x 的最小整數為:  " + Math.ceil(x));
		// 請在此寫出程式碼以取得大於或等於 x 的最小整數。
		System.out.println("最接近 x 的整數為:  " + Math.rint(x));
		// 請在此寫出程式碼以取得最接近 x 的整數。
		System.out.println("x的四捨五入值為:  " + Math.round(x));
		// 請在此寫出程式碼以取得x的四捨五入值
		System.out.println("x 的平方根 = " + Math.pow(x, 1/2.0));
		//System.out.println("x 的平方根 = " + Math.sqrt(x));
		// 請在此寫出程式碼以算出x 的平方根。
		System.out.println("x 的立方根 = " + Math.pow(x, 1/3.0));
		// 請在此寫出程式碼以算出x 的立方根。
		System.out.println("x 與 y 兩者中較大的數 = " + Math.max(x, y));
		// 請在此寫出程式碼以取得 x 與 y 兩者中較大的數,
		// 限使用Math所提供的方法。
		System.out.println("x 的 y 次方 = " + Math.pow(x, y));
		// 請在此寫出程式碼以算出x 的 y 次方。

	}
}
