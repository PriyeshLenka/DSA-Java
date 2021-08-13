package Searching_AND_Sorting;

import java.util.Scanner;

public class ex5Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b && a<c) || (a>c && a<b)) 
				System.out.println(a);
		else if((b>a && b<c) || (b>c && b<a))
				System.out.println(b);
		else System.out.println(c);
	}

}
