package chapter10;

import resources.Canvas;

import java.awt.Color;
import java.util.Random;

public class VehicleTester {
	public static void main (String [] args) {
		
		Canvas c = new Canvas();
		Random r = new Random();
		
		c.setVisible(true);
		c.setSize(1000, 500);
		c.setInkColor(Color.black);
		c.drawFilledRectangle(0, 0, 1000, 500);
		
		Car car = new Car(c, r.nextInt(1000)+50, r.nextInt(500)+30);
		car.DrawVehicle();
	}
	public static Vehicle randomVehicle(Canvas C) {
		Random r = new Random();
		if (r.nextBoolean() == true) {
			return new Car(C, r.nextInt(1000)+50, r.nextInt(500)+30);
		} else {
			
		}
	}
}
