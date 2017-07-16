package test;

public class BinarySort {
	
	public static void main(String[] args)  
    {  
        Runtime run = Runtime.getRuntime();
		double free1 = run.freeMemory();
        System.out.println("�ѷ����ڴ��е�ʣ��ռ� = " + free1/1024/1024 +"/MB");
        // �����������  
        int[] array = { 1, 0, 2, 5, 3, 4, 9, 8, 10, 6, 7};  
        BinarySort bs = new BinarySort();
        bs.binarySort(array);  
          
        // ��ʾ�����Ľ����  
        System.out.print("����� ");  
          
        for(int i = 0; i < array.length; i++)  
        {  
            System.out.print(array[i] + " ");  
        } 
        
        double free = run.freeMemory();

        System.out.println("�ѷ����ڴ��е�ʣ��ռ� = " + free/1024/1024);

          
    }  
	
	
	
	public void binarySort(int[] a){
		for(int i = 1;i<a.length ;i++){
			int temp = a[i]; 
			int low = 0;
			int high = i-1;
			while(low <= high){
				int mid = (low+high)/2;
				if(a[mid]<temp){
					low = mid+1;
				}else
					high = mid-1;
			}
			
			for(int j = i;j>=low+1;j--){
				
				a[j] = a[j-1];
			}
			a[low]=temp;
		}
	} 

}
