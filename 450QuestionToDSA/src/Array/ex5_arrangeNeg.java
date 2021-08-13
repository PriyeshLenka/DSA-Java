package Array;
//Move all the negative elements to one side of the array 

import java.util.Arrays;

public class ex5_arrangeNeg 
{

	public static void main(String[] args) 
	{
	int arr[]= {-12,11,-13,-5,6,-7,5};
//	Arrays.sort(arr);
//	for(int i=0;i<arr.length;i++)
//	System.out.println(arr[i]);
	int i,j=0,temp;
	
	for(i=0;i<arr.length;i++) 
	{
		if(arr[i]<0)
		{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
		}
	}	
	for( i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");

	}

}
