package chapter7;

import java.util.Random;

public class Array3 {
	public static void main (String [] args) {
		
		Random r = new Random();
		
		int x [] = new int [25];
		
		for (int i = 0; i < 25; i++) {
			x[i] = r.nextInt(50)+1;
		}
	}
}
