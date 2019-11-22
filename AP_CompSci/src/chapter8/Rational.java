package chapter8;

public class Rational {
	
	private double numerator;
	private double denominator;
	private static int operationalNumber = 0;
	
	public Rational(double num, double dem) {
		numerator = num;
		denominator = dem;
	}
	public double getDenominator() {
		return denominator;
	}
	public double getNumerator() {
		return numerator;
	}
	public Rational multiply(Rational frac2) {
		double newNum = frac2.getNumerator()*this.getNumerator();
		double newDem = frac2.getDenominator()*this.getDenominator();
		operationalNumber++;
		return new Rational(newNum, newDem);
	}
}
