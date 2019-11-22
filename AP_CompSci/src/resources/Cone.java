package resources;

public class Cone {
	
	private double r;
	private double h;
	private double volume;
	private double surfaceArea;
	
	public Cone(double radius, double height){
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
		volume = (1.0/3.0)*Math.PI*r*r*h;
	}
	private void calcSurfaceArea() {
		surfaceArea = Math.PI*r*(r+Math.sqrt(r*r+h*h));
	}
}
