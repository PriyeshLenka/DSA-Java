package Array;

public class exb21_MaximumProductSubarray {
		static int maxSum(int arr[]) {
			int n=arr.length;
			
			int product=1;
			
			for (int i=0;i<n;i++) {
				if(arr[i]!=0)product=product*arr[i];
				else break;				
			}
			return product;
		}
	
	public static void main(String[] args) {
		
		 int [] arr = {6, -3, -10, 0, 2}; 
	      int sum=maxSum(arr);
	      System.out.println(sum);
		 
	}

}
