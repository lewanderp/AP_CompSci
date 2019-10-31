package chapter6;

import java.util.Scanner;

public class P6_1 {
	public static void main (String [] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String flagVal = "";
		do {
			System.out.println("Enter the $ value to be converted " );
			double $val = in.nextDouble();
		double €val = $val*0.91;
		System.out.println("$" + $val + " is €" + €val);
		System.out.println("Enter Q if you wish to exit");
		flagVal = in.next();
		} while (!flagVal.contentEquals("Q"));
	}
}
