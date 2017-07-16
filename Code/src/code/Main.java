package code;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(getResult(str));
        }
    }
    
    public static int getResult(String str){
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(str).reverse();
        int len = str.length();
        int[][] result = new int[len+1][len+1];
        for(int i = 1;i<=len;i++)
            for(int j = 1;j<=len;j++){
                if(sb1.charAt(i-1)==sb2.charAt(j-1))
                    result[i][j] = result[i-1][j-1]+1;
                else
                    result[i][j] = Math.max(result[i-1][j],result[i][j-1]);
            }
        
        return len-result[len][len];
    } 
    
}


/*
import java.util.Scanner;
public class Main{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(getResult(str));
        }
    }
    
    public static String getResult(String str){
        char[] ch = str.toCharArray();
        int k =0;
        for(int i =0;i<ch.length;i++){
            if(String.valueOf(ch[i]).matches("[a-z]")){
                char temp = ch[i];
                for(int j = i;j > k;j--)
                    ch[j] = ch[j-1];
                ch[k] = temp;
                k++;
            }
        }
        
        String str2 = String.valueOf(ch);
        return str2;
    }    
    
}*/