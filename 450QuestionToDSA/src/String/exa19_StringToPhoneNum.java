package String;

import java.util.Scanner;

public class exa19_StringToPhoneNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str[] = {"2","22","222",
                 "3","33","333",
                 "4","44","444",
                 "5","55","555",
                 "6","66","666",
                 "7","77","777","7777",
                 "8","88","888",
                 "9","99","999","9999"
             };

		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++) {
			  String input = sc.next();
			  System.out.print("");
 System.out.println(printSequence(str, input));
		 }
		
	}

	private static String printSequence(String arr[],String input) {
		// TODO Auto-generated method stub
		String output="";
		
		for(int i=0;i<input.length();++i) {
			
			if (input.charAt(i) == ' ')
                output = output + "0";
				
			else {
				int pos=input.charAt(i)-'A';
				output=output+arr[pos];
			}
		}
		
		return output;
	}

}
