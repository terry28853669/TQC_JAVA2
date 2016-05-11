public class JVD109_2 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100) + 1;
		System.out.println("隨機產生的半徑為:" + a);
		System.out.println();
		System.out.println("計算後,直徑為:" + a * 2);
		System.out.println();
		System.out.println("計算後,圓面積為:" + a * 2 * Math.PI);
		System.out.printf("四捨五入至小數第1位,則圓面積為: %.1f", a * 2 * Math.PI);
		System.out.println();
		System.out.println();
		System.out.println("計算後,圓體積為:" + (a * 4 * Math.PI * 3 / 3));
		System.out.printf("四捨五入至小數第1位,則圓面積為: %.1f", a * 4 * Math.PI * 3 / 3);
	}
}
