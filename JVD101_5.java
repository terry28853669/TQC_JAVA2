
public class JVD101_5 {
	public static void main(String[] args) {
		int[] a = new int[7];
		int num;
		for (int i = 0; i < 7; i++) {
			num = (int) (Math.random() * 42) + 1;
			int j = 0;
			while (j < i) {
				if (a[j] == num) {
					num = (int) (Math.random() * 42) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			a[i] = num;
			if (i < 6) {
				System.out.print("第" + (i + 1) + "個號碼:");
			} else {
				System.out.print("特別號:");
			}
			if (a[i] < 10) {
				System.out.println("0" + a[i]);
			} else {
				System.out.println(a[i]);
			}
		}
	}
}
