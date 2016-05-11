import java.util.Date;
import java.text.DateFormat;

public class JVD102 {
	static public void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("                  ��a�ɶ�              ");
		System.out.println("----------------------------------------");
		Date date = new Date();
		// �]���^�榡���G�褸�~/��/��@�W��/�U�ȡ@��/���C
		DateFormat shortF = DateFormat.getDateTimeInstance(3,3);
		// �]���^�榡���G�褸�~/��/��@�W��/�U�ȡ@��/��/��C
		DateFormat mediumF = DateFormat.getDateTimeInstance(2,2);
		// �]���^�榡���G�褸�~(�~)��(��)��(��)�@�W��/�U�ȡ@��(��)��(��)/��(��)�C
		DateFormat longF = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG);
		// �]���^�榡���G�褸�~(�~)��(��)��(��)�@�W��/�U�ȡ@��(��)��(��)/��(��)�@CST�C
		DateFormat fullF = DateFormat.getDateTimeInstance(DateFormat.FULL,
				DateFormat.FULL);

		System.out.println(shortF.format(System.currentTimeMillis()));
		System.out.println(mediumF.format(date));
		System.out.println(longF.format(date));
		System.out.println(fullF.format(date));
	}
}
