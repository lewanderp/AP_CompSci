package chapter6;

import java.util.Scanner;

public class P6_5 {
	public static void main (String [] args) {
		@SuppressWarnings({ "resource" })
		Scanner in = new Scanner(System.in);
		double xSum = 0;
		double sumOfSq = 0;
		
		System.out.println("Enter number of values in data set");
		int n = in.nextInt();
		System.out.println("Enter data set");
		for (int j = 0; j < n; j++) {
			double b =in.nextDouble();
			xSum+=b;
			sumOfSq+=(b*b);
		}
		double sqOfSum = xSum*xSum;
		
		double s = Math.sqrt((sumOfSq - (1.0/n)*sqOfSum)/(n-1));
		System.out.println("Standard Deviation is: ");
		System.out.println(s);
	}
}
