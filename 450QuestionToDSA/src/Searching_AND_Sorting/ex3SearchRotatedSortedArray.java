package Searching_AND_Sorting;

public class ex3SearchRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2};
		int target=	0;
		int s=search(arr,target);
		System.out.println(s);
	}
	 public static int search(int[] nums, int target) {
	        int res=-1;
	        for(int i=0;i<nums.length;i++){
	            if(target==nums[i])res=i;
	           
	        }
	        return res;
	    }
}
