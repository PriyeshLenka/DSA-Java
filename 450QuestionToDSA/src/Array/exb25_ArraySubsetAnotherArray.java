package Array;

public class exb25_ArraySubsetAnotherArray {
private static boolean isSubset(int[] arr1, int[] arr2) {
	  int m = arr1.length;
	        int n = arr2.length;int i=0,j=0;
	        while(i<m && j<m) {
	        	if(arr2[j]==arr1[i]) {
	        		break;
	        	} if (j == m)
	                return false;
	        }
			return true;
		
		
	}

	public static void main(String[] args) {
		 int arr1[] = { 11, 1, 13, 21, 3, 7 };
	        int arr2[] = { 11, 3, 7, 1 };
	
	        if (isSubset(arr1, arr2))
	            System.out.print("arr2[] is "
	                             + "subset of arr1[] ");
	        else
	            System.out.print("arr2[] is "
	                             + "not a subset of arr1[]");
	}

	
}
