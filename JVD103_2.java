
import java.util.*;

public class JVD103_2 {
	public static void main(String[] args) {
		System.out.println("�п�J�����ͪ��üƭӼ�:");
		Scanner keyin = new Scanner(System.in);
		int n = keyin.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = (int) (Math.random() * 1000) + 1;
			//�ή�w�ƧǪk�Ƨ�
			int j = 0;
			//1.�Ĥ@�����αƧ�
			while (j < i) {
				//2.��e����᭱���j
				if (num[j] > num[j + 1]) {
					//3���s�ƦC�A��j���ȥᵹtmp�A�A��p���Ȳ���j���A�A��tmp����p����m
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
					j = 0;//�k�s����
				} else {
					j++;//�~����
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}