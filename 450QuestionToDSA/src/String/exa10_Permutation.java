package String;

public class exa10_Permutation {public static int flag=1;
	private static void permute(String s,String ans) {
		
		if(s.length()==0) {
			System.out.println(ans+" "+flag);
			flag++;
			return;
		}
		for(int i=0;i<s.length();i++) {
			char   c=s.charAt(i);
			String sLeft=s.substring(0,i);
			String sRight=s.substring(i+1);
			String asf=sLeft+sRight;
			permute(asf,ans+c);
		}
			
	}
   
	public static void main(String[] args) {
		 String str = "ABCD";
		 String ans="";
	        
	        permute(str, ans); 
	}

}
