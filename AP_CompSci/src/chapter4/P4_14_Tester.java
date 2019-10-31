package chapter4;

import java.util.Scanner;

public class P4_14_Tester {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first time: ");
		int t1 = in.nextInt();
		System.out.println("Enter secoind time: ");
		int t2 = in.nextInt();
		
		P4_14_Class d1 = new P4_14_Class(t1, t2);
		System.out.println("Time difference is: " + d1.getHrDif() + d1.getMinDif());
	
	}
}
