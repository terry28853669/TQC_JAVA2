/*
1.�]�p�@�{���A�B�ΰ}�C�B�j��ζüƨӱƦC�X�Ʀr�d��1~9�B��3*3���Ʀr�x�}�A
���a�V�B��V�B�﨤�u��3�ӼƦr�`�M�Ҭ�15�A�C�����椧�x�}�ƦC�Ҥ��ۦP�A�é�R�O�C�ܥX�ӯx�}���Ʀr�ƦC
2.�x�}�����Ʀr�Ҥ��୫�ХX�{
3.�x�}�C�������a�V�B��V�B�﨤�u���`�M�Ҭ�15
 */
public class JVD104_2 {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean B = false;
		int i, j = 1;
		long l=System.currentTimeMillis();
		do {
			for (i = 1; i < a.length; i++) {
				j = (int) (Math.random() * 10);
				a[0] = a[i];// 2��1
				a[i] = a[j];// 2���ü�
				a[j] = a[0];// 1�A��üƦ�m�洫
			}
			int X1 = a[1] + a[2] + a[3];
			int X2 = a[4] + a[5] + a[6];
			int X3 = a[7] + a[8] + a[9];
			int Y1 = a[1] + a[4] + a[7];
			int Y2 = a[2] + a[5] + a[8];
			int Y3 = a[3] + a[6] + a[9];
			int Z1 = a[1] + a[5] + a[9];
			int Z2 = a[3] + a[5] + a[7];
			if ((X1 == 15) && (X2 == 15) && (X3 == 15) && (Y1 == 15)
					&& (Y2 == 15) && (Y3 == 15) && (Z1 == 15) && (Z2 == 15))
				B = true;
		} while (!B);
		double d2=System.currentTimeMillis()-l;
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " ");
		System.out.println(a[3] + " " + a[4] + " " + a[5] + " ");
		System.out.println(a[6] + " " + a[7] + " " + a[8] + " ");
		System.out.println("�ӮɡG" + d2/1000 +"��");
	}
}
