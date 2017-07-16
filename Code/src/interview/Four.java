package interview;


import java.util.HashSet;

public class Four {

	public static boolean resolve(int[] A) {
		
		if (A.length < 7) {
			return false;
		}
		HashSet<Integer> aSet = new HashSet<Integer>();
		for(int i : A) {
			aSet.add(i);
		}
		if (aSet.size() == 1 ) {
			if((A.length-3)%4 == 0)
				return true;
			else
				return false;
		}
		int left = 1;
		int right = A.length - 2;
		int leftSum = A[0];
		int rightSum = A[A.length - 1];
		while(left + 2< right){
			if (leftSum == rightSum) {
				int middleSum = 0;
				for (int i = left + 1; i < right; i++) {
					middleSum += A[i];
				}
				int avg = leftSum;
				int index = left + 1;
				while( avg > 0) {
					avg -= A[index];
					index++;
				}
				if (avg == 0){
					return true;
				} else {
					leftSum += A[left];
					left++;
					rightSum += A[right];
					right++;
					
				}
				
			} else if(leftSum < rightSum) {
				leftSum += A[left];
				left++;
			} else if(leftSum > rightSum) {
				rightSum += A[right];
				right--;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{10,2,11,13,1,1,1,1,1};
		int[] B = new int[]{2,5,1,1,1,1,4,1,7,3,7};
		int[] C = new int[]{1,1,1,1,1,1,1,1};
		System.out.println(resolve(A));
		System.out.println(resolve(B));
		System.out.println(resolve(C));
	}

}
