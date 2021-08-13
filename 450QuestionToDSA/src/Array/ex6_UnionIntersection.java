package Array;
//Find the Union and Intersection of the two sorted arrays.

import java.util.Arrays;

class UnionIntersection{
	int Intersection(int arr1[],int arr2[]) 
	{
		int flag=0;
		int i=0,j=0;
		
		while(i<arr1.length && j<arr2.length) 
		{
			if(arr1[i]<arr2[j]) 
			{
				i++;
			
			}else
				
				if(arr1[i]>arr2[j]) 
			
			{
			   j++;
			
			}
			else 
				{
					System.out.print("["+arr2[j]+"]"+" ");
					i++;flag++;
				}
		}
		
		System.out.print("are the intersection of the given array");
		return flag;
	}
	
	public void Union(int[] arr1, int[] arr2, int n) 
	{
		int x=arr1.length+arr2.length,i=0,j=0,k=0;
		int arr3[]=new int[x];
					     
		for( i=0;i<arr1.length;i++) 
			arr3[j++]=arr1[i];
			
		for( i=0;i<arr2.length;i++)
			arr3[j++]=arr2[i];
		
		Arrays.sort(arr3);
					
		int f=0; 
		int temp []=new int[arr3.length-2];		
		
		for( i=0;i<arr3.length-1;i++) 		
			if(arr3[i] != arr3[i+1])
				temp[f++]=arr3[i];
		
		temp[arr3.length-(n+1)]=arr3[arr3.length-1]; // just to store last element
		
		System.out.println(Arrays.toString(temp)+"is the union of the two given array");

	}	
}
public class ex6_UnionIntersection {

	public static void main(String[] args) 
	{
		int arr1[]= {7,1,5,2,3};
		int arr2[]= {3,8,6,20,7};
		UnionIntersection ui=new UnionIntersection();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
	
		int n=ui.Intersection(arr1,arr2);	
			System.out.println(" ");
			System.out.println(" ");
		
		ui.Union(arr1,arr2,n);
	}

}
