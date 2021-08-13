package Array;

public class exc34_MedianOfTwoSorted {
		private static void mergeAndMedian(int[] arr1, int[] arr2,int n,int m,int[] arr3) {

			 int i = 0, j = 0, k = 0;
		     int x=n+m;
		        while (i<n && j <m)
		        {
		            if (arr1[i] < arr2[j])
		                arr3[k++] = arr1[i++];
		            else
		                arr3[k++] = arr2[j++];
		        }
		     
		        while (i < n)
		            arr3[k++] = arr1[i++];
		     
		        while (j < m)
		            arr3[k++] = arr2[j++];
		        
		        System.out.println("Array after merging");
		        for (int a=0; a < n+m; a++)
		            System.out.print(arr3[a] + " ");
		        System.out.println("");
		        System.out.println("");
		        
		        if(x%2!=0) {
					int p=(x+1)/2;
					System.out.println(arr3[p-1]+" is the median of the two arrays");
				}
				if(x%2==0) {
					int p=x/2;
					int q=(x+1)/2;
					int ans=(arr3[p-1]+arr3[q])/2;
					// System.out.println(arr[i-1]+" "+arr[j]);
					System.out.println(ans+" is the median of the two arrays");
				}
				
	}
	public static void main(String[] args) {
	
		int arr1[] = {-5, 3, 6, 12, 15};
        int arr2[] = {-12, -10, -6, -3, 4, 10};
        
        int n=arr1.length;
        int m=arr2.length;
        int []arr3 = new int[n+m];
        
        mergeAndMedian(arr1,arr2,n,m,arr3);
        
       
        
	}
}
