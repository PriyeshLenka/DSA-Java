package String;

public class exb26_longestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int p=6;             // Take size of both the strings as input
		    int q=6;
		    
		    String s1="ABCDGH";           // Take both the string as input
	        String s2="AEDFHR";
		    
		   
		    int n=lcs(p, q, s1, s2);
		    System.out.println(n);
	}

	static int lcs(int x, int y, String s1, String s2)
    {
		String s=s1+s2;
		
		
		return 0;
        
    }

}
