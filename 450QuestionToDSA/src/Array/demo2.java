package Array;
import java.util.Arrays;
public class demo2 {
	public static void maxWater(int[] arr, int n) 
	{
	     
	    int res = 0;
	    int left =0,right=0;
	    for(int i = 1; i < n - 1; i++)
	    {
	         
	         left = arr[i];
	        for(int j = 0; j < i; j++)

	            left = Math.max(left, arr[j]);

	         right = arr[i];
	         
	        for(int j = i + 1; j < n; j++)
	            right = Math.max(right, arr[j]); 
	        
	        res =res + Math.min(left, right) - arr[i];
	      
	    }System.out.println(res);
	   
	}
	 
	public static void main(String[] args)
	{
	    int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	    int n = arr.length;
	 
	    maxWater(arr,n);
	}
	}


