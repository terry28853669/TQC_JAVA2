
public class JVD101_1 {
	public static void main(String[] args) {
		// 1.宣告一個陣列
		int num[] = new int[7];
		int i;
		boolean flag; // 判斷亂數是否重複
		// 2.隨機跑一個數並判斷是否重複
		for (i = 0; i <= 6; i++) {
			do {
				flag = false;
				num[i] = (int) (Math.random() * 42) + 1;
				// 第一次亂數不用判斷
				if (i != 0) {
					for (int j = 0; j < i; j++) {
						// num[i]目前陣列與num[j]其他陣列值比較
						if (num[i] == num[j]) {
							flag = true;
						}
					}
				}
			} while (flag); // 如果是flag=true即在亂數一次，直到沒有亂數為止
			//4.輸出結果
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