package day04;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		//String str = "asadcdae";
		String str = "sabcbd";
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.ispalindrome(str));
	}

	int ispalindrome(String str) {
		// TODO Auto-generated method stub
		if(str == "")
			throw new RuntimeException("null string !");
		else{
			int id = 0,maxlen =0;
			int[] p = new int[str.length()*2 +2];
			char[] ch = new char[str.length()*2 +2];
			for(int i = str.length()-1;i>=0;i--){
				ch[i+i+2] = str.charAt(i);
				ch[i+i+1] = '#';
			}
			ch[0] = '$';
			for(int i = 2; i< 2*str.length()+1 ;i++){
				if(p[id]+id > i)
					p[i] = Math.min(p[2*id-i], p[id]+id-i);
				else 
					p[i] =1;
				while(ch[i-p[i]] == ch[i+p[i]])
					++p[i];
				if(id+p[id]<i+p[i]) 
					id=i;
				if(maxlen <p[i])
					maxlen = p[i];
					
			}
			//return id;
			return maxlen-1;
			
		}
	}
	
	

/*	
 * int ispalindrome(String str) {
		// TODO Auto-generated method stub
		if(str == "")
			throw new RuntimeException("null string !");
		else{
			int length = 0;
			for (int i = 0; i < str.length(); i++) {
				for(int j =0;(i-j >0)&&(i+j <str.length());j++){
					if(str.charAt(i-j) != str.charAt(i+j))
						break;
					if(length<j * 2 + 1)
						length = j * 2 + 1 ;
				}					
			}				
			for (int i = 0; i < str.length(); i++) {
				for(int j =0;(i-j >0)&&(i+j <str.length());j++){
					if(str.charAt(i-j) != str.charAt(i+j-1))
						break;
					if(length <j * 2)
						length = j * 2 ;
				}
			}

			return length;
		}	
		
	}
	*/		

}
