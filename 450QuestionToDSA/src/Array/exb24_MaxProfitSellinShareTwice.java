package Array;

public class exb24_MaxProfitSellinShareTwice {
		private static void findProfit(int[] arr) {
			int n=arr.length;
			int profit=0,ans=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					
					profit=arr[j]-arr[i];
					j++;i++;
							System.out.println(profit);
					}
						
				}	
			}		
		
	public static void main(String[] args) {
		
		int price[] = {2, 30, 15, 10, 8, 25, 80};
		findProfit(price);
		
	}
}
