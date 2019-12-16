package resources;

public class Rhombus extends Shape {
	
	private double d1;
	private double d2;
	
	public Rhombus(double D1, double D2) {
		d1 = D1;
		d2 = D2;
	}
	
	@Override
	public int compareTo(Object o) {
		double a = ((Rhombus)((Object)o)).calcArea();
		if (calcArea() > a) {
			return 1;  
		} else if (calcArea() > a) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public double calcArea() {
		return (d1*d2)/2;
	}

	@Override
	public double calcPerimeter() {
		return 2*Math.sqrt(d1*d1+d2*d2);
	}

	@Override
	public String toString() {
		return "Diagonal1:" + d1 + ", Diagonal2: " + d2 + ", Area: " + calcArea() + ", Perimeter: " + calcPerimeter();
	}

}
