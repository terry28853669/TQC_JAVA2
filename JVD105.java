import java.util.Scanner;


public class JVD105 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//��J�C��
		System.out.println("�п�J�C��:");
		int row = scanner.nextInt();
		//��J���
		System.out.println("�п�J���:");
		int column = scanner.nextInt();
		
		//String num[][] = new String[row][column];
		scanner.nextLine(); //*Ū��\r\n�_�h�|���Ϳ��~ 
		//1.Ū�����
			System.out.println("�п�J��:1�C");
			String str = scanner.nextLine();
			String strArr[] = str.split(" ");
			for (int i=0;i<strArr.length;i++){
				System.out.println(strArr[i]);
			}
		//2.���Φr��é��G���}�C��
        //3.��X���G
		}
	}

