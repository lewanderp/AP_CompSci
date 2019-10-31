package chapter4;

public class Project4_1_Tester {
	public static void main (String [] args) {
		Project4_1_Class t1 = new Project4_1_Class(0,0,6,0,3,(3*Math.sqrt(3)));
		System.out.println("Side 1: " + t1.getS1());
		System.out.println("Side 2: " + t1.getS2());
		System.out.println("Side 3: " + t1.getS3());
		System.out.println();
		System.out.println("Angle 1: " + t1.getA1());
		System.out.println("Angle 2: " + t1.getA2());
		System.out.println("Angle 3: " + t1.getA3());
	}
}
