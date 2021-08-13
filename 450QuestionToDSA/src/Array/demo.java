package Array;

import java.util.Arrays;

public class demo {
static int getMinDiff(int arr[], int n, int k) 
{ 
    if (n == 1) 
    return 0; 

    // Sort all elements 
    Arrays.sort(arr); 

    // Initialize result 
    int ans = arr[n-1] - arr[0]; 

    // Handle corner elements 
    int small = arr[0] + k; 
    int big = arr[n-1] - k; 
    int temp = 0; 
      
    if (small > big) 
    { 
        temp = small; 
        small = big; 
        big = temp; 
    } 
    for (int i = 1; i < n-1; i ++) 
    { 
        int subtract = arr[i] - k; 
        int add = arr[i] + k; 
 
        if (subtract >= small || add <= big) 
            continue;  
        if (big - subtract <= add - small) 
            small = subtract; 
        else
            big = add; 
    } 

    return Math.min(ans, big - small); 
} 


	public static void main(String[] args) {
		int arr[] = {2,6,3,4,7,2,10,3,2,1}; 
        int n = arr.length; 
        int k = 5; 
        System.out.println("Maximum difference is "+ 
                            getMinDiff(arr, n, k));

	}

}
