package chapter7;

public class Array1 {
	public static void main (String [] args) {
		int [] x = new int [6];
		for (int i = 0; i < 6; i++) {
			x[i]= i+1;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(x[i]);
		}
		System.out.println();
		for (int i = 5; i > -1; i--) {
			System.out.println(x[i]);
		}
		int sum = 0;
		double avg = 0;
		int max = -1;
		for (int i = 0; i < 6; i++) {
			sum+=x[i];
			if (x[i]>max) {
				max = x[i];
			}
		}
		avg = sum;
		avg/=x.length;
		System.out.println("Sum:" + sum);
		System.out.println("Average: " + avg);
		System.out.println("Largest Value: " + max);
	}
}
