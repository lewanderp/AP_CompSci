package chapter8;

public class Coin_Purse_tester {
	public static void main (String [] args) {
		Purse myPurse = new Purse();
		Coin quarter = new Coin("Quarter", .25);
		Coin dime = new Coin("Dime", .10);
		for(int i = 0; i <3; i++) {
			myPurse.addCoin(quarter);
		}
		myPurse.addCoin(dime);
		System.out.println("Total value: $" + myPurse.getValue());
		System.out.println("Average coin value: $" + myPurse.getAvrg() );
	}
}
