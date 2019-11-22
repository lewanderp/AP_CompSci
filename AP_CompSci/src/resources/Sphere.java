package resources;

public class Sphere {
	
	double volume;
	double surfaceArea;
	double r;
	
	public Sphere(double radius){
		r = radius;
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
		volume = (4.0/3.0)*Math.PI*r*r*r;
	}
	private void calcSurfaceArea() {
		surfaceArea =  4*Math.PI*r*r;
	}
}
