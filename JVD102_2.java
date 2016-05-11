import java.text.DateFormat;

public class JVD102_2 {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("                  當地時間              ");
		System.out.println("----------------------------------------");
		for (int i = 3; i >= 0; i--) {
			System.out.println(DateFormat.getDateTimeInstance(i, i).format(System.currentTimeMillis()));
		}
	}
}