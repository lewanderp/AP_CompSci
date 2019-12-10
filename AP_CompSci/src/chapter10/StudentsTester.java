package chapter10;

public class StudentsTester {
	public static void main (String [] args) {
		Student s1 = new Student("John", 6);
		StudentFEAR s2 = new StudentFEAR ("Phil", 7, "Programming");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
