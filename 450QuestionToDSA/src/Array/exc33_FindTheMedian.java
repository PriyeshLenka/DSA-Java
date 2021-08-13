package Array;

import java.util.Arrays;

public class exc33_FindTheMedian {
	private static void findMedian(int[] arr, int n) {
			// TODO Auto-generated method stub
		Arrays.sort(arr);
		
			if(n%2!=0) {
				int i=(n+1)/2;
				System.out.println(arr[i-1]);
			}
			if(n%2==0) {
				int i=n/2;
				int j=(n+1)/2;
				int ans=(arr[i-1]+arr[j])/2;
				// System.out.println(arr[i-1]+" "+arr[j]);
				System.out.println(ans);
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {90,100,78,89,67};
		int n=arr.length;
		findMedian(arr,n);
	}
}
