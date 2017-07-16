package day03;

import java.util.Stack;

public class PalindromeOfStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abccba";

		System.out.println(isPalindrome(str));
			
		

	}

	static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		if(str == "")
			throw new RuntimeException("null string !");
		else{
			Stack stack = new Stack();

			for (int i = 0; i < str.length(); i++) {
				stack.push(str.charAt(i));
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				sb.append(stack.pop());
			}
			
			String str1 = sb.toString();
			
			return str1.equals(str);
		}

	}

}
