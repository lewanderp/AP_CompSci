package chapter4;

import java.util.Scanner;

public class R4_12 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String toCut = in.next();
		System.out.println(toCut.charAt(0));
		System.out.println(toCut.charAt(toCut.length()-1));
		toCut = toCut.substring(1, toCut.length()-1);
		System.out.println(toCut);
	}
}
