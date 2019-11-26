package chapter8;

import java.util.Random;

public class RationalTester {
	public static void main (String [] args) {
		Random r = new Random();
		Rational f1 = new Rational(3,4);
		Rational f2 = new Rational(1,3);
		System.out.println("f1: " + f1.toString());
		System.out.println("f2: " + f2.toString());
		System.out.println("f1 + f2" + f1.add(f2).toString());
		System.out.println("f1 - f2" + f1.subtract(f2).toString());
		System.out.println("f1 * f2" + f1.multiply(f2).toString());
		System.out.println("f1 / f2" + f1.divide(f2).toString());
	}
}	