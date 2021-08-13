package String;

import java.util.Arrays;

public class exa14_NextPermutation {

	public static void main(String[] args) {
		//int[] arr = {0,1,2,3,4};// [0, 1, 2, 4, 3]
		//int[] arr = {0,1,4,3,2};// [0, 2, 1, 3, 4]
		//int[] arr = {0,1,4,2,3};// [0, 1, 4, 3, 2]
		int[] arr = {0,3,4,2,1}; // [0, 4, 1, 2, 3]
		int n=arr.length;
		findNextPermutation(arr);
		
			System.out.println(Arrays.toString(arr));
		
	}

	private static void findNextPermutation(int[] arr) {
		 int n=arr.length;
	        if(n==0|| arr==null)
				return;
	        
			int i=n-2;
			while(i>=0 && arr[i]>=arr[i+1])
				i--;
			System.out.println(i);
			if(i>=0) {
				int j=n-1;
				
				while(arr[j]<=arr[i])j--;
	           System.out.println(j);
	            swap(arr,i,j);
			}reverse(arr,i+1,arr.length-1);
			
		}
		private static void swap(int arr[],int i,int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		private static void reverse(int arr[],int i,int j) {
		while (i<j)
			swap(arr,i++,j--);
		}

}
