package Matrix;

import java.util.Arrays;

public class ex3_MedianSortedMatrix {
		private static void findMedian(int[][] mat, int r, int c) {
			int k=0;
			int [] arr=new int [r*c];
			
			  for (int i = 0; i < r; i++) 
		            for (int j = 0; j < c; j++) 
		                arr[k++] = mat[i][j]; 
			
			  Arrays.sort(arr);
			  
			  for (int i = 0; i < 9; i++)
				  System.out.println(arr[i]);
			
		    }
  
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int r = 3, c = 3; 
        int mat[][]= { {1,3,5}, {2,6,9}, {3,6,9} }; 
          
        findMedian(mat,r,c);
        
        long endTime = System.nanoTime();
		 long timeElapsed = endTime - startTime;
		 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		 
	        System.out.println("Execution time in milliseconds : " +
	                                timeElapsed / 1000000);
        
	}
}
