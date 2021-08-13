package Array;

public class exc31_MinimumSwaps_K_Together {
	

    public static int minSwap (int arr[], int n, int k) {
          int count = 0; 
    for (int i = 0; i < n; i++) 
    if (arr[i] <= k) 
        count++; 

    int min = 0; 
    for (int i = 0; i < count; i++) 
    if (arr[i] > k) 
        min++; 
    int ans = min; 
    for (int i = 0, j = count; j < n; ++i, ++j) { 
  
    if (arr[i] > k) 
        --min; 
    if (arr[j] > k) 
        ++min; 
    ans = Math.min(ans, min); 
    } 
    return ans; 
			  
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		int x=5;
		int n=arr.length;
		int ans=minSwap(arr,n,x);
		System.out.println(ans);
	}

	

}
