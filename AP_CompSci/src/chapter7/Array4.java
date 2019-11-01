package chapter7;

import java.util.Scanner;
import resources.StringStuff;

public class Array4 {
	public static void main (String [] args) {
		
		String strings[] = new String [8];
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		StringStuff v = new StringStuff();
		
		System.out.println("Original String");
		for (int i = 0; i < 8; i++) {
			strings[i] = in.next();
		}
		System.out.println("Over 4 charecters");
		for (int i = 0; i < 8; i++) {
			if (strings[i].length() > 4) {
				System.out.println(strings[i]);
			}
		}
		System.out.println("Starts with Vowel");
		for (int i = 0; i < 8; i++) {
			if (v.isVowel(0, strings[i])) {
				System.out.println(strings[i]);
			}
		}
		System.out.println("Starts with upper case");
		for (int i = 0; i < 8; i++) {
			if (v.isUpperCase(0, strings[i])) {
				System.out.println(strings[i]);
			}
		}
		while (true) {
			System.out.println("Would you like to search for a word? (y/n)");
			if (in.next().equals("n")) {
				break;
			}
			System.out.println("Enter term to search");
			String word = in.next();
			boolean isFound = false;
			int loc = -1;
			for (int i = 0; i < 8; i++) {
				if (strings[i].equals(word)) {
					isFound = true;
					loc = i;
				}
			}
			if (isFound == true) {
				System.out.println("Word found @: " + loc);
			} else {
				System.out.println("Word not found");
			}
		}
	}
}