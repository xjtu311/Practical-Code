package test;

import java.util.Scanner;

public class Zhuanyi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			System.out.println(getResult(str));
		}

	}
	
	
	public static String getResult(String str){
		char[] c=str.toCharArray();
		int k=0;
		for (int i = 0; i < c.length; i++) {
			if(String.valueOf(c[i]).matches("[a-z]")){
				char temp = c[i];
				for (int j = i; j > k; j--) {
					c[j]=c[j-1];
				}
				c[k]=temp;
				k++;
			}
		}
		String str2 = String.valueOf(c);
		
		return str2;
		
	}

}
