package chapter3;

public class P3_9_Tester {
	public static void main (String [] args) {
		P3_9_Class b1 = new P3_9_Class();

		System.out.println(b1.getArray());
		System.out.println(b1.getDirection());
		for (int i=0;i<5;i++) {
			b1.move();
			System.out.println(b1.getArray());
		}
		
		b1.turn();
		System.out.println(b1.getDirection());
		System.out.println(b1.getArray());
		
		for(int i=0;i<10;i++) {
			b1.move();
			System.out.println(b1.getArray());
		}
		b1.turn();
		System.out.println(b1.getArray());
		System.out.println(b1.getDirection());
	}
}

