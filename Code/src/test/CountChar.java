package test;

import java.util.Scanner;

public class CountChar {
	   public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        countString(str);
	    }
	    
	    public static void countString(String str){
	        StringBuilder sb = new StringBuilder();
	        int len = str.length();
	        int count = 1;
	        for(int i =0;i<len-1;i++){
	            if(str.charAt(i) != str.charAt(i+1)){
	                sb.append(count);
	                sb.append(str.charAt(i));
	                count = 1;
	            }
	            else
	                count++;
	        }
	        sb.append(count);
	        sb.append(str.charAt(len-1));
	        
	       System.out.println(sb.toString());
	        
	    }
	    
	}