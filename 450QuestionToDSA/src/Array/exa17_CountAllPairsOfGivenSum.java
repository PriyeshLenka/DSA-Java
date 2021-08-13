package Array;

import java.util.*;

public class exa17_CountAllPairsOfGivenSum 
{
	public static void countPairGivenSum(int[] arr, int n, int k)
	{
		int count=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{	
				if(arr[i]+arr[j]==k) 
				{
					count++;
				}
			}
		}  System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10, 12, 10, 15, -1, 7, 6, 
                5, 4, 2, 1, 1, 1};
		int n=arr.length;
		System.out.println("Enter the sum you want: ");
		int k=sc.nextInt();                      //let's say the number is 6 so according to the array 
		                                        //there is only 2 pairs that satisfy the sum i.e. 1+5 and 5+1 
		System.out.println("So total pairs on integer array whose sum is equal to "+k+" is = ");
		countPairGivenSum(arr,n,k);
	}

	
}
