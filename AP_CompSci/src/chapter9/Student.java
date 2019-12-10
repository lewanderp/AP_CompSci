package chapter9;

public class Student {
	
	private String name;
	private int numCourses;
	
	public Student (String studentName, int courses) {
		name = studentName;
		numCourses = courses;
	}
	public void setName(String n) {
		name = n;
	}
	public void addCourse(int c) {
		numCourses += c;
	}
	public String toString() {
		return "Student Name: " + name + "\n" + "Number of courses: " + numCourses;
	}
	
}
