package test;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,8,3,1,5,6,7,8,9,12};

		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" , ");
		}
	}
	
	public static void sort(int[] a){
		for (int i = 1; i < a.length; i++) {
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
	

}
