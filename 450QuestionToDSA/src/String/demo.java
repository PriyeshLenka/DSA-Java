package String;

public class demo {
	
    public static void main (String[] args) 
    { 
    	long startTime = System.nanoTime();
        System.out.println("hello");
        
        long endTime = System.nanoTime();
		 long timeElapsed = endTime - startTime;
		 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		 
	        System.out.println("Execution time in milliseconds : " +
	                                timeElapsed / 1000000);
    } 
} 