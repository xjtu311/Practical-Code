package day07;

public class LongestSymmetrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "go";
		System.out.println(LCS(str));

	}
	
	
	static int LCS(String str){
		if(str.length() == 0)
			throw new RuntimeException("null string!");
		if(str.length() ==1)
			throw new RuntimeException("just one char !");
		StringBuilder sb1 = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(str).reverse();
		int m = sb1.length();
		int n = sb2.length();
		int[][] value = new int[m+1][n+1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(sb1.charAt(i-1)==sb2.charAt(j-1))
					value[i][j] = value[i-1][j-1]+1;
				else
					value[i][j] = Math.max(value[i][j-1], value[i-1][j]);
				
			}			
		}
		if(value[m][n] ==1)
			throw new RuntimeException("no symmetrical char !");
		return value[m][n];
		
		
	}
	
	

}
