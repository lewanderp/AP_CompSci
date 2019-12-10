package chapter9;

public class Employee {
	
	private double salary;
	private String name;
	
	public Employee(double Salary, String Name) {
		setName(Name);
		setSalary(Salary);
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Employee Name: " + this.getName() + ", Salary: " + this.getSalary();
	}
}
