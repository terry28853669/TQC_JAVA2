public class JVD104_1 {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean redo = true;
		do {
			// 1.�N�}�C����
			for (int i = 1; i <= 9; i++) {
				int j = (int) (Math.random() * 9) + 1;
				//�û��|�b�o9�ӼƦr���洫
				int temp;
				temp = a[i]; // 2��1
				a[i] = a[j]; // 2���ü�
				a[j] = temp; // 1�A��üƦ�m�洫
			}
			// 2.�[�`8�جۥ[���i��(��V3�a�V3��2)
			int k = a[1] + a[2] + a[3];
			int l = a[4] + a[5] + a[6];
			int i1 = a[7] + a[8] + a[9];
			int j1 = a[1] + a[4] + a[7];
			int k1 = a[2] + a[5] + a[8];
			int l1 = a[3] + a[6] + a[9];
			int i2 = a[1] + a[5] + a[9];
			int j2 = a[3] + a[5] + a[7];
			if (k == 15 && l == 15 && i1 == 15 && j1 == 15 && k1 == 15
					&& l1 == 15 && i2 == 15 && j2 == 15)
				redo = false;
		} while (redo); // �p�Gfalse�N���}
		// 3.��X���G
		System.out.println("���׬�:");
		System.out.println(a[1] + " " + a[2] + " " + a[3]);
		System.out.println(a[4] + " " + a[5] + " " + a[6]);
		System.out.println(a[7] + " " + a[8] + " " + a[9]);
		System.out.println("�����a�V��V�﨤�u�Ʀr�M�Ҭ�15");
	}
}