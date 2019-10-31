package Refreshers;

import java.util.Scanner;

public class loopingReference {
	public static void main (String [] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// while loop
		int x = 0;
		while ( x < 30) {
			if (x%2!=0) {
				System.out.println(x);
			}
			x++;
		}
		// do while loop
		System.out.println("Enter 4 ints");
		int exit = 0;
		int largest = 0;;
		int sum = 0;
		do {
			int strVal = in.nextInt();
			sum+= strVal;
			exit++;
			if (strVal > largest	) {
				largest = strVal;
			}
		}while (exit<4);
		System.out.println("Largest: " + largest);
		System.out.println("Sum: " + sum);
		//for loop
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
