package day03;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccba";
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(str));

	}

	boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		if(str == "")
			throw new RuntimeException("null string !");
		else{
			for(int i = 0,j = str.length()-1;i < j ;i++,j--){
				if(str.charAt(i) != str.charAt(j))
					return false;
			}

			return true;
		}

	}

}
