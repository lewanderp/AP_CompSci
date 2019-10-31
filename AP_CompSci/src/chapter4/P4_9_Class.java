package chapter4;

public class P4_9_Class {
	
	private double height;
	private double r;
	
	P4_9_Class(){
		
	}
	P4_9_Class(double Height, int Diameter){
		height = Height;
		r = (Diameter/2.0);
	}
	public double getVolume() {
		double volume = ((3.14*r*r)*height);
		return volume;
	}
	public double getSurfaceArea() {
		double sa = (2.0*(3.14*(r*r))+(2.0*3.14*r));
		return sa;
	}
	
}
