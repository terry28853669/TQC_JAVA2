public class SplitDemo {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		String a = "Imagination is more important than knowledge.";
		String b = "He who has hope has everything.";

		String[] aArray = a.split(" ");		
		String[] bArray = b.split(" ", 3);
		System.out.println("a的結果");
		for (String d : aArray) {
			System.out.println(d);
		}
		System.out.println("b.split(\" \", 3) 的結果");
		for (String d : bArray) {
			System.out.println(d);
		}
	}

}
