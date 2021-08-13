package Array;
//find duplicate in an array of N+1 Integers

public class exa11_FindDupli {

	public static void main(String[] args) {
		
int arr[]= {1,2,3,6,3,6,1};
	for(int i=0;i<arr.length;i++) 
		{
			int n=Math.abs(arr[i]);
			//System.out.println(n);
			if(arr[n]>=0) 
			{
				arr[n]= -arr[n];
			//System.out.println(arr[n]);
			}else System.out.println(n);
					
		}

	}

}
