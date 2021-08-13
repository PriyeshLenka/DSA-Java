package Array;

public class exb27_TrappingRainWater {
		private static void isTrap(int[] arr,int n) { 		
//		int n=arr.length,length=0,breadth=0,sum=0,f=0;
//		
//		if(arr[0]<=arr[n-1])
//			f=arr[0];
//		if(arr[0]>=arr[n-1]) 
//			f=arr[n-1];
//	
//	
//	for(int i=0;i<n;i++) 
//		if(arr[i]>f)
//			arr[i]=f;
//			
//	for(int i=1;i<n-1;i++) { 
//		if(arr[i]!=0) 
//			sum=sum+arr[i];
//			breadth++;
//	}
//			length=f;
//			//System.out.println(length+" "+breadth+" "+sum);
//			int area=(length*breadth)-sum;
//			if(area==0)System.out.println("No water will be trapped.");
//			else System.out.println("Water trapped = "+area );
//		}{
		     
		    int res = 0;
		    int left =0,right=0;
		    for(int i = 1; i < n - 1; i++)
		    {
		         
		         left = arr[i];
		        for(int j = 0; j < i; j++)

		            left = Math.max(left, arr[j]);

		         right = arr[i];
		         
		        for(int j = i + 1; j < n; j++)
		            right = Math.max(right, arr[j]); 
		        
		        res =res + Math.min(left, right) - arr[i];
		      
		    }System.out.println(res);
		   
		}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
  int n = arr.length;
  
    isTrap(arr,n);
   
	}

}
