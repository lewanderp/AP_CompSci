package resources;

public class Cylinder {
	
	private double r;
	private double h;
	private double volume;
	private double surfaceArea;
	
	
	public Cylinder(double radius, double height){
		r = radius;
		h = height;
	}
	public String toString() {
		return "[Volume: "+getVolume()+"], [Surface Area: " + getSurfaceArea() +"]";
	}
	public double getVolume() {
		calcVolume();
		return volume;
	}
	public double getSurfaceArea() {
		calcSurfaceArea();
		return surfaceArea;
	}
	private void calcVolume() {
		volume = Math.PI*r*r*h;
	}
	private void calcSurfaceArea() {
		surfaceArea = 2*Math.PI*r*(h+r);
	}
}
