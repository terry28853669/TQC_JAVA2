/*
1.設計一程式，運用陣列、迴圈及亂數來排列出數字範圍為1~9且為3*3的數字矩陣，
其縱向、橫向、對角線之3個數字總和皆為15，每次執行之矩陣排列皆不相同，並於命令列示出該矩陣之數字排列
2.矩陣內之數字皆不能重覆出現
3.矩陣每次執行縱向、橫向、對角線之總和皆為15
 */
public class JVD104_2 {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean B = false;
		int i, j = 1;
		long l=System.currentTimeMillis();
		do {
			for (i = 1; i < a.length; i++) {
				j = (int) (Math.random() * 10);
				a[0] = a[i];// 2給1
				a[i] = a[j];// 2取亂數
				a[j] = a[0];// 1再跟亂數位置交換
			}
			int X1 = a[1] + a[2] + a[3];
			int X2 = a[4] + a[5] + a[6];
			int X3 = a[7] + a[8] + a[9];
			int Y1 = a[1] + a[4] + a[7];
			int Y2 = a[2] + a[5] + a[8];
			int Y3 = a[3] + a[6] + a[9];
			int Z1 = a[1] + a[5] + a[9];
			int Z2 = a[3] + a[5] + a[7];
			if ((X1 == 15) && (X2 == 15) && (X3 == 15) && (Y1 == 15)
					&& (Y2 == 15) && (Y3 == 15) && (Z1 == 15) && (Z2 == 15))
				B = true;
		} while (!B);
		double d2=System.currentTimeMillis()-l;
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " ");
		System.out.println(a[3] + " " + a[4] + " " + a[5] + " ");
		System.out.println(a[6] + " " + a[7] + " " + a[8] + " ");
		System.out.println("耗時：" + d2/1000 +"秒");
	}
}
