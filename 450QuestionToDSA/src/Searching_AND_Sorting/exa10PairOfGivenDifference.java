package Searching_AND_Sorting;

public class exa10PairOfGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 20, 3, 2, 5, 80};
		int k=78;
		int n=arr.length;
		boolean x=difference(arr,n, k);
		if(x==true)System.out.println("1");
		else System.out.println("-1");
		
	}

	private static boolean difference(int[] arr,int n,int k) {
		// TODO Auto-generated method stub
		int maxDiff=0;
		int minNum=arr[0];
		int diff=0;
		int flag=0;
		for(int i=0;i<n;i++) {
			minNum=Math.min(minNum, arr[i]);
			diff=arr[i]-minNum;
			maxDiff=Math.max(maxDiff, diff);
			if(maxDiff==k) {
				flag=1;
				break;
			}
		}
		if(flag==1)return true;
		return false;
	}

}
