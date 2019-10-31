package chapter3;

import java.util.Scanner;

public class P3_6_Tester {
	public static void main (String [] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		P3_6_Class s1 = new P3_6_Class("Stevenson");
		
		System.out.println("Enter quiz scores");
		while(true) {
			System.out.println("Quiz Score: ");
			double scr = in.nextDouble();
			s1.addQuizScore(scr);
			System.out.println("Any more (y/n)?");
			String mre = in.next();
			if (mre.contentEquals("n")) {
				break;
			}
		}
		System.out.println(s1.getName() + "'s Average is: ");
		System.out.println(s1.getAverageScore());
		System.out.println(s1.getName() + "'s Total Score is: ");
		System.out.println(s1.getTotal());
	}
}	
