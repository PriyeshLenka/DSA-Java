package String;

public class exa13_EditDist {

	public static void main(String[] args) {
		 String s1 = "geek";
		    String s2 = "geesek";
		    EditDistDP(s1, s2,s1.length(),s2.length());

	}

	private static void EditDistDP(String s1, String s2, int m, int n) {
		int [][]dp=new int[m+1][n+1];
		if(m==0) {
			dp[m][n]=n;
		}if(n==0) {
			dp[m][n]=m;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else
					dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1])) + 1;
			}
		}
		System.out.println(dp[m][n]);
	}

}
