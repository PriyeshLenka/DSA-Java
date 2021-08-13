package Array;

import java.util.Arrays;

public class exa13_MergeTwoSortedArray {

	public static void main(String[] args) 
	{
		int arr1[]= {1, 5, 9, 10, 15, 20};
		int arr2[]= {2, 3, 8, 13};
		int m=arr1.length;
		int n=arr2.length;
		System.out.println(m+" "+n);
		
	for(int i=n-1;i>=0;i--) 
		{
			int j,last=arr1[m-1];
				for(j=m-2;j>=0 && arr1[j]>arr2[i];j--)
					arr1[j+1]=arr1[j];
			
			if(j!=m-2||last>arr2[i]) 
				{
					arr1[j+1]=arr2[i];
					arr2[i]=last;
				}
		}		

		System.out.print("After Merging nFirst Array: "); 
        System.out.println(Arrays.toString(arr1)); 
        System.out.print("Second Array:  "); 
        System.out.println(Arrays.toString(arr2)); 

		}
	}
