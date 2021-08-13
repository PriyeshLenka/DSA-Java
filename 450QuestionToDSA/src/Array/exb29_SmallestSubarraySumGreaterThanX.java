package Array;

public class exb29_SmallestSubarraySumGreaterThanX {
	static void smallestSubWithSum(int arr[], int n, int x)
    {
      
        int minLength = n + 1;
 
     
        for (int i = 0; i < n; i++)
        {
     
            int currentSum = arr[i];
 
            if (currentSum > x)
            	minLength=0;
 
   
            for (int j = i + 1; j < n; j++)
            {
           //System.out.println(minLength);
            	currentSum += arr[j];

                if (currentSum > x)
                	minLength =Math.min(minLength, j-i+1);
            }
        }
       System.out.println(minLength);
    }
	public static void main(String[] args) {
		 int arr1[] = {1, 4, 45, 6, 10, 19};
	        int x = 51;
	        int n1 = arr1.length;
	       smallestSubWithSum(arr1, n1, x);
	}

}
