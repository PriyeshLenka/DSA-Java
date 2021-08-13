package Searching_AND_Sorting;

import java.util.Arrays;

public class ex7FindMissingAndRepeating {
	static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");
 
        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0) {
            	arr[abs_val - 1] = -arr[abs_val - 1];
            	System.out.println(arr[abs_val - 1]);
            }
                
            else
                System.out.println(abs_val);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 1, 3, 4, 5, 1, 6, 2 };
		int n=arr.length;
//		Arrays.sort(arr);
		//printTwoElements(arr, n);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		int rsum=(n*(n+1))/2;
		System.out.println("repeating number = "+(rsum-sum));
	}

}
