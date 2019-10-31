package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_7 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number to gen primes to");
		int to = in.nextInt();
		System.out.println(genPrime(to));
	}
	public static ArrayList<Integer> genPrime(int n) {
	    ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	    for (int i = 2; i <= n; i++) {
	        if (isPrime(i)) {
	            primeNumbers.add(i);
	        }
	    }
	    return primeNumbers;
	}
	public static boolean isPrime(int number) {
	    for (int i = 2; i < number; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
