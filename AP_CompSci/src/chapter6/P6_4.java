package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_4 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> fibSeq = new ArrayList<Integer>();
		fibSeq.add(1);
		fibSeq.add(1);
		
		System.out.println("Enter how many numbers from the fibonacci sequence you want");
		int many = in.nextInt();
		for (int i = 2; i <(many+2); i++) {
			fibSeq.add(fibGen(fibSeq.get(i-2), fibSeq.get(i-1)));
		}
		System.out.println(fibSeq);
	}
	public static int fibGen(int n0, int n1) {
		return n0+n1;
	}
}
