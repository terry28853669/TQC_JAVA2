public class JVD108_DO {
	public static void main(String args[]) {
		int i, j;
		i = 1;
		do { // i為乘數
			j = 1;
			do { // j為被乘數
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				// 輸出乘數與被乘數及乘積
				j++;
			} while (j <= 9);
			i++;
			System.out.println("");
		} while (i <= 9);
	}
}
