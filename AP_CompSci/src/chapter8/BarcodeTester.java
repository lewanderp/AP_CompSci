package chapter8;

import java.util.Scanner;

public class BarcodeTester {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		int [] zipcode = new int [5];
		String [] 
		
		System.out.println("Enter barcode");
		String nums = in.next();
		for (int i = 0; i<5; i++) {
			zipcode[i] = nums.charAt(i)-48;
		}
		Barcode b = new Barcode(zipcode);
		System.out.println("Barcode:  ");
		System.out.println(b.toString());
		
		System.out.println("Enter barcode to be translated into numbers: ");
		nums = in.next();
		for (int i = 0; i<5; i++) {
			barcode[i] = nums.charAt(i)-48;
		}
		
	}
}
