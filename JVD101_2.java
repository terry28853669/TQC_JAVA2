import java.text.DecimalFormat;
public class JVD101_2 {
	public static void main(String[] args) {
		// 1.宣告一個陣列
		int num[] = new int[7];
		int a = 0;
		int i;
		// 2.隨機跑一個數並判斷是否重複
		for (i = 0; i <= 6; i++) {
			//先產生一個數字暫存在a
			a = (int) (Math.random() * 42) + 1;
			//把a跟之前的數字比對，如果有重複就重新產生亂數
			int j = 0;
			while (j < i) {
				if (num[j] == a) {
					a = (int) (Math.random() * 42) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			//沒重複才把值給陣列
			num[i] = a;
			// 如果是flag=true即在亂數一次，直到沒有亂數為止
			// 3.輸出結果
			DecimalFormat f=new DecimalFormat();
			if (i < 6) {
				System.out.println("第" + (i + 1) + "個號碼:" + f.format(num[i])) ;
			} else {
				System.out.print("特別號:"+ f.format(num[i]));
			}
			
//			if (num[i] < 10) {
//				System.out.println("0" + num[i]);
//			} else {
//				System.out.println(num[i]);
//			}
		}
	}
}