import java.util.Scanner;

public class JVD201 {
	public static void main(String args[]) {
		int x = 0, y = 0, z = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�JZ���̤j��:");
		//1.�ϥΪ̿�J�Ʀr
		z = scanner.nextInt();
		//2.�᰼�j��P�_�O�_�j��Y
//		do {
//			x++;
//			y = (int) (3 * Math.pow(x, 2) + 2 * x + 1);			
//		} while (y < z);
		for (x=0;y < z;x++){
			y = (int) (3 * Math.pow(x, 2) + 2 * x + 1);
		}
		//3.���󬰤p��Z�A�]��X-1
		x=x-2;
		System.out.print("��x��:" + x);
		System.out.print(", Y:" + (3 * x * x + 2 * x + 1));
		System.out.println(",�ŦXY < Z ������");
	}
}