package Array;
//Find the maximum and minimum element in an array
class MinMax{
	void MinMax(int arr[]) {
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
			else if(arr[i]>max)max=arr[i];
		}
		System.out.println(min);
		System.out.println(max);
	}
}
public class ex2_MaxMin {

	public static void main(String[] args) {
		int arr[]= {-1,-3,4,6,8,5,6,7,9};
		MinMax m=new MinMax();
		m.MinMax(arr);
		
	}
}	
		
	
	


