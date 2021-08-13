package Array;

public class exb26_TripletSumArray {

	
	private static void isTriplet(int[] arr, int x) {
	
	for (int i = 0; i < arr.length; i++)   
        for (int j = i + 1; j <arr.length; j++)
            for (int k = j + 1; k < arr.length; k++)
                if (arr[i] + arr[j] + arr[k] == x)
                    System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]); 
			}
	
	public static void main(String[] args) {
		
		int[] arr = {12, 3, 4, 1, 6, 9};
		int x=24;
		isTriplet(arr,x);
	}
}
