package day06;

import java.util.Arrays;

/*
 next_permutation�㷨

����

������������λ��ai < ai+1��ai �������������λ

���裨���ҡ�һ������һ��ת��

�ҵ�������������ң�һ���������λλ��i��x = ai

�ҵ������е�iλ�ұ����һ����ai ���λ��j��y = aj

����x��y

�ѵ�(i+ 1)λ�����Ĳ��ַ�ת


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
			//Ĭ���ַ������ǰ���abc��˳���Ѿ��ź��ˡ�
			//�ұߵ�һ����Ҫ��ǰ����Ԫ��
			for(;i>0;i--){
				if(ch[i]>ch[i-1])
					break;
			}
			//û����Ҫ����
			if(i == 0)return;
			//i�ұ���С
			int minIndex = getMin(ch,i-1);
			//������С��i
			swap(ch,i-1,minIndex);
			//i���淭ת
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
			//�ҳ��ұߵ�һ�������
			for (; i > 0; i--) {
				if(ch[i-1]<ch[i])
					break;
			}
			if(i==0){
				return ;
			}
			
			//i�ұ���С��
			int  j =0;
			for(j=i+1;j<ch.length;j++){
				if(ch[j]<ch[i])					
					break;					
			}
			
			//����
			char temp = ch[i];
			ch[i] = ch[j-1];
			ch[j-1] = temp;
			
			//��ת
			
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
