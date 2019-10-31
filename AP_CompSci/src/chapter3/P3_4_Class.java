package chapter3;

public class P3_4_Class {
	
	private String name;
	private double salary;
	
	public P3_4_Class(String Name, double Salary) {
		name = Name;
		salary = Salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(int percInc) {
		salary = salary+((percInc/10)*salary);
	}
}
