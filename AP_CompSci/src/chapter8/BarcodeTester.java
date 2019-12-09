package chapter8;

import java.util.Scanner;

public class BarcodeTester {
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] zipcode = new int [5];
		String [] barcode = new String [5];
		Barcode bInt = new Barcode(zipcode);
		Barcode bString = new Barcode(barcode);
		
		System.out.println("Enter barcode");
		String nums = in.next();
		for (int i = 0; i<5; i++) {
			zipcode[i] = nums.charAt(i)-48;
		}
		System.out.println("Barcode:  ");
		System.out.println(bInt.toBar());
		
		System.out.println("Enter barcode to be translated into numbers: ");
		nums = in.next();
		for (int i = 0; i<5; i++) {
			barcode[i] = nums.substring(1+(i*5), 6+(i*5));
		}
		System.out.println(bString.toNum());
		
	}
}
