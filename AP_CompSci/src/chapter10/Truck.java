package chapter10;

import java.awt.Color;

import resources.Canvas;

public class Truck extends Vehicle{

	public Truck(Canvas C, int xCor, int yCor) {
		super(C, xCor, yCor);
	}

	@Override
	public void DrawVehicle() {
		getCanvas().setInkColor(Color.cyan);
		getCanvas().drawFilledRectangle(getX(), getY(), 20, 20);
		getCanvas().drawFilledRectangle(getX()+20, getY()-20, 100, 40);
		getCanvas().drawFilledOval(getX()+5, getY()+20, 10, 10);
		getCanvas().drawFilledOval(getX()+20, getY()+20, 10, 10);
		getCanvas().drawFilledOval(getX()+30, getY()+20, 10, 10);
		getCanvas().drawFilledOval(getX()+100, getY()+20, 10, 10);
		getCanvas().drawFilledOval(getX()+110, getY()+20, 10, 10);
		getCanvas().setInkColor(Color.black);
		getCanvas().drawString("TRUCK", getX()+20, getY());
	}

}
