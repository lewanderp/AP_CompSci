package chapter5;

import java.util.Scanner;

public class P5_5_Tester {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter letter grade:");
		String grade = in.next();
		P5_5_Class g1 = new P5_5_Class(grade);
		System.out.println("Numeric Grade: " + g1.getNumGrade());
	
	}
}
