package day01;

public class ReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String str = "abcdef";
		ReverseChar rc = new ReverseChar();
		
       str= rc.shift(str,4);

		System.out.println( str  );*/
		
		
		String str1 = "I am a student.";
		
		reverseString(str1);


		
	}
	
	
	static void reverseString(String str){

		String[] arr = str.split("\\s+");
		int l = 0;
		int h = arr.length-1;
		
		while(l<h){
			String temp = arr[h];
			arr[h] = arr[l];
			arr[l] = temp;
			h--;
			l++;
			
		}
		for(int i=0;i<arr.length;i++)
		       System.out.print(arr[i]+" ");

	}
	
	
	
	
	
	
/*	
	public String shiftOne(String str){
		
		char[] ch = str.toCharArray();
		char temp = ch[0];
		for (int i = 0; i < ch.length-1; i++) {
			ch[i] = ch[i+1];
		}
		ch[ch.length-1] = temp;
		
		str = String.valueOf(ch);

		return str;
		
	}
	
	
	public String shift(String str ,int n){
		while(n>0){
			str = shiftOne(str);
			n--;
		}

		return str;
	}
	
	*/
	
	
	
/*	
   public String shiftChar(String str,int n){
		StringBuilder sb  = new StringBuilder();
		StringBuilder reverse = new StringBuilder(str).reverse();
		
		String str1 = reverse.substring(0,str.length()-n);//new StringBuilder(str).reverse().substring(0, str.length()-2);
		String str2 = reverse.substring(str.length()-n, str.length());
		
		StringBuilder s1 = new StringBuilder(str1);		
		s1 = s1.reverse();
		
		StringBuilder s2 = new StringBuilder(str2);
		s2 = s2.reverse();
		
		sb.append(s1);
		sb.append(s2);
		str = sb.toString();
		
		return str;
		
	}
*/		
}
