package chapter10;

public class Sphere extends Prism{

	private double area;
	private double surfaceArea;
	
	Sphere(double x, double y, double z) {
		super(x, y, z);
		setArea(4/3*Math.PI*Math.pow(this.getxDimension()/2, 3.0));
		setSurfaceArea(4*Math.PI*(this.getxDimension()/2)*this.getxDimension()/2);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
	
}
