package resources;

public class Triangle extends Shape {

	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(double b1, double b2, double b3) {
		s1 = b1;
		s2 = b2;
		s3 = b3;
	}
	@Override
	public int compareTo(Object o) {
		double a = ((Triangle) ((Object)o)).calcArea();
		if (calcArea() > a) {
			return 1;
		} else if (calcArea() == a) {
			return 0;
		} else 
			return -1;
	}

	@Override
	public double calcArea() {
		double s = (s1+s2+s3)/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}

	@Override
	public double calcPerimeter() {
		return s1+s2+s3;
	}
	@Override
	public String toString() {
		return "Side1: "+ s1 + ", Side2: "+ s2 + ", Side3: "+ s3 + ", Area: " + calcArea() + ", Perimeter: " + calcPerimeter();
	}

}
