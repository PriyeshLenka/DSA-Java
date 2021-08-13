package Array;

import java.util.Arrays;

public class exb28_ChocolateDistributionProblem {
		private static void findMinDiff(int[] arr, int n, int m) {
			Arrays.sort(arr);			
			int min=Integer.MAX_VALUE;
			 
			for (int i = 0; i+m-1<n; i++) {
			        int diff = arr[i+m-1]-arr[i];
			        min=Math.min(min, diff);
			    }System.out.println(min);
		}
		
	public static void main(String[] args) {
		int arr[] = {7, 3, 2, 4, 9, 12, 56};
                
    int m = 3;  // Number of students
     
    int n = arr.length;
   findMinDiff(arr, n, m);
         

	}

	

}
