package misc_classes;

public class Die_Tester {
	public static void main (String [] args) {
		
		Die d1 = new Die();
		Die d2 = new Die(10);
		Die d3 = new Die(20);
		Die d4 = new Die();
		
		//1
		d1.roll();
		d2.roll();
		System.out.println("d1: " + d1.getValue());
		System.out.println("d2: " + d2.getValue());
		System.out.println("sum = " + d1.add2Die(d2));
		
		//2
		d1.roll();
		d2.roll();
		d3.roll();
		System.out.println("d1: " + d1.getValue());
		System.out.println("d2: " + d2.getValue());
		System.out.println("d3: " + d3.getValue());
		System.out.println("sum = " + d1.add3Die(d2, d3));
		
		//3
		System.out.println("Total num die: " + Die.diceInPlay);
		
		//4
		d1.roll();
		d2.roll();
		d3.roll();
		d4.roll();
		System.out.println("d1: " + d1.getValue());
		System.out.println("d2: " + d2.getValue());
		System.out.println("d3: " + d3.getValue());
		System.out.println("d4: " + d4.getValue());
		System.out.println("sum = " +  (d1.add3Die(d2, d3)+d4.getValue()));
		
	}
}
