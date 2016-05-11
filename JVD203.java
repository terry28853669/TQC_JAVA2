public class JVD203 {
	public static void main(String[] args) {
		//1.判斷是否有兩個以上的參數
		if (args.length > 1) {
			System.out.println("參數錯誤！字串中不的有空白或必需以逗號隔開！");
			//return;
			System.exit(0);
		}
		
		//2.將第一個參數傳給str1
		String str1 = args[0];

		//3.將參數切割
		String str[] = str1.split(",");
		System.out.println("逗號隔開的字串個數共有:"+str.length);
		//4.用迴圈的方式輸出結果
		for (int i = 0; i < str.length; i++) {
			System.out.println(i + 1 + "." + str[i]);
		}
	}
}