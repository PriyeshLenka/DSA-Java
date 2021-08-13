package Array;

public class exb30_ThreeWayPartitioning {
		private static void threeWayPartition(int[] arr, int min, int max) {
			int n=arr.length; int start=0; int end=n-1;
			for(int i=0;i<end;) {
				
				if(arr[i]<min) {
					
					int temp = arr[start]; 
		                arr[start] = arr[i]; 
		                arr[i] = temp; 
		                start++; 
		                i++; 				
		              }
				
				else if(arr[i]>max) {
					
					int temp = arr[end]; 
		                arr[end] = arr[i]; 
		                arr[i] = temp; 
		                end--; 
				}
				else i++;
			}for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			}
	public static void main(String[] args) {
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}; 
        
        threeWayPartition(arr, 14, 20); 

	}
}
