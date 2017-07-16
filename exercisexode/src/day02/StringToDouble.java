package day02;

import java.util.HashSet;

public class StringToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "+123.45.54";
		String str1 = "-123.45";
		System.out.println(strToDouble(str));
		System.out.println(strToDouble(str1));

	}

	private static double strToDouble(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0)
			throw new RuntimeException("null string !");
		else{
			int p = 0 ,n=0;
			double num = 0.0;
			for (int i = 0; i < str.length() ; i++){
				if(str.charAt(i) =='.'){
					p=i;
					n++;					
				}
			}
			if(n>1){
				throw new RuntimeException("formal wrong !");
			}else{
				if(str.charAt(0) == '+'){
					num = str.charAt(1)-'0';
					if(1<p &&p<(str.length()-1)){
						for (int i = 2; i < p; i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
						for(int i = p+1;i<str.length();i++){
							num = num + (str.charAt(i)-'0')*Math.pow(0.1, i-p);
						}
					}
					else{
						for (int i = 2; i < str.length(); i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
					}
					System.out.print("+");
				}else if(str.charAt(0) == '-'){
					num = str.charAt(1)-'0';
					if(1<p &&p<(str.length()-1)){
						for (int i = 2; i < p; i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
						for(int i = p+1;i<str.length();i++){
							num = num + (str.charAt(i)-'0')*Math.pow(0.1, i-p);
						}
					}
					else{
						for (int i = 2; i < str.length(); i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
					}
					System.out.print("-");
				}else{
					num  = str.charAt(0)-'0';
					if(0<p && p<(str.length()-1)){
						for (int i = 1; i < p; i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
						for(int i = p+1;i<str.length();i++){
							num = num + (str.charAt(i)-'0')*Math.pow(0.1, i-p);
						}
					}
					else{
						for (int i = 1; i < str.length(); i++) {
							num = num*10 + ( str.charAt(i)-'0');
						}
					}
					
				}
				
				
				return num;
			}

			
		}
	
	}
	
/*	static double strToDouble(final String str){
		char[] ch = str.toCharArray();
		double num = ch[0]-'0';
		HashSet set = new HashSet();
		for(char c : ch)
			set.add(c);
		
		if(set.contains('.')){
			String[] s = str.split("\\.");
			char[] ch1 = s[0].toCharArray();
			char[] ch2 = s[1].toCharArray();
			for (int i = 1; i < ch1.length; i++) {
				num = num*10 +(ch1[i]-'0');
			}
			for (int i = 0; i < ch2.length; i++) {
				double d = Math.pow(0.1, i+1);
				num = num + (ch2[i]-'0')*d  ;
			}
			
		}else{
			for (int i = 1; i < ch.length; i++) {
				num = num*10 +(ch[i]-'0');
			}

		}
			return num;	
		
	
	}*/
	
	
	
}
