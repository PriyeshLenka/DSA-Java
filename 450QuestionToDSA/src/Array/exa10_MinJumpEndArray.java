package Array;
import java.util.*;
public class exa10_MinJumpEndArray {
public static int[] subArray(int[] arr,int beg,int end){
	return Arrays.copyOfRange(arr, beg, end+1);
}
	public static void main(String[] args) 
	{
		//int arr[]= {1,3,5,8,9,2,6,7,6,8,9};
		//int arr[]= {1,4,3,2,6,7};
		//int arr[]= {1,1,1,1,1,1,1,1,1,1,1};
		//int arr[]= {3,2,0,0,2,0,1};
		int arr[]= {1,2,1,1,0,7};
		int flag=0;
		// l=arr[arr.length-1];
	//	System.out.println(l);
		for (int i=0;i<arr.length-1;i++) {
			//System.out.println(arr[i]);
		int j=Math.abs(arr[i]-1);
	System.out.println("j = "+j);
		i=i+j;
//		if(i+arr[i]==arr.length-1)
//			System.out.println("y");
		int [] subarr=subArray(arr,i,i+1);
		flag++;
		
		System.out.println(i+1+" = i ");
		System.out.println(Arrays.toString(subarr));
		int subarray[]=new int[subarr.length];
		for(int k=0;k<subarr.length;k++) 
		{
			subarray[k]=subarr[k]+k;
		}		
		System.out.println(Arrays.toString(subarray));
		int max=subarray[0];
		
		for(int k=0;k<subarray.length;k++)
		{
			max=Math.max(max, subarray[k]);
		}
		System.out.println("max"+max);
		
		
	}
		System.out.println(flag);	
		
	}

}
