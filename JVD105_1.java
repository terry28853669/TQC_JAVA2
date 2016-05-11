import java.util.Scanner;

public class JVD105_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 輸入列數
		System.out.println("請輸入列數:");
		int row = scanner.nextInt();
		// 輸入欄數
		System.out.println("請輸入欄數:");
		int column = scanner.nextInt();

		String num[][] = new String[row][column];
		scanner.nextLine(); // *讀取\r\n否則會產生錯誤
		// 1.讀取資料
		for (int i = 0; i < row; i++) {
			System.out.println("請輸入第:" + i + "列");
			String str = scanner.nextLine();
			String strArr[] = str.split(" ");
			// 2.切割字串並放到二維陣列中
			for (int j = 0; j < column; j++) {
				// temp暫存再放入num二維陣列中
				String temp;
				temp = strArr[j];
				num[i][j] = temp;
			}
		}
		// 3.輸出結果
		System.out.println("處理後的字串:");
		for (int i = 0; i < num[0].length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j][i] + " "); // [j][i]顛倒輸出
			}
			System.out.println(""); // 換行
		}
	}
}
