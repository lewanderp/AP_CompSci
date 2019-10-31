package chapter2;

import java.util.Scanner;
import java.util.Random;

public class P2_8 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Input your lottery numbers! (6 numbers between 1-49)");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		int num6 = in.nextInt();
		System.out.println("Your number is: ");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " ");
		System.out.println("PLay this number, it will make you rich!");
		int lnum1 = r.nextInt(49)+1;
		int lnum2 = r.nextInt(49)+1;
		int lnum3 = r.nextInt(49)+1;
		int lnum4 = r.nextInt(49)+1;
		int lnum5 = r.nextInt(49)+1;
		int lnum6 = r.nextInt(49)+1;
		System.out.println("The Lottery number is: ");
		System.out.println(lnum1 + " " + lnum2 + " " + lnum3 + " " + lnum4 + " " + lnum5 + " " + lnum6 + " ");
	}
}
