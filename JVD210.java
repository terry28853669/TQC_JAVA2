//210 字元搜尋器
import java.util.Scanner;
public class JVD210 {
	// 判斷是否找到

	public static void main(String args[]) {
		// 1.宣告找到的位置與開始搜尋的位置=0
		// 找到的個數
		int findIt = 0;
		// 找到的位置
		int index = 0;
		// 從哪裡開始找，找到就往下找index+關鍵字長度
		int be = 0;
		System.out.println("請輸入字串");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); // 讀入一行
		System.out.println("請輸入要搜尋的字元或字串:");
		String str1 = s.nextLine(); // 讀入字串

		do {
			index = str.indexOf(str1, be); // 在str內的第be個字元尋找str1
			if (index != -1) {
				findIt += 1;
				if (findIt == 1) {
					System.out.println("第幾個位置找到了");
				}
				System.out.println(index + 1);
				be = index + str1.length();

			}
		} while (index != -1);
		if (findIt == 0)
			System.out.println("字元不在字串中");
	}
}
