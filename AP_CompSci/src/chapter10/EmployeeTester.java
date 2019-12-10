package chapter10;

public class EmployeeTester {
	public static void main (String [] args) {
		
		Excecutive e = new Excecutive("John", "Finance", 600000);
		Manager m = new Manager("Freddy", "Communication", 120000);
		Employee em = new Employee(30000, "Bob");
		
		System.out.println(e.toString());	
		System.out.println(m.toString());
		System.out.println(em.toString());
		
	}
}
