package Array;

import java.util.Arrays;

public class exb22_LongestConsecutiveSubsequence {
		
	private static void findConc(int[] arr)
	{
		int count=0,answer=0;
		int n=arr.length;
		Arrays.sort(arr);
		
          for(int i=1;i<n;i++) {
        	  
        	  if(arr[i]==arr[i-1]+1) {
        		  
            		 count++;
            		 
            	 }else count=0;       	  
            	 answer=Math.max( answer, count);
             }
             System.out.println(answer+1);
	}
	public static void main(String[] args) 
	{	
		
		int arr[]={1, 9, 3, 10, 4, 20, 2};
		findConc(arr);	
		
	}   
}//1,3,5,11,12,13,14,20
