
import java.util.*;//Date()
import java.text.*; //DateFormat()
public class JVD102_3 {
	static public void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("                  當地時間              ");
		System.out.println("----------------------------------------");
		Date date = new Date();
		for (int i=3;i>=0;i--){
			System.out.println(DateFormat.getDateTimeInstance(i,i).format(date));
		}
	}
}

