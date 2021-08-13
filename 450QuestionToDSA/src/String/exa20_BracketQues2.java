package String;

public class exa20_BracketQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="}{{}}{{{";
		
			find(s);
		
			
	}

	private static void find(String s) {
		// TODO Auto-generated method stub
		int n=s.length();
		
		if(s.length()%2!=0) {
			System.out.println("-1");
			return;
		}
		int count=0;
		if(s.charAt(0)!='{') {
			count++;
		}
		for(int i=1;i<n;i++) {
			if(i%2!=0 && s.charAt(i)!='}') {
				count++;
			}
			if(i%2==0 && s.charAt(i)!='{') {
				count++;
			}
		}System.out.println(count);
		
		
	}

}
