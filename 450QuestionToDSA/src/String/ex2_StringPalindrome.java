package String;


public class ex2_StringPalindrome {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		String str, rev = "";
	      
	      str = "sssyyy";
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	      
	      long endTime = System.nanoTime();
			 long timeElapsed = endTime - startTime;
			 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
			 
		        System.out.println("Execution time in milliseconds : " +
		                                timeElapsed / 1000000);
		
	}

}
