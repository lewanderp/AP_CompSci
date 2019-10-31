package chapter6;

import java.util.Scanner;
import java.util.ArrayList;

public class P6_6 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to be factored");
		int num = in.nextInt();
		System.out.println(getFactors(num));
	}
	public static ArrayList<Integer> getFactors(int num){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for (int i = 1; i <= num; i++) {
			if (isFactor(num, i)) {
				factors.add(i);
			}
		}
		
		return factors;
	}
	public static boolean isFactor(int number, int div) {
        if (number % div == 0) {
            return true;
        }
	    return false;
	}
}
