package chapter8;

public class RationalTester {
	public static void main (String [] args) {
		Rational f1 = new Rational(3,4);
		Rational f2 = new Rational(1,3);
		System.out.println("f1: " + f1.toString());
		System.out.println("f2: " + f2.toString());
		System.out.println("f1 + f2" + f1.add(f2).toString());
		System.out.println("f1 - f2" + f1.subtract(f2).toString());
		System.out.println("f1 * f2" + f1.multiply(f2).toString());
		System.out.println("f1 / f2" + f1.divide(f2).toString());
		System.out.println("Which has higher value: ");
		if (f1.compareTo(f2) == 1) {
			System.out.println("f1");
		} else if (f1.compareTo(f2) == -1) {
			System.out.println("f1");
		} else {
			System.out.println("Equal value");
		}
	}
}	