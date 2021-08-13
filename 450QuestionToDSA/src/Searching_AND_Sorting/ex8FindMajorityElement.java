package Searching_AND_Sorting;

public class ex8FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		int n=arr.length;
		int count=0;
		int maxCount=0;
		int index=-1;
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if (count > maxCount) {
	                maxCount = count;
	                index = i;
	            }
			}			
		}
		 if (maxCount > n / 2)
	            System.out.println(arr[index]);	 
	        else
	            System.out.println("-1");
	}
}
