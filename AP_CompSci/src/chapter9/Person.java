package chapter9;

public class Person implements Measurable{
	
	private String name;
	private int height;
	
	public Person(String Name, int Height) {
		name = Name;
		height = Height;
	}
	public double getMeasure() {
		return height;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " is " + height + "''  tall"; 
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
