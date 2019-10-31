package chapter3;

public class P3_4_Tester {
	public static void main(String [] args) {
		P3_4_Class e1 = new P3_4_Class("Barry", 3);
		System.out.println("Employee Name: " + e1.getName());
		System.out.println("Employee Salary: " + e1.getSalary());
		e1.raiseSalary(5000);
		System.out.println("Employee Name: " + e1.getName());
		System.out.println("Employee Salary: " + e1.getSalary());
	}
}
