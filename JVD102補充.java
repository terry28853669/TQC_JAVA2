
import java.util.Date;
public class JVD102補充 {
	public static void main(String[] args) {
	//如果想要取得系統的時間
	 System.out.println(System.currentTimeMillis());
	 Date date = new Date();
     System.out.println(date.toString());
     System.out.println(date.getTime());     
	 }
       
}
