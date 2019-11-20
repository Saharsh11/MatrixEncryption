package encryption;

public class Cryptor {

	public static String cryption(String str) {
		System.out.println("Doing encryption");
		return cryptor1(str);
		
	}

	private static String cryptor1(String str) {
		str = str.trim();
		int n = str.length(),m;
		String str1= "";
		char[][] mat = null;
		if(n%2<9)
			m=4;
		else
			m=8;
		mat = new char[m][m];
		int a = 0;
		for(int i=0;i<m;i++) {
			for(int l =0;l<m;l++) {
				if(a< str.length()) {
					mat[l][i] = str.charAt(a);
					a++;
					
				}else {
					System.out.println("Should have created bigger matrix *_* ");
					break;
				}
			}
		}
		for(int j = 0;j<m;j++) {
			for(char c: mat[j]) 
				str1 += c;
		}
		return str1;
	}
}