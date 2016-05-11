public class JVD108_DO {
	public static void main(String args[]) {
		int i, j;
		i = 1;
		do { // i计
			j = 1;
			do { // j砆计
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				// 块计籔砆计の縩
				j++;
			} while (j <= 9);
			i++;
			System.out.println("");
		} while (i <= 9);
	}
}
