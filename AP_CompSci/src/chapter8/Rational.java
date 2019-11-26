package chapter8;

public class Rational {
	
	private double numerator;
	private double denominator;
	private static int operationalNumber = 0;
	
	public Rational(double num, double den) {
		numerator = num;
		denominator = den;
		if (denominator > numerator) {
			if (((denominator / numerator) - ((int) (denominator / numerator))) == 0) {
				numerator = num/num;
				denominator = den/num;
			}
		}
	}
	public double getDenominator() {
		return denominator;
	}
	public double getNumerator() {
		return numerator;
	}
	public Rational multiply(Rational frac2) {
		double newNum = frac2.getNumerator()*this.getNumerator();
		double newDen = frac2.getDenominator()*this.getDenominator();
		operationalNumber++;
		return new Rational(newNum, newDen);
	}
	public Rational divide(Rational frac2) {
		return this.multiply(frac2.reciprocal());
	}
	public Rational add(Rational frac2) {
		double newNum = (frac2.getNumerator()*this.getDenominator()) + (this.getNumerator()*frac2.getDenominator());
		double newDen = this.gcd(frac2);
		operationalNumber++;
		return new Rational(newNum, newDen);
	}
	public Rational subtract(Rational frac2) {
		double newNum = (this.getNumerator()*frac2.getDenominator()) - (frac2.getNumerator()*this.getDenominator());
		double newDen = this.gcd(frac2);
		operationalNumber++;
		return new Rational(newNum, newDen);
	}
	public boolean equals(Rational frac) {
		if (this.getNumerator() == frac.getNumerator() && this.getDenominator() == frac.getDenominator()) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "[ " + this.getNumerator() +"/"+this.getDenominator()+" ]";
	}
	public Rational reciprocal() {
		return new Rational(this.getDenominator(), this.getNumerator());
	}
	private double gcd(Rational frac2) {
		return this.getDenominator()*frac2.getDenominator();
	}
	public static int getOperationalNumber() {
		return operationalNumber;
	}
}

