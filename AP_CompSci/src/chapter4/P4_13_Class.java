package chapter4;

public class P4_13_Class {
	
	private double a;
	private double b;
	private double c;
	private double descrim;
	
	P4_13_Class(double aVal, double bVal, double cVal){
		a = aVal;
		b = bVal;
		c = cVal;
		getDescrim();
	}
	private double getSol1() {
		double x1 = ((-1*b)+(Math.sqrt(descrim)))/(2*a);
		return x1;
	}
	private double getSol2() {
		double x2 = ((-1*b)-(Math.sqrt(descrim)))/(2*a);
		return x2;
	}
	private void getDescrim() {
		descrim = (b*b)-(4*a*c);
	}
	private boolean areSolutions() {
		if (descrim > 0 || descrim == 0) {
			return true;
		} else {
			return false;
		}
	}
	public String solToString() {
		if (areSolutions() == true) {
			return "x1="+getSol1()+", x2="+getSol2();
		} else {
			return "NO REAL SOLUTIONS";
		}
	}
}
