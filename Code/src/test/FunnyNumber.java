package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class FunnyNumber {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
             
            Arrays.sort(a);
            //如果数组中的值全相同，直接两两组合
            if(a[0] == a[n-1]){
                int tmp = (n*(n-1))/2;
                System.out.println(tmp + " " + tmp);
                continue;
            }
            //map用来统计
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            for(int i=0;i<n;i++){
                if(map.containsKey(a[i]))
                    map.put(a[i], map.get(a[i])+1);
                else
                    map.put(a[i], 1);
            }
            //求差最小个数
            int minres = 0;
            if(map.size() == n){
                int min = Math.abs(a[1]-a[0]);
                for(int i=2;i<n;i++){
                    int tmp = Math.abs(a[i]-a[i-1]);
                    if(tmp == min)
                        minres++;
                    else if(tmp < min){
                        min = tmp;
                        minres = 1;
                    }
                }
            }else{
                for(Integer key : map.keySet()){
                    int val = map.get(key);
                    if(val > 1){
                        minres += (val * (val-1))/2;
                    }
                }
            }
            //求差最大个数
            int maxres = 0;
            List<Integer> keyset = new ArrayList<Integer>(map.keySet());
            int val1 = map.get(keyset.get(0));
            int val2 = map.get(keyset.get(keyset.size()-1));
            maxres = val1 * val2;
            System.out.println(minres + " " + maxres);         
        }
    }
 
}



/*
import java.util.Scanner;

public class FunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] a = scan.nextInt();

		}

		int[] a ={6};
		int[] b={45,12,45,32,5,6};
		System.out.println(getMin(a,b)+"  "+getMax(a,b));

	}
	
	
	public static int getMin(int[] a,int[] b){
		
		int temp = 0,count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]-b[j]<temp){
					temp = a[i]-b[j];
					count = 1;
				}else if(a[i]-b[j]==temp)
					count++;				
			}
		}
		return count;
	}
	
	
	public static int getMax(int[] a,int[] b){
		
		int temp = 0,count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]-b[j]>temp){
					temp = a[i]-b[j];
					count = 1;
				}else if(a[i]-b[j]==temp)
					count++;				
			}
		}
		return count;
	}
	

}


*/