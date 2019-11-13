package arrays_and_array_lists;

import java.util.Random;

public class Array2 {
	public static void main (String [] args) {
		
		Random r = new Random();
		
		int x[] = new int [10];
		for (int i = 0; i < 10; i++) {
			x[i] = r.nextInt(40)-20;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(x[i]);
		}
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			sum+=x[i];
		}
		avg = sum;
		avg/=x.length;
		System.out.println("Average: " + avg);
		System.out.println("Numbers less than average: ");
		for (int i = 0; i < 10; i++) {
			if (x[i] < avg) {
				System.out.println(x[i]);
			}
		}
		System.out.println("Numbers less than 0");
		for (int i = 0; i < 10; i++) {
			if (x[i] < 0) {
				System.out.println(x[i]);
			}
		}
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < 10; i++) {
			if (x[i] % 2 != 0) {
				System.out.println(x[i]);
			}
		}	
	}
}
