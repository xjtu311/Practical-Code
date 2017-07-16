package day02;

import java.util.HashSet;

public class StringContains {
	
	public static void main(String[] args) {
		String A = "SDAFHSDC";
		String B = "SDE";
		System.out.println(contains(A,B));
	}

	private static boolean contains(String a, String b) {
		char[] cha = a.toCharArray();
		char[] chb =b.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			int j;
			for (j = 0; ((j < chb.length) && (chb[j]!=cha[i])); j++)
				;
			if(j >= chb.length)
				return false;	
		}
		return true;
	}
	

	
	
	
/*	static boolean contains(String A ,String B){

			char[] cha = A.toCharArray();
			HashSet seta = new HashSet();
			for(char ch:cha){
				seta.add(ch);
			}
			char[] chb = B.toCharArray();
			for(int i =0;i<chb.length;i++){
				if(!seta.contains(chb[i]))
					return false;
			}
				return true;			
		}*/
				

}
