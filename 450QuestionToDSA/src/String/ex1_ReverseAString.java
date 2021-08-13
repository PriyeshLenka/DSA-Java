package String;

import java.util.Scanner;

public class ex1_ReverseAString {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		   String str, rev = "";
		     
		 
		      
		      str = "fofg";
		 
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		
		      System.out.println(rev);
		 long endTime = System.nanoTime();
		 long timeElapsed = endTime - startTime;
		 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		 
	        System.out.println("Execution time in milliseconds : " +
	                                timeElapsed / 1000000);

	}

}
