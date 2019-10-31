package chapter5;

import java.util.Scanner;

public class P5_2_Tester {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a card in the proper notaion");
		String card = in.next();
		P5_2_Class c1 = new P5_2_Class(card);
		System.out.println(c1.cardToString());
	}
}
