package chapter10;

public class Prism {
	
	private double xDimension;
	private double yDimension;
	private double zDimension;
	
	Prism(double x, double y, double z) {
		this.setxDimension(x);
		this.setyDimension(y);
		this.setzDimension(z);
	}

	public double getxDimension() {
		return xDimension;
	}

	public void setxDimension(double xDimension) {
		this.xDimension = xDimension;
	}

	public double getyDimension() {
		return yDimension;
	}

	public void setyDimension(double yDimension) {
		this.yDimension = yDimension;
	}

	public double getzDimension() {
		return zDimension;
	}

	public void setzDimension(double zDimension) {
		this.zDimension = zDimension;
	}
}
