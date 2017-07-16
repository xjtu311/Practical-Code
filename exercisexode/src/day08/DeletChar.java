package day08;

public class DeletChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "they are student.";
		String str2 ="aeiou";
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		delet(sb1,sb2);
		System.out.println(sb1.toString());
	}
	
	static void delet(StringBuilder sb1,StringBuilder sb2){
		for(int i = 0;i<sb1.length();i++){
			for(int j = 0;j<sb2.length();j++){
				if(sb1.charAt(i)==sb2.charAt(j)){
					sb1 =sb1.deleteCharAt(i); 

					break;
				}
			}
		}
	}
	
	

}
