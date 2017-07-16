package day06;

import java.util.Arrays;

/*
 next_permutation算法

定义

升序：相邻两个位置ai < ai+1，ai 称作该升序的首位

步骤（二找、一交换、一翻转）

找到排列中最后（最右）一个升序的首位位置i，x = ai

找到排列中第i位右边最后一个比ai 大的位置j，y = aj

交换x，y

把第(i+ 1)位到最后的部分翻转


  */
public class prePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String input="abc";
	    char [] c=input.toCharArray();
	    Arrays.sort(c);
	    while(true){
	   new  prePermutation().permutation(c);
	    }
	}
	
	
	void permutation(char[] ch){
		System.out.println(new String(ch));
		int i;
		while(true){
			i = ch.length-1;
			//默认字符数组是按照abc的顺序已经排好了。
			//右边第一个需要往前调的元素
			for(;i>0;i--){
				if(ch[i]>ch[i-1])
					break;
			}
			//没有需要调的
			if(i == 0)return;
			//i右边最小
			int minIndex = getMin(ch,i-1);
			//交换最小与i
			swap(ch,i-1,minIndex);
			//i后面翻转
			reverse(ch,i,ch.length-1);
			System.out.println(new String(ch));
			
		}
		
		
	}


	private void reverse(char[] ch, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j){
			swap(ch,i,j);
			i++;
			j--;
		}
	}

	private void swap(char[] ch, int i, int minIndex) {
		// TODO Auto-generated method stub
		char temp = ch[i];
		ch[i] = ch[minIndex];
		ch[minIndex] = temp;
	}

	private int getMin(char[] ch, int i) {
		// TODO Auto-generated method stub
		int minIndex = i+1;
		char min = ch[i];
		for(int j = i+1;j<ch.length;j++)
			if( ch[j]>min ){
				
				minIndex = j;
			}
		return minIndex;
	}

	
/*	void permutation(char[] ch){
		if(ch.length ==0)
			throw new RuntimeException("empty arrays !");
		else{
			System.out.println(new String(ch));
			int i = ch.length-1;
			//找出右边第一个升序的
			for (; i > 0; i--) {
				if(ch[i-1]<ch[i])
					break;
			}
			if(i==0){
				return ;
			}
			
			//i右边最小的
			int  j =0;
			for(j=i+1;j<ch.length;j++){
				if(ch[j]<ch[i])					
					break;					
			}
			
			//交换
			char temp = ch[i];
			ch[i] = ch[j-1];
			ch[j-1] = temp;
			
			//翻转
			
			int from = i;
			int to = ch.length-1;
			while(from<to){
				temp = ch[from];
				ch[from] = ch[to];
				ch[to] = temp;
				from++;
				to--;
			}
			
			System.out.println(new String(ch));
			
		}*/
	
	

}
