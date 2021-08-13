package String;

public class ex6_CountandSay {
	static final int NO_OF_CHARS = 256;
	
	static void countSay(String str){
				
		int count[] = new int[NO_OF_CHARS];
		       
		
		for (int i = 0; i < str.length(); i++)
		    count[str.charAt(i)]++;
		
		for (int i = 0; i < NO_OF_CHARS; i++)
		    if (count[i] > 0)
		        System.out.print(count[i]+""+(char)(i)+" ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3322251";
        countSay(str);
	}
}
