package String;

public class ex8_LongestRepeatingSubsequence {
	static final int NO_OF_CHARS = 256;
	
	static void printDups(String str){
			int max=0;	
		int count[] = new int[NO_OF_CHARS];
		       
		
		for (int i = 0; i < str.length(); i++)
		    count[str.charAt(i)]++;
		
		for (int i = 0; i < NO_OF_CHARS; i++) 
		    if (count[i] > 1)
		      max=Math.max(max, count[i]);  
		System.out.println(max-1);
		}
	public static void main(String[] args) {
		String str = "aab";
        printDups(str);
	}

}
