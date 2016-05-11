import java.util.Date;
import java.util.Scanner;

public class JVD110 {
	String items[][];
	long start, end;
	Date d;
	static Scanner scanner = new Scanner(System.in);
	static int right = 0; //

	public static void main(String args[]) {
		int total = args.length;
		int pairs = total / 2;
		JVD110 tte = new JVD110();
		if (total != 0 && pairs != 0) {
			tte.items = new String[pairs][2];
			for (int i = 0; i < total; i += 2) {
				System.out.println("第" + i + "題_:" + args[i]);
				if (args[i + 1].equalsIgnoreCase(scanner.next().trim())) {
					System.out.println("答對了");
					right++;
				} else {
					System.out.println("正確答案為:" + args[i + 1]);
				}
			}
		} else {
			tte.start();
		}
	}

	JVD110() {
		items = new String[5][2];
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
	}

	void start() {
		d = new Date();
		start = d.getTime();
		System.out.println("請將題目的中文詞彙翻譯成英文單字!");
		System.out.println("輸入英文單字答案後請按Enter鍵：");
		System.out.println("           ");
		for (int i = 0; i < 5; i++) {
			System.out.println("第" + i + "題_:" + items[i][0]);
			if (items[i][1].equalsIgnoreCase(scanner.next())) {
				System.out.println("答對了");
				right++;
			} else {
				System.out.println("正確答案為:" + items[i][1]);
			}
			d = new Date();
			end = d.getTime();
			// 請在此撰寫程式
			System.out.println("你答對了" + right + "題，花費時間為"
					+ ((end - start) / 1000) + "秒"); // 還有這行
		}
	}
}