import java.util.Scanner;

public class JVD110_02 {
	static long start; // 開始時間
	static long end; // 結束時間
	static Scanner scanner = new Scanner(System.in);
	static int right = 0; // 正確計數

	public static void main(String args[]) {
		// 1.開始出題
		System.out.println("請將題目的中文詞彙翻譯成英文單字!");
		System.out.println("輸入英文單字答案後請按Enter鍵：");
		System.out.println("");
		int total = args.length;
		int pairs = total / 2;
		// JVD110_ tte = new JVD110();
		if (total != 0 && pairs != 0) {
			// String items[][] = new String[pairs][2];
			start = System.currentTimeMillis();
			for (int i = 0; i < total; i += 2) {
				System.out.println("第" + (i / 2 + 1) + "題_:" + args[i]);
				if (args[i + 1].equalsIgnoreCase(scanner.next())) {
					System.out.println("答對了");
					System.out.println();
					right++;

				} else {
					System.out.println("正確答案為:" + args[i + 1]);
					System.out.println();
				}
			}
			end = System.currentTimeMillis();
			System.out.println("你花費時間為" + (end - start) / 1000 + "秒，在"
					+ args.length/2 + "題中你答對了" + right + "題");
		} else {
			// 2.讀入題目至陣列
			String items[][] = new String[5][2];
			items[0][0] = "電腦";
			items[0][1] = "Computer";
			items[1][0] = "資料庫";
			items[1][1] = "DataBase";
			items[2][0] = "語法";
			items[2][1] = "syntax";
			items[3][0] = "學校";
			items[3][1] = "School";
			items[4][0] = "假期";
			items[4][1] = "Vocation";
			// 3.取得時間訊息
			start = System.currentTimeMillis();

			for (int i = 0; i < 5; i++) {
				// 例：第0題_:電腦
				System.out.println("第" + i + "題_:" + items[i][0]);
				if (items[i][1].equalsIgnoreCase(scanner.next())) { // 比對方式不分大小寫
					System.out.println("答對了\n");
					right++;
				} else {
					System.out.println("答錯了！\n正確答案為:" + items[i][1] + "\n"); //
				}
			}
			end = System.currentTimeMillis();
			System.out.println("你花費時間為" + (end - start) / 1000 + "秒，在"
					+ items.length + "題中你答對了" + right + "題");
		}
	}
}
