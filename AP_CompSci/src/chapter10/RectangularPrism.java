package chapter10;

public class RectangularPrism extends Prism {
	
	private double area;
	private double surfaceArea;
	
	public RectangularPrism(double x, double y, double z) {
		super(x, y, z);
		this.setArea(this.getxDimension()*this.getyDimension()*this.getzDimension());
		this.setSurfaceArea(2*(this.getxDimension()*this.getyDimension() + this.getzDimension()*this.getyDimension() + this.getzDimension()*this.getxDimension()));
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
	public String toString() {
		return "Area: " + this.getArea() + ", Surface Area: " + this.getSurfaceArea();
	}
}
