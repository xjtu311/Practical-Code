package test;

public class Quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,8,4,1,5,8,9,7,6,45,20,15,65,2};

		sort(a,0,a.length-1);

		
	}
	
	
	private static void print(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" , ");
		}
		System.out.println("\n");
	}

	public static void sort(int[] a,int low,int high){
		int l = low;
		int h = high;
		int key = a[low];
		
		while( l < h ){
			
			while(l<h && key <= a[h])
				h--;
			
				if(l<h){
					int temp = a[h];
					a[h] = a[l];
					a[l] = temp;
					l++;
			    }
				
			while(l<h && key >= a[l] )
				l++;
			
			if(l<h){
				int temp = a[h];
				a[h] = a[l];
				a[l] = temp;
				h--;
				
			}
				
		}
		print(a);
		System.out.println("l="+(l+1)+" h="+(h+1)+" key="+ key);
		if(l>low) sort(a,low,l-1);
		if(h<high) sort(a,l+1,high);
		
	
	}

}
 
