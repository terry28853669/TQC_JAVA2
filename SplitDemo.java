public class SplitDemo {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		String a = "Imagination is more important than knowledge.";
		String b = "He who has hope has everything.";

		String[] aArray = a.split(" ");		
		String[] bArray = b.split(" ", 3);
		System.out.println("a�����G");
		for (String d : aArray) {
			System.out.println(d);
		}
		System.out.println("b.split(\" \", 3) �����G");
		for (String d : bArray) {
			System.out.println(d);
		}
	}

}
