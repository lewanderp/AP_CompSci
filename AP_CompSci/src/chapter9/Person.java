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
}
