package resources;

public class Rectangle1 extends Shape1 {
	
	private double length;
	private double width;
	
	public Rectangle1(int l, int w, int width2, int height) {
		length = l;
		width = w;
	}
	@Override
	public int compareTo(Object o) {
		double a = ((Rectangle1) ((Object)o)).calcArea();
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
	@Override
	public String toString() {
		return "Length: " + length + ", Width: " + width + ", Area: " + calcArea() + ", Perimeter: " + calcPerimeter();
	}
}
