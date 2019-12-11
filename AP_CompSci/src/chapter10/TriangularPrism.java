package chapter10;

public class TriangularPrism extends RectangularPrism{
	
	public TriangularPrism(double x, double y, double z) {
		super(x, y, z);
		this.setArea(this.getArea()/2);
		this.setSurfaceArea(2*(this.getxDimension()*this.getyDimension()) + (this.getxDimension()+this.getyDimension())+this.getHypotneuse()*this.getzDimension());
	}	
	public double getHypotneuse() {
		return Math.sqrt(this.getxDimension()*this.getxDimension()+this.getyDimension()*this.getyDimension());
	}
}
