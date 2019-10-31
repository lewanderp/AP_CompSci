package intro_to_classes;

import java.util.Random;


public class ChairClass {
	private Random r = new Random();
	private double height;
	private int numberRips;
	private String name;
	
	public ChairClass() {
		height = 14;
		name = "oak";
	}
	public ChairClass (double h) {
		height = h;
	}
	public ChairClass (double h, String Name) {
		height = h;
		name = Name;
	}
	public void sawLegs() {
		height-=1.1;
	}
	public double getHeight() {
		return height;
	}
	public void mutator() {
		height+=2.2;
		setRips(r.nextInt(5)+1);
	}
	private void setRips(int rips) {
		numberRips+=rips;
	}
	public int getRips() {
		return numberRips;
	}
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
}
