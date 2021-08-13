package Matrix;

import java.util.Arrays;

public class ex5_SortedMatrix {
	private static void findMedian(int[][] mat, int r, int c) {
		int k=0;
		int [] arr=new int [r*c];
		
		  for (int i = 0; i < r; i++) 
	            for (int j = 0; j < c; j++) 
	                arr[k++] = mat[i][j]; 
		 
		  Arrays.sort(arr);
		  k = 0; 
		  for (int i = 0; i < r; i++) 
	            for (int j = 0; j < c; j++) 
	                mat[i][j] = arr[k++]; 
		  
		  for (int i = 0; i < r; i++) { 
	            for (int j = 0; j < c; j++) 
	                System.out.print( mat[i][j] + " "); 
	            System.out.println(); 
	        } 
	    }
	
	public static void main(String[] args) {
		int r = 3, c = 3; 
        int mat[][]= { {1,3,5}, {2,6,9}, {3,6,9} }; 
        findMedian(mat,r,c);

	}

}
