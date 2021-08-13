package Array;

public class exb23_elementAppersMoreThanNK {
	public static void find(int[] arr,int  x){
		 
		int count[] = new int[200];
		int n=arr.length;
		
		for (int i = 0; i < n; i++)
            count[arr[i]]++;
		
		int[]temp=new int[arr.length];
		 
		for (int i = 0; i < n; i++) {
	          temp[i]=arr[i];
	          int find = 0;
	        for (int j = 0; j <= i; j++) {
	              if (arr[i]== temp[j])
	                  find++;
	            }
	            if (find == x)
	                System.out.println("Number of Occurrence of " + arr[i] + " is: " + count[arr[i]]);
	        }		
	  }
	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7,7, 8, 4, 4};
	    int n = arr.length;
	    int k = 3;
	    int x=n/k;
	    find(arr,x);	
	}
}