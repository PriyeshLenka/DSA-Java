package Array;
//Minimise the maximum difference between heights [V.IMP]

public class ex9_MinTheMaxDiff {

	public static void main(String[] args) {
		int arr[]= {2,6,3,4,7,2,10,3,2,1};
		int k=5;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<=k) 
			{
				arr[i]=arr[i]+k;	
					
			}else 
				if(arr[i]>k)
				arr[i]=arr[i]-k;
		}
		
	for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
		
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
		}
		int MinMaxDiff=max-min;
		System.out.println("Maximum difference between heights = "+MinMaxDiff);
	}

}
