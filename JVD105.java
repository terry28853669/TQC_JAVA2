import java.util.Scanner;


public class JVD105 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//輸入列數
		System.out.println("請輸入列數:");
		int row = scanner.nextInt();
		//輸入欄數
		System.out.println("請輸入欄數:");
		int column = scanner.nextInt();
		
		//String num[][] = new String[row][column];
		scanner.nextLine(); //*讀取\r\n否則會產生錯誤 
		//1.讀取資料
			System.out.println("請輸入第:1列");
			String str = scanner.nextLine();
			String strArr[] = str.split(" ");
			for (int i=0;i<strArr.length;i++){
				System.out.println(strArr[i]);
			}
		//2.切割字串並放到二維陣列中
        //3.輸出結果
		}
	}

