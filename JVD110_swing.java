//import java.util.Scanner;

import javax.swing.JOptionPane;

public class JVD110_swing {
	static long start; // 開始時間
	static long end; // 結束時間
//	static Scanner scanner = new Scanner(System.in);
	static int right = 0; // 正確計數

	public static void main(String args[]) {
		// 1.讀入題目至陣列
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
		// 2.取得時間訊息
		start = System.currentTimeMillis();
		// 3.開始出題
//		System.out.println("請將題目的中文詞彙翻譯成英文單字!");
//		System.out.println("輸入英文單字答案後請按Enter鍵：");
//		System.out.println("");
		JOptionPane.showMessageDialog(null, "請將題目的中文詞彙翻譯成英文單字!\n輸入英文單字答案後請按Enter鍵：\n");
		for (int i = 0; i < 5; i++) {
			// 例：第0題_:電腦
//			System.out.println("第" + (i + 1) + "題_:" + items[i][0]);
			String S = JOptionPane.showInputDialog("第" + (i + 1) + "題_:" + items[i][0]);
			if (items[i][1].equalsIgnoreCase(S)) { // 比對方式不分大小寫
//				System.out.println("答對了\n");
				JOptionPane.showMessageDialog(null,"答對了\n");
				right++;
			} else {
//				System.out.println("答錯了！\n正確答案為:" + items[i][1] + "\n"); //
				JOptionPane.showMessageDialog(null,"答錯了！\n正確答案為:" + items[i][1] + "\n");
			}
		}
		end = System.currentTimeMillis();
//		System.out.println("你花費時間為" + (end - start) / 1000 + "秒，在"+ items.length + "題中你答對了" + right + "題");
		JOptionPane.showMessageDialog(null,"你花費時間為" + (end - start) / 1000 + "秒，在"+ items.length + "題中你答對了" + right + "題");
	}
}
