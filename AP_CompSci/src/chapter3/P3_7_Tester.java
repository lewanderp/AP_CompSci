package chapter3;

public class P3_7_Tester {
	public static void main (String [] args) {
		P3_7_Class p1 = new P3_7_Class(15.99, "Toaster");
		
		System.out.println("Product Name:" + p1.getName() + " Product Cost: " + p1.getCost());
		p1.reduceCost(5);
		System.out.println("Product Name:" + p1.getName() + " Product Cost: " + p1.getCost());
	}
}
