package Matrix;

public class ex2_SearchIn2DMatrix {
	private static void findNum(int[][] mat, int rows, int columns,int k) {
		int i=0,j=columns;
		while(i<rows ) {
			if(k<=mat[i][j-1]) {
			
			break;
			}
			else i++;
		}
			int r=i;
			int c=j;		
			int y=0;
			for(int x=0;x<c;x++) {
				if(k==mat[r][x])
					y++;	
			}  
			
			if(y==1)System.out.println("found");
			else System.out.println("not found");
			
	}              
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		// TODO Auto-generated method stub
		int[][] mat = {{1,   3,  5,  7},{10, 11, 16, 20}, {23, 30, 34, 50}};
		//System.out.println(mat[0][1]);
		int rows = mat. length;
		int columns = mat[0]. length;
		//System. out. println(rows);
		//System. out. println(columns);
		int k=3;
		findNum(mat,rows,columns,k);
		
		long endTime = System.nanoTime();
		 long timeElapsed = endTime - startTime;
		 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		 
	        System.out.println("Execution time in milliseconds : " +
	                                timeElapsed / 1000000);
	}



}
