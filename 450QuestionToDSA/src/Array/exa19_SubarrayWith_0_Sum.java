package Array;

import java.util.HashSet;
import java.util.Set;

public class exa19_SubarrayWith_0_Sum {
	private static boolean findSum0(int[] arr) {
//		int sum=0,meh=0;
//		for (int i=0;i<n;i++) {
//			meh=meh+arr[i];
//			if(sum==meh)
//				System.out.println("Yes");
//		
//		}
//		System.out.println("mm");	
		 Set<Integer> hs = new HashSet<Integer>();
		 
	        int sum = 0;
	 
	        for (int i = 0; i < arr.length; i++) 
	        {
	            sum = sum+arr[i];
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum) ) {
	            	
	            	System.out.println(sum);
	                return true;
	            }
	            hs.add(sum);
	        }
	        return false;
	}
	public static void main(String[] args) {
		
		 int arr[] = { 4,2,-3,1,6 };
		 int n=arr.length;
		 findSum0(arr);
		 if (findSum0(arr))
	            System.out.println(
	                "Found a subarray with 0 sum");
	        else
	            System.out.println("No Such Sub Array Exists!");
	}
}
