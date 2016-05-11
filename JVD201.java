import java.util.Scanner;

public class JVD201 {
	public static void main(String args[]) {
		int x = 0, y = 0, z = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入Z的最大值:");
		//1.使用者輸入數字
		z = scanner.nextInt();
		//2.後側迴圈判斷是否大於Y
//		do {
//			x++;
//			y = (int) (3 * Math.pow(x, 2) + 2 * x + 1);			
//		} while (y < z);
		for (x=0;y < z;x++){
			y = (int) (3 * Math.pow(x, 2) + 2 * x + 1);
		}
		//3.條件為小於Z，因此X-1
		x=x-2;
		System.out.print("當x為:" + x);
		System.out.print(", Y:" + (3 * x * x + 2 * x + 1));
		System.out.println(",符合Y < Z 的條件");
	}
}