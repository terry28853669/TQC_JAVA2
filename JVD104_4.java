/*1.�]�p�@�{���A�B�ΰ}�C�B�j��ζüƨӱƦC�X�Ʀr�d��1~9�B��3*3���Ʀr�x�}�A���a�V�B��V�B�﨤�u��3�ӼƦr�`�M�Ҭ�15�A�C�����椧�x�}�ƦC�Ҥ��ۦP�A�é�R�O�C�ܥX�ӯx�}���Ʀr�ƦC
2.�x�}�����Ʀr�Ҥ��୫�ХX�{
3.�x�}�C�������a�V�B��V�B�﨤�u���`�M�Ҭ�15*/
public class JVD104_4 {
	public static void main(String[] args) {
		//1.�إߤG���}�C
		int a[][] = new int[3][3];
		int num;
		//a[1][1] = 5;
		while (!(a[0][0] + a[0][1] + a[0][2] == 15
				&& a[1][0] + a[1][1] + a[1][2] == 15
				&& a[2][0] + a[2][1] + a[2][2] == 15
				&& a[0][0] + a[1][0] + a[2][0] == 15
				&& a[0][1] + a[1][1] + a[2][1] == 15
				&& a[0][2] + a[1][2] + a[2][2] == 15
				&& a[0][0] + a[1][1] + a[2][2] == 15 && a[0][2] + a[1][1]
				+ a[2][0] == 15)) {
			for (int i = 0; i <= 3; i++) {
				num = (int) (Math.random() * 9) + 1;
				int j = 0;
				while (j <= 4) {
					if (a[j / 3][j % 3] == num) {
						num = (int) (Math.random() * 9) + 1;
						j = 0;
					} else {
						j++;
					}
				}
				a[i / 3][i % 3] = num;
				a[(8 - i) / 3][(8 - i) % 3] = 15 - a[1][1] - a[i / 3][i % 3];
			}
		}
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(a[x][y] + " ");
			}
			System.out.println();
		}
	}
}