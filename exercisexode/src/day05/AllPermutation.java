package day05;

public class AllPermutation {
	
	public static void main(String[] args){
		char[] ch = {'a','b','c'};
		AllPermutation ap = new AllPermutation();
		ap.allPermutation(ch,0,ch.length-1);
	}
	
	void allPermutation(char[] ch,int start,int end)
	{
		if(ch.length == 0)
			throw new RuntimeException("empty array !");
		else{

			if(start==end){
				for(int i=0;i<=end;i++)
					System.out.print(ch[i]);
				System.out.println();
			}
			else{
				for(int i=start; i<=end; i++){
					
					char temp = ch[start];
					ch[start]  = ch[i];
					ch[i] = temp;

					allPermutation(ch,start+1,end);
					
					temp = ch[start];
					ch[start] = ch[i];
					ch[i] = temp;
				}
			}			
		}
	}

	
	
}



