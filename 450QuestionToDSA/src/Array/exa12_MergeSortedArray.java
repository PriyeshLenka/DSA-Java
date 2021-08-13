package Array;

import java.util.Arrays;

public class exa12_MergeSortedArray {

	public static void main(String[] args) {
		int arr1[]= {7,1,5,2,3};
		int arr2[]= {3,8,6,20,7,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int arr3[]=new int[arr1.length + arr2.length];

		int i=0,j=0,k=0;
		
		while (i<arr1.length && j<arr2.length) 
		{
			if(arr1[i]<arr2[j])
				arr3[k++]=arr1[i++];
			
			else arr3[k++]=arr2[j++];
			
		}
		while(i<arr1.length)
			arr3[k++]=arr1[i++];
		
		while(j<arr2.length)
		{
			arr3[k++]= arr2[j++];
		}
for(int x=0;x<arr3.length;x++)
	System.out.println(arr3[x]);

	}

}
