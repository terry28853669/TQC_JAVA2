public class JVD108_for {
	public static void main(String args[]) {
		int i, j;
		for (i = 1; i <= 9; i++) { // i為乘數
			for (j = 1; j <= 9; j++) { // j為被乘數
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				// 輸出乘數與被乘數及乘積
			}
			System.out.println("");
		}
	}
}
