import java.util.Scanner;
class JVD205 {
	public static void main(String[] args){
		System.out.println("��J��ӼƦr x �M y, �H�r�����j: ");
		// �Цb���إ߿�J����A��Ū���q��L��J����ơC
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.next().split(",");
		float x = Float.valueOf(str[0]);
		float y = Float.valueOf(str[1]);
		System.out.println("�p��ε��� x ���̤j��Ƭ�:  " + Math.floor(x));
		// �Цb���g�X�{���X�H���o�p��ε��� x ���̤j��ơC
		System.out.println("�j��ε��� x ���̤p��Ƭ�:  " + Math.ceil(x));
		// �Цb���g�X�{���X�H���o�j��ε��� x ���̤p��ơC
		System.out.println("�̱��� x ����Ƭ�:  " + Math.rint(x));
		// �Цb���g�X�{���X�H���o�̱��� x ����ơC
		System.out.println("x���|�ˤ��J�Ȭ�:  " + Math.round(x));
		// �Цb���g�X�{���X�H���ox���|�ˤ��J��
		System.out.println("x ������� = " + Math.pow(x, 1/2.0));
		//System.out.println("x ������� = " + Math.sqrt(x));
		// �Цb���g�X�{���X�H��Xx ������ڡC
		System.out.println("x ���ߤ�� = " + Math.pow(x, 1/3.0));
		// �Цb���g�X�{���X�H��Xx ���ߤ�ڡC
		System.out.println("x �P y ��̤����j���� = " + Math.max(x, y));
		// �Цb���g�X�{���X�H���o x �P y ��̤����j����,
		// ���ϥ�Math�Ҵ��Ѫ���k�C
		System.out.println("x �� y ���� = " + Math.pow(x, y));
		// �Цb���g�X�{���X�H��Xx �� y ����C

	}
}
