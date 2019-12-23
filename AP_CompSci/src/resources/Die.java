package resources;

import java.util.Random;

import chapter9.Measurable;

public class Die implements Measurable{
	
	public static int diceInPlay = 0;
	
	private int faces;
	private int value;
	private Random r = new Random();
	
	public Die(){
		faces = 6;
		roll();
		diceInPlay++;
	}
	public Die(int numSides){
		faces = numSides;
		roll();
		diceInPlay++;
	}
	public void roll() {
		value = r.nextInt(faces)+1;
	}
	public int getValue() {
		return value;
	}
	public int getNumFaces() {
		return faces;
	}
	
	public int add2Die(Die d) {
		int sum = d.getValue()+this.getValue();
		return sum;
	}
	public int add3Die(Die d1, Die d2) {
		int sum = add2Die(d1);
		sum += d2.getValue();
		return sum;
	}
	public double getMeasure() {
		return value;
	}
	public String toString() {
		return ""+value+"";
	}

	@Override
	public double getMaximum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMinimum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
