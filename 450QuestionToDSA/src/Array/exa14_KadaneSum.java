package Array;
class maxiSum{
	int Sum(int arr[]) {
		int n=arr.length;
		int msf=Integer.MIN_VALUE;
		int meh=0;
		for(int i=0;i<n;i++) {
			meh=meh+arr[i];
			if(msf<meh)
				msf=meh;
			if(meh<0)
				meh=0;
		}
			return msf;
	}
}
public class exa14_KadaneSum {

	public static void main(String[] args) 
	{
		int [] arr = {-1,-2,-3,-4}; 
	       maxiSum ms=new maxiSum();
	       System.out.println("Maximum contiguous sum is " + ms.Sum(arr));

	}

}
