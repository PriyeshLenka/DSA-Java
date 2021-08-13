package String;

public class ex7_LongestPalindromicSubstring {
	// due to the for loop in the other class here i can check every char as mid
	static int findPalin(String s,int i, int j) {    // i = left   j = right
		
		if(s== null || i>j)return 0;
		while(i>=0 && j< s.length() &&s.charAt(i)==s.charAt(j) ) {
			i--;
			j++;
		}
		int res=j-i-1;
		return res;
	}
	
	static void printPalin(String s) {
		if(s == null || s.length() == 0)
			System.out.println("Nothing...");
		
		int start = 0,end=0;
		
		for(int i=0;i<s.length();i++) {  // loop for making every char as mid
			
			int ans1=findPalin(s,i,i);   // odd case
			int ans2=findPalin(s,i,i+1);  // even case
			int ans=Math.max(ans1, ans2);  // max of both case
			
			if(ans>end-start) {
				
				start=i-((ans-1)/2);
				end=i+(ans/2);
				
			}
		}
		System.out.println("");
		System.out.println("So the longest palindromic substring is: "+s.substring(start,end+1));
		int res=end+1-start;
		System.out.println("Of length: "+res);
	}
	
	public static void main(String[] args){
		
		String str = "aaaabbaa";
		printPalin(str);
	}
}