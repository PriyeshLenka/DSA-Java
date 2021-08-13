package String;

public class exb22_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"flower","flow","flight"};
	int n=arr.length;
	 String prefix = arr[0];
	 
     for (int i = 1; i < n; i++) {
         prefix = commonPrefixUtil(prefix, arr[i]);
     }
     if (prefix.length() > 0) {
         System.out.printf("The longest common prefix is - %s",
                 prefix);
     } else {
         System.out.printf("There is no common prefix");
     }
	}

	private static String commonPrefixUtil(String pre, String s) {
		// TODO Auto-generated method stub
		String result="";
		int n=pre.length();
		int m=s.length();
		for(int i=0, j=0;i<n && j<m;i++,j++) {
			if(pre.charAt(i) == s.charAt(j)) {
				result = result + pre.charAt(i);
			}else break;
		}
		
		return result;
	}

}
