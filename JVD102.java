import java.util.Date;
import java.text.DateFormat;

public class JVD102 {
	static public void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("                  當地時間              ");
		System.out.println("----------------------------------------");
		Date date = new Date();
		// （１）格式為：西元年/月/日　上午/下午　時/分。
		DateFormat shortF = DateFormat.getDateTimeInstance(3,3);
		// （２）格式為：西元年/月/日　上午/下午　時/分/秒。
		DateFormat mediumF = DateFormat.getDateTimeInstance(2,2);
		// （３）格式為：西元年(年)月(月)日(日)　上午/下午　時(時)分(分)/秒(秒)。
		DateFormat longF = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG);
		// （４）格式為：西元年(年)月(月)日(日)　上午/下午　時(時)分(分)/秒(秒)　CST。
		DateFormat fullF = DateFormat.getDateTimeInstance(DateFormat.FULL,
				DateFormat.FULL);

		System.out.println(shortF.format(System.currentTimeMillis()));
		System.out.println(mediumF.format(date));
		System.out.println(longF.format(date));
		System.out.println(fullF.format(date));
	}
}
