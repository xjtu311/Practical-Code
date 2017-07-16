package test;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,8,3,1,5,6,7,8,9,12};
		print(a);
		sort(a);
		print(a);

	}
	
	private static void print(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" , ");
		}
		System.out.println();
	}

	public static void sort(int[] a){
		
		for(int i=1;i<a.length;i++)
			for(int j=0;j<i;j++){
				if(a[j]>=a[i]){
					int temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
		
	}

}
