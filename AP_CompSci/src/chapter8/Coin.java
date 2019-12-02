package chapter8;

public class Coin {
	
	private String name;
	private final double VALUE;
	
	public Coin(String nam, double val) {
		name = nam;
		VALUE = val;
	}
	public String getName() {
		return name;
	}
	public double getValue() {
		return VALUE;
	}
}
