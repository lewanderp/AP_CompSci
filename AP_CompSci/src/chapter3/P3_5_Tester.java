package chapter3;

public class P3_5_Tester {
	public static void main (String [] args) {
		P3_5_Class myHybrid = new P3_5_Class(50.0);
		
		myHybrid.addGas(20.0);
		double gasLeft = myHybrid.getGas();
		System.out.println("Starting gas: " + gasLeft);
		for (int i=0;i<10;i++) {
			myHybrid.drive(10.0);
			System.out.println("Gas After 10mi: " + gasLeft);
		}
		System.out.println("End Gas: " + gasLeft);
	}
}
