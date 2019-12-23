package chapter10;

import resources.Triangle1;
import resources.Circle;
import resources.Rectangle1;
import resources.Rhombus;

public class ShapeTester {
	public static void main (String [] args) {
		
		Triangle1 t1 = new Triangle1(1,3,3);
		Triangle1 t2 = new Triangle1(1,7,7);
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(2);
		Rectangle1 re1 = new Rectangle1(2,4);
		Rectangle1 re2 = new Rectangle1(2,3);
		Rhombus rh1 = new Rhombus(3,2);
		Rhombus rh2 = new Rhombus(3,5);
		
		System.out.println("t1:	" + t1);
		System.out.println("t2:	" + t2);
		System.out.println("c1:	" + c1);
		System.out.println("c2:	" + c2);
		System.out.println("re1:	" + re1);
		System.out.println("re2:	" + re2);
		System.out.println("rh1:	" + rh1);
		System.out.println("rh2:	" + rh2);
		
		System.out.println("\n" + "0 == same area; 1 == larger area; -1 == smaller area");
		System.out.println("(Shape1 v. Shape2)");
		System.out.println("triangle comparasin (t1 v. t2): " + t1.compareTo(t2));
		System.out.println("circle comparasin (c1 v. c2): " + c1.compareTo(c2));
		System.out.println("rectangle comparasin (re1 v. re2): " + re1.compareTo(re2));
		System.out.println("rhombus comparasin (rh1 v. rh2): " + rh1.compareTo(rh2));
	}
}
