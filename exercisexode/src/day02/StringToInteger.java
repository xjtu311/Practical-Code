package day02;

public class StringToInteger {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(StrToInt(str));
	}
	private static int StrToInt(final String str) {
		if(str.length() == 0)
			throw new RuntimeException("null exception !");
		else{
			int num = 0;
			char[] ch = str.toCharArray();
			if(ch[0] =='-'){
				num = ch[1]-'0';
				for (int i = 2; i < ch.length; i++) {
					num = num*10 +(ch[i]-'0');
				}
				System.out.print("-");
				
			}else if(ch[0] == '+'){
				num = ch[1]-'0';
				for (int i = 2; i < ch.length; i++) {
					num = num*10 +(ch[i]-'0');
				}
				System.out.print("+");
				
			}else{
				num = ch[0]-'0';
				for (int i = 1; i < ch.length; i++) {
					num = num*10 +(ch[i]-'0');
				}
				
			}

		return num;	
		}
	}
	
	
	

/*	private static int StrToInt(final String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0)
			throw new RuntimeException("null exception !");

		else{
			char[] ch = str.toCharArray();
			int num = ch[0]-'0';
			for (int i = 1; i < ch.length; i++) {
				num = num*10 + (ch[i]-'0');
			}
			return num;
		}
	}*/

/*	static int StrToInt(final String str){
		char[] ch = str.toCharArray();
		int num = ch[0]-'0';
			for (int i = 1; i < ch.length; i++) {
				int c = ch[i]-'0';
				num = num*10 +c;
			}
		return num;			
	}*/
	
}
