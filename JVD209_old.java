public class JVD209_old {
	public static void main(String[] args) {
		//1.��JJAVA�{��
		String s = "JAVA�{��";
		//2.�ഫ��"Unicode �X 16 �i��
		String s1 = toHex(s);
		System.out.println("Unicode �X 16 �i��   " + s1);
		//3.�ഫ��Big5�A��16�i��
		String s2 = unicodeToBig5(s);
		String s3 = toHex(s2);
		System.out.println("Big5 �X 16 �i��   " + s3);
		//4.�A��^�r��
		String s4 = big5ToUnicode(s2);
		System.out.println("��r��" + s4);
	}

	public static String toHex(String str) {
		// �Цb���g�X����k���{���X
		String strResult = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String s2 = "00" + Integer.toHexString(c);
			strResult += s2.substring(s2.length() - 4) + " ";
		}
		return strResult;
	}

	// ��kunicodeToBig5�����@�ӥHUnicode��ܪ��r��A
	// �N���ন�HBig5��ܪ��r���Ǧ^�C
	public static String unicodeToBig5(String str) {
		// �Цb���g�X����k���{���X
		String strResult = "";
		try {
			strResult = new String(str.getBytes("Big5"), "ISO8859_1");
		} catch (Exception e) {
		}
		return strResult;
	}
	// ��kbig5ToUnicode�����@�ӥHBig5��ܪ��r��A
	// �N���ন�HUnicode��ܪ��r���Ǧ^�C
	public static String big5ToUnicode(String str) {
		// �Цb���g�X����k���{���X
		String strResult = "";
		try {
			strResult = new String(str.getBytes("ISO8859_1"), "Big5");
		} catch (Exception e) {
		}
		return strResult;
	}
}
