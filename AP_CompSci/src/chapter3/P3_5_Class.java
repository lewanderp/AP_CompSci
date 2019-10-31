package chapter3;

public class P3_5_Class {
	
	private double mpg;
	private double gas;
	
	P3_5_Class(double MPG){
		mpg = MPG;
		gas = 0.0;
	}
	public void addGas(double gal) {
		gas+=gal;
	}
	public void drive(double mi) {
		gas-= (mi/mpg);
	}
	public double getGas() {
		return gas;
	}
	public double getMpg() {
		return mpg;
	}
	
}
