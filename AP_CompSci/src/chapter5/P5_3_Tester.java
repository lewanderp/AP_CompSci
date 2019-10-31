package chapter5;

import java.util.Scanner;

public class P5_3_Tester {
	public static void main (String [] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		P5_3_Class ar = new P5_3_Class(a,b,c);
		ar.sortNums();
		System.out.println(ar.numsToString());
	}
}
