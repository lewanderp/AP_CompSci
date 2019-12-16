package resources;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	@Override
	public int compareTo(Object o) {
		double r = ((Circle) ((Object)o)).getRadius();
		if (radius > r) {
			return 1;
		} else if (radius == r) {
			return 0;
		} else {
			return -1;
		}
	}
	@Override
	public double calcArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public double calcPerimeter() {
		return 2*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public String toString() {
		return "Radius: " +getRadius()+ "Area: " + calcArea() + ", Perimeter: " + calcPerimeter();
	}
	
}
