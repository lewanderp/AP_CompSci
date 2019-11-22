package chapter8;

import java.util.Scanner;

public class P8_5 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter r value:");
		int r = in.nextInt();
		System.out.println("Enter h value");
		int h = in.nextInt();
		System.out.println("Sphere Volume: " + sphereVolume(r) + ", Surface area: " + sphereSurface(r));
		System.out.println("Cylinder Volume: " + cylinderVolume(r, h) + ", Surface area: " + cylinderSurface(r, h));
		System.out.println("Cone Volume: " + coneVolume(r, h) + ", Surface area: " + coneSurface(r, h));
		
	}
	public static double sphereVolume(double r) {
		return (4.0/3.0)*Math.PI*r*r*r;
	}
	public static double sphereSurface(double r) {
		return 4*Math.PI*r*r;
	}
	public static double cylinderVolume(double r, double h) {
		return Math.PI*r*r*h;
	}
	public static double cylinderSurface(double r, double h) {
		return 2*Math.PI*r*(h+r);
	}
	public static double coneVolume(double r, double h) {
		return (1.0/3.0)*Math.PI*r*r*h;
	}
	public static double coneSurface(double r, double h) {
		return Math.PI*r*(r+Math.sqrt(r*r+h*h));
	}
}
