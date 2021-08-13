package String;

public class ex4_CheckSubstringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		String str1 = "AACD"; 
        String str2 = "ACDA"; 
        String temp=str1+str1;
        System.out.println(temp);
		
        if (temp.contains(str2)) 
            System.out.println("Strings are rotations of each other"); 
        else
            System.out.printf("Strings are not rotations of each other"); 
		
		 long endTime = System.nanoTime();
		 long timeElapsed = endTime - startTime;
		 System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		 
	        System.out.println("Execution time in milliseconds : " +
	                                timeElapsed / 1000000);
	}

}
