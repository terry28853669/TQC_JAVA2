public class JVD101_0 {
	public static void main(String[] args) {
		// 1.宣告一個陣列
		int num[] = new int[7];
		int i;
		// 2.隨機跑一個數並判斷是否重複
		for (i = 0; i <= 6; i++) {
			num[i] = (int) (Math.random() * 42) + 1;
			//3.輸出結果
			if (i < 6) {
				System.out.print("第" + (i + 1) + "個號碼:");
			} else {
				System.out.print("特別號:");
			}
			if (num[i] < 10) {
				System.out.println("0" + num[i]);
			} else {
				System.out.println(num[i]);
			}
		}
	}
}