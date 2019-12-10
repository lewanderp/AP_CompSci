package chapter9;

public class StudentFEAR extends Student {
	
	private String department;
	
	public StudentFEAR(String studentName, int numCourses, String departmentName) {
		super (studentName, numCourses);
		department = departmentName;
	}
	public void changeDepartment(String newDepartment) {
		department = newDepartment;
	}
	public String toString() {
		return super.toString() + ", Department: " + department;
	}
}
