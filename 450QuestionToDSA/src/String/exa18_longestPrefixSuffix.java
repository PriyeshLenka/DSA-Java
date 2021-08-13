package String;

public class exa18_longestPrefixSuffix {

	public static void main(String[] args) {
		String s = "blablabla";
	    System.out.println(longestPrefixSuffix(s));

	}

	private static int longestPrefixSuffix(String s) {
		int n=s.length();
		if(n < 2) {
	          return 0;
	      }
		int len=0;
		int i=(n+1)/2;
		 while(i < n)
	      {
	 
	        
	        if(s.charAt(i) == s.charAt(i))
	        {
	          ++len;
	          ++i;
	        }
	        else
	        {
	          i = i - len + 1;
	          len = 0;
	        }
	      }
		
		return len;
		
	}

}
