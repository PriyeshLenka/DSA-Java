package Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Merge{
	 int[][] merge(int[][] intervals) {
		    LinkedList<int[]> merge=new LinkedList<int[]>();
		    if(intervals.length==0 || intervals==null) {
		    	return merge.toArray(new int[0][] );
		    }
		    Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
		    int start=intervals [0][0];
		    int end =intervals [0][1];
		    for(int[] i : intervals) {
		    	if(i[0] <= end) {
		    		end =Math.max(end,i[1]);
		    		
		    	}else {merge.add(new int [] {start,end});
		    	start=i[0];
		    	end=i[1];
		    }
		   } 
		    merge.add(new int[] {start,end});
			return merge.toArray(new int[0][]);
		 }
}

public class exa15_mergeIntervals {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{2,6},{8,10},{15,16}};
		Merge m=new Merge();
		
		m.merge(intervals);
		 for(int i=0;i<=4;i++) {
			 System.out.println(((List<int[]>) m).get(i));
		 }
	}

}
