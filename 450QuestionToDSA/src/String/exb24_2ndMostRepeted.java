package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exb24_2ndMostRepeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"ghi", "ghi", "aaa", "ghi", "ghi", "ghi" , "ghi"};
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		String s="";
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=arr[i+1]) {
//				 s=arr[i+1];					
//				break;
//			}
//		}
//		System.out.println(s);
		System.out.println(stringWithSecondHighestFrequency(arr));
	//	System.out.println(secFrequent(arr));
	}
	public static String stringWithSecondHighestFrequency(String[] a)
    {
		int n=a.length;
		HashMap<String,Integer> table=new HashMap<String,Integer>();
		
		for(int i=0;i<n;i++) {
			Integer j=table.get(a[i]);
			
			//System.out.println(j);
			
			table.put(a[i], (j == null) ? 1 : j + 1); 
			
			//System.out.println(j);
		}
		System.out.println(table);
			
         
		int maxCount=0;         
		int secMax=0;
        String s="";
        for(Map.Entry<String, Integer> m : table.entrySet()) 
        {
        	 maxCount=Math.max(maxCount, m.getValue());
        	if(secMax < m.getValue() && m.getValue() < maxCount ) 
        	{
        		secMax=m.getValue();
        	}
        	
         }
        
         for (Map.Entry<String,Integer> m : table.entrySet())  
         {
             if (m.getValue() == secMax)
             {
                 return m.getKey();
             }
         }
         return ""; 
    }
	
//	 static String secFrequent( String arr[] )
//	    {
//	        Arrays.sort(arr);
//	    
//	    String s="";
//			for(int i=0;i<arr.length-1;i++) {
//				if(arr[i]==arr[i+1]) {
//					 s=arr[i];						
//					System.out.println(s);
//				}
//			}
//			return s;
//	    }

}
