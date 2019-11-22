package chapter8;

import resources.Cone;
import resources.Cylinder;
import resources.Sphere;
import java.util.Scanner;

public class P8_6 {
	public static void main (String [] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter h value:");
		double h = in.nextDouble();
		System.out.println("Enter r value");
		double r = in.nextDouble();
		
		Cone co = new Cone(r, h);
		Cylinder cy = new Cylinder(r, h);
		Sphere sp = new Sphere(r);
		
		System.out.println("If Sphere: " + sp.toString());
		System.out.println("If Cone: " + co.toString());
		System.out.println("If Cylinder: " + cy.toString());
	}
	
}
