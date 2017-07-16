package day05;

import java.util.Arrays;

public class StringExpress{
	   int getMin(char[]input,int index){
	        char min=input[index];
	        int minIndex=index+1;
	        char result='z';
	        for(int i=index+1;i<input.length;i++){
	              if(input[i]>min&&input[i]<result){
	                  result=input[i];
	                  minIndex=i;
	              }
	        }
	        return minIndex;
	   }
	   void exchange(char []input,int index,int minIndex){
	           char temp=input[index];
	           input[index]=input[minIndex];
	           input[minIndex]=temp;
	   }
	   void reverse(char input[],int first,int end) {
	      while(first<end){
	           exchange(input,first,end);
	           first++;
	           end--;
	      }
	   }
	   void getDictionary(char c[]){
	       System.out.println(new String(c));
	       //boolean flag=true;
	       int i=0;
	       while(true){
	         i=c.length-1;
	          for(;i>0;i--){
	               if(c[i-1]<c[i])break;
	          }
	          if(i==0)break;
	          int minIndex=getMin(c,i-1);
	          exchange(c,i-1,minIndex);
	          reverse(c,i,c.length-1);
	          System.out.println(new String(c));
	       }
	       
	   }
	   public static void main(String []args){
	    String input="abc";
	    char [] c=input.toCharArray();
	    Arrays.sort(c);
	    new StringExpress().getDictionary(c);
	   }
	}