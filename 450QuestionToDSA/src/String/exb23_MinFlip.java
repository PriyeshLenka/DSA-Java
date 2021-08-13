package String;

public class exb23_MinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0001010111";
		int res=Math.min(getFlip(s,'1'), getFlip(s,'0'));
		System.out.println(res);
	}

	private static int getFlip(String s, char exp) {
		// TODO Auto-generated method stub
		int flip=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) !=  exp)
				flip++;
			
			exp=change(exp);
		}
		return flip;
	}

	private static char change(char exp) {
		// TODO Auto-generated method stub
//		if(exp=='0')exp='1';
//		else exp='0';
//		return exp;
		return (exp=='0')?'1':'0';
	}
	

}
