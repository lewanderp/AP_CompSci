package chapter5;

import java.util.Scanner;

public class P5_7_Tester {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 3 words");
		String a = in.next();
		String b = in.next();
		String c = in.next();
		P5_7_Class w1 = new P5_7_Class(a,b,c);
		w1.sortWords();
		System.out.println(w1.wordsToString());
	}
}
