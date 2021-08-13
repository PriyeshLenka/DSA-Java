package Searching_AND_Sorting;

import java.util.Scanner;

public class ex1FirstAndLastOccurenceOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			arr[i]=num;			
		}
		findOccurence(arr,x);
	}

	private static void findOccurence(int[] arr, int x) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				System.out.println(i);
				break;
			}
			
		}
		for(int i=n-1;i>0;i--) {
			if(arr[i]==x) {
				System.out.println(i);
				break;
			}
		}
	
	}
}