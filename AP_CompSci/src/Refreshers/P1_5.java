package Refreshers;

public class P1_5 {
	public static void main (String [] args) {
		// no loops
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		// loops
		int sum=0;
		for (int x = 0; x < 10; x++) {
			sum+=x+1;
		}
		System.out.print(sum);
	}
}
