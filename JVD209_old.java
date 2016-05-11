public class JVD209_old {
	public static void main(String[] args) {
		//1.輸入JAVA程式
		String s = "JAVA程式";
		//2.轉換成"Unicode 碼 16 進位
		String s1 = toHex(s);
		System.out.println("Unicode 碼 16 進位   " + s1);
		//3.轉換成Big5再轉16進位
		String s2 = unicodeToBig5(s);
		String s3 = toHex(s2);
		System.out.println("Big5 碼 16 進位   " + s3);
		//4.再轉回字串
		String s4 = big5ToUnicode(s2);
		System.out.println("原字串" + s4);
	}

	public static String toHex(String str) {
		// 請在此寫出本方法的程式碼
		String strResult = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String s2 = "00" + Integer.toHexString(c);
			strResult += s2.substring(s2.length() - 4) + " ";
		}
		return strResult;
	}

	// 方法unicodeToBig5接受一個以Unicode表示的字串，
	// 將其轉成以Big5表示的字串後傳回。
	public static String unicodeToBig5(String str) {
		// 請在此寫出本方法的程式碼
		String strResult = "";
		try {
			strResult = new String(str.getBytes("Big5"), "ISO8859_1");
		} catch (Exception e) {
		}
		return strResult;
	}
	// 方法big5ToUnicode接受一個以Big5表示的字串，
	// 將其轉成以Unicode表示的字串後傳回。
	public static String big5ToUnicode(String str) {
		// 請在此寫出本方法的程式碼
		String strResult = "";
		try {
			strResult = new String(str.getBytes("ISO8859_1"), "Big5");
		} catch (Exception e) {
		}
		return strResult;
	}
}
