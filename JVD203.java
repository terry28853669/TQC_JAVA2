public class JVD203 {
	public static void main(String[] args) {
		//1.�P�_�O�_����ӥH�W���Ѽ�
		if (args.length > 1) {
			System.out.println("�Ѽƿ��~�I�r�ꤤ�������ťթΥ��ݥH�r���j�}�I");
			//return;
			System.exit(0);
		}
		
		//2.�N�Ĥ@�ӰѼƶǵ�str1
		String str1 = args[0];

		//3.�N�ѼƤ���
		String str[] = str1.split(",");
		System.out.println("�r���j�}���r��ӼƦ@��:"+str.length);
		//4.�ΰj�骺�覡��X���G
		for (int i = 0; i < str.length; i++) {
			System.out.println(i + 1 + "." + str[i]);
		}
	}
}