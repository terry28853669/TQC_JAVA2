import java.util.*;

public class JVD104_5 {
	public static void main(String[] args) {
		Integer[] b = new Integer[9];
		List<Integer> list = new ArrayList();
		for (int i = 1; i <= 9; i++) {
			list.add(i);
		}
		do {
			Collections.shuffle(list);
			b = (Integer[]) list.toArray(new Integer[list.size()]);
		} while (!(b[0] + b[1] + b[2] == 15 && b[3] + b[4] + b[5] == 15
				&& b[6] + b[7] + b[8] == 15 && b[0] + b[3] + b[6] == 15
				&& b[1] + b[4] + b[7] == 15 && b[2] + b[5] + b[8] == 15
				&& b[0] + b[4] + b[8] == 15 && b[6] + b[4] + b[2] == 15));
		System.out.println(b[0] + " " + b[1] + " " + b[2] + " ");
		System.out.println(b[3] + " " + b[4] + " " + b[5] + " ");
		System.out.println(b[6] + " " + b[7] + " " + b[8] + " ");

	}
}
