package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class exb28_smallDistinctWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "AABBBCBBA";
		 String [] split=str.split("");
		
		 
		 ArrayList<String> s=new ArrayList<String>(Arrays.asList(split));
		 
		 System.out.println(s);
		
	       
	       int t=findSubString(s) ;
	       System.out.println(t);
	}

	private static int findSubString(ArrayList<String> s) {
		// TODO Auto-generated method stub
		int n=s.size();
		HashMap<String,String> table=new HashMap<String,String>();
		
		for(int i=0;i<n;i++) {						
			//System.out.println(j);
			
			table.put(s.get(i), null); 
			
			//System.out.println(j);
		}
		
		return table.size();
			
		
	}


}
