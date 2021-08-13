package Array;
//Largest Sum Contiguous Subarray
class maxSum{
	int Sum(int arr[]) {
		int n=arr.length;
		int msf=Integer.MIN_VALUE;//msf:-max so far
		int meh=0;                //meh:-max end here
		for (int i=0;i<n;i++) {
			meh=meh+arr[i];
			if(msf<meh)
			msf=meh;
			if(meh<0)
				meh=0;
		}
		return msf;
	}
}
public class ex8_KadaneSum {

	public static void main(String[] args) {
		 int [] arr = {7,1,5,3,6,4}; 
	       maxSum ms=new maxSum();
		 System.out.println("Maximum contiguous sum is " + ms.Sum(arr)); 
		
	}

}
