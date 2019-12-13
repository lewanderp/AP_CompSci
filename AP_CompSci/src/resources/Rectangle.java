package resources;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	@Override
	public int compareTo(Object o) {
		double a = ((Rectangle) ((Object)o)).calcArea();
		if (calcArea() > a) {
			return 1;
		} else if ( calcArea() == a ) {
			return 0;
		} else {
			return -1;
		}
	}
	@Override
	public double calcArea() {
		return length*width;
	}
	@Override
	public double calcPerimeter() {
		return 2*length+2*width;
	}
}
