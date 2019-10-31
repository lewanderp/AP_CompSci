package chapter3;

public class P3_11_Tester {
	public static void main (String [] args) {
		P3_11_Class r1 = new P3_11_Class(10);
		
		System.out.println("Roach Pop: " + r1.getPop());
		for(int i=0;i<3;i++) {
			r1.breed();
			r1.spray();
			System.out.println("Roach Pop: " + r1.getPop());
		}
	}
}
