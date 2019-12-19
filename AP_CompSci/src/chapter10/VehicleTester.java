package chapter10;

import resources.Canvas;

import java.awt.Color;
import java.util.Random;

public class VehicleTester {
	public static void main (String [] args) {
		
		Canvas c = new Canvas();
		
		c.setVisible(true);
		c.setSize(1000, 500);
		c.setInkColor(Color.black);
		c.drawFilledRectangle(0, 0, 1000, 500);
		
		for (int i = 0; i < 10; i++) {
			randomVehicle(c).DrawVehicle();
		}
	}
	public static Vehicle randomVehicle(Canvas C) {
		Random r = new Random();
		if (r.nextBoolean() == true) {
			return new Car(C, r.nextInt(800)+50, r.nextInt(400)+50);
		} else {
			return new Truck(C,r.nextInt(800)+50, r.nextInt(400)+50);
		}
	}
}
