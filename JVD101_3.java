

import java.util.HashSet;
import java.util.Set;

//101º“¿¿º÷≥z±m
public class JVD101_3 {
	public JVD101_3() {
	}

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		do {
			String num = String.valueOf((int) (Math.random() * 42) + 1);
			if (Integer.valueOf(num) < 10) {
				num = "0" + num;
			}
			set.add(num);
		} while (set.size() != 7);
		System.out.println(set.toString());
	}
}