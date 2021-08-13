package String;

import java.util.HashSet;

public class exa16_WordBreak {
	
	private static HashSet<String> dictionary = new HashSet<>();
	    public static void main(String []args)
	    {
	              
	    	String temp_dictionary[] = {"lrbbmqb", "cd", "r", "owkk"};
	                             
	        for (String i : temp_dictionary )
	        {
	            dictionary.add(i);
	        }
	        System.out.println(wordBreak("lrbbmqbabowkkab"));	         
	    }

	    public static int wordBreak(String string)
	    {int []dp=new int[string.length()];
				
				for(int i=0;i<dp.length;i++) {
					for(int j=0;j<=i;j++) {
						String w2c=string.substring(j,i+1);
						if(dictionary.contains(w2c)) {
							if(j>0) {
							dp[i] += dp[j-1];
							}
							else {
								dp[i] += 1;
							}
						}				 
					}
				}int x=0;
				if(dp[string.length()-1] > 0)
					x=dp[string.length()-1];
				
				
				return x;
			
	        //code here
	    }
}
