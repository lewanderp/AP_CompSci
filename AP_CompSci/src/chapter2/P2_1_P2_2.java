package chapter2;

import java.awt.Rectangle;

public class P2_1_P2_2 {
	public static void main (String [] args) {
		Rectangle rect = new Rectangle(5, 10, 20, 15);
		//P2.1
		double area = rect.getHeight()*rect.getWidth();
		System.out.println("rect area: " + area);
		//P2.2
		double perimeter = 2*(rect.getHeight())+2*(rect.getWidth());
		System.out.println("rect perimeter: " + perimeter);
	}
}
