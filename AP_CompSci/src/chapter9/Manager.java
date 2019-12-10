package chapter9;

public class Manager extends Employee{
	
	private String department;
	
	public Manager(String name, String Department, double salary) {
		super (salary, name);
		setDepartment(Department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return super.toString() + ", Department: " + this.getDepartment();
	}
}
