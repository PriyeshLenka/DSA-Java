package Array;
//Write a program to cyclically rotate an array by one.

public class ex7_CycleArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};	
		int temp=0;		
		int x=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) 
		arr[i]=arr[i-1];
			
		arr[0]=x;
			
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		
	}

}
