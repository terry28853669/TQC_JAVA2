public class JVD108_While {
	public static void main(String args[]) {
		int i, j;
		i = 1;		
		 do{// i������
			j = 1;
			 do{// j���Q����
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				// ��X���ƻP�Q���Ƥέ��n
				j++;
			}while (j <= 9);
			i++;
			System.out.println("");
		}while (i <= 9);
	}
}
