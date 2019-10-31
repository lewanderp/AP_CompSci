package chapter5;

import java.util.Scanner;

public class P5_10_Tester {
	public static void main (String [] args) {
		@SuppressWarnings({ "resource" })
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter month in all lower-case:");
		String month = in.next();
		P5_10_Class m1 = new P5_10_Class(month);
		System.out.println("Days in that month: " + m1.getDays());
	}
}
