package chapter6;

import java.awt.Point;
import java.util.Random;

public class P6_12 {
	
	public static int X = (int) (100*(1-(0.25*Math.PI)));
	public static double HIT = 0;
	public static double ATTEMPTS = 0;
	
	@SuppressWarnings("unused")
	public static void main (String [] args) {
		
		for (int i = 0; i < 10; i++){
			System.out.println(isHit());
			System.out.println(genPI());
			System.out.println(HIT);
		}
		System.out.println();
		
	}
	
	public static double calcDist(Point p) {
		double dist = Math.sqrt(Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2));
		return dist;
	}
	public static Point genPoint() {
		Random r = new Random();
		Point p = new Point();
		p.setLocation(r.nextDouble(), r.nextDouble());
		return p;
	}
	public static boolean isHit() {
		ATTEMPTS+=1.0;
		if (calcDist(genPoint()) <= 1) {
			HIT+=1.0;
			return true;
			
		}
		return false;
	}
	public static double genPI() {
		double PI = 4*( HIT/ATTEMPTS);
		return PI;
	}
	
}
