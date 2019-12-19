package chapter10;

import java.awt.Color;

import resources.Canvas;

public class Car extends Vehicle {
	
	public Car(Canvas C, int xCor, int yCor) {
		super(C, xCor, yCor);
	}

	@Override
	public void DrawVehicle() {
		getCanvas().setInkColor(Color.cyan);
		getCanvas().drawFilledRectangle(getX(), getY(), 50, 10);
		getCanvas().drawFilledRectangle(getX()+15, getY()-10, 25, 10);
		getCanvas().drawFilledOval(getX()+5, getY()+10, 10, 10);
		getCanvas().drawFilledOval(getX()+35, getY()+10, 10, 10);
		getCanvas().setInkColor(Color.black);
		getCanvas().drawString("CAR", getX()+15, getY());
	}
	
}
