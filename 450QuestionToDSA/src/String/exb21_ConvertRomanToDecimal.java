package String;
import java.util.*;
public class exb21_ConvertRomanToDecimal {
	
	public static void main(String[] args) {
		String s = "VX";
	     
	    System.out.print("Integer form of Roman Numeral is " +
	                     romanToInt(s));
	}

	private static int romanToInt(String s) {
		// TODO Auto-generated method stub
		Map<Character , Integer> roman= new HashMap<Character , Integer>();
		roman.put('I', 1);
	    roman.put('V', 5);
	    roman.put('X', 10);
	    roman.put('L', 50);
	    roman.put('C', 100);
	    roman.put('D', 500);
	    roman.put('M', 1000);
		
	    int sum = 0;
	    int n = s.length();
	    int count=0;
	    System.out.println(roman.get(s.charAt(0)));
	    for(int i=0;i<n;i++) {
	    	if( i!=n-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
	    		count++;
	    	}
	    	if( i!=n-1 && roman.get(s.charAt(i)) > roman.get(s.charAt(i + 1)))count=0;
	    }
	    System.out.println(count);
	    if(count==0) {
	    	for(int i = 0; i < n; i++)
		    {
		    
		        if ( i!=n-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)))
		        {
		            sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
		            i++;
		        
		        }
		        else
		        {
		            sum += roman.get(s.charAt(i));	          
		        }
		    }
	    }
	    else System.out.println("N.A");
	    System.out.println(sum);
	    return sum;
	}
}
