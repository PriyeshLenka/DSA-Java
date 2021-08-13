package Array;
//Write a program to reverse an array or string
class Reverse{
	void RArray(int arr[]) {
		int i=0,temp=0;
		int j=arr.length;
		
		while(i<j-1) {
			temp=arr[i];
			arr[i]=arr[j-1];
			arr[j-1]=temp;
			i++;
			j--;
		}
		for(i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
		}
	}	
}


public class ex1_Reverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		Reverse ra=new Reverse();
		ra.RArray(arr);
		System.out.println(" ");
		String s="pop & oyo & 777";
		Reverse sa=new Reverse();
	char [] arr1=s.toCharArray();
	 for(int i=arr1.length-1;i>=0;i--)
		 System.out.print(arr1[i]);
		 
	}

}
