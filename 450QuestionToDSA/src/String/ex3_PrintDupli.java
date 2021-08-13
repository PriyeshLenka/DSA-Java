package String;

import java.util.HashMap;

public class ex3_PrintDupli {
	static final int NO_OF_CHARS = 256;
		
	static void printDups(String str){
				
		int count[] = new int[NO_OF_CHARS];
		       
		
		for (int i = 0; i < str.length(); i++)
		    count[str.charAt(i)]++;
		
		for (int i = 0; i < NO_OF_CHARS; i++)
		    if (count[i] > 1)
		        System.out.println((char)(i) + ", count = " + count[i]);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test string";
        printDups(str);
	}
}
//	static void printDups(String str)
//	 {
//	        HashMap<Character, Integer> count = new HashMap<>();
//	        /*Store duplicates present
//	        in the passed string */
//	        for (int i = 0; i < str.length(); i++) {
//	            if (!count.containsKey(str.charAt(i)))
//	                count.put(str.charAt(i), 1);
//	            else
//	                count.put(str.charAt(i),
//	                          count.get(str.charAt(i)) + 1);
//	        }
//	 
//	        /*Print duplicates in sorted order*/
//	        for (Map.Entry mapElement : count.entrySet()) {
//	            char key = (char)mapElement.getKey();
//	            int value = ((int)mapElement.getValue());
//	 
//	            if (value > 1)
//	                System.out.println(key
//	                                   + ", count = " + value);
//	        }
//	    }
	


