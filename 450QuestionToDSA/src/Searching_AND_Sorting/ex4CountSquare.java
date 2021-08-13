package Searching_AND_Sorting;

public class ex4CountSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		Double x=Math.sqrt(n);
		int res=0;
		int y= (int) Math.sqrt(n);
		
		if(y<x) 
			res=y;
		
		if(y==x) 
			res=y-1;
		
		System.out.println(res);
	}

}
