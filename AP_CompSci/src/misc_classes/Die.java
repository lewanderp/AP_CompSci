package misc_classes;

import java.util.Random;

public class Die {
	
	public static int diceInPlay = 0;
	
	private int faces;
	private int value;
	private Random r = new Random();
	
	Die(){
		faces = 6;
		roll();
		diceInPlay++;
	}
	Die(int numSides){
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
}
