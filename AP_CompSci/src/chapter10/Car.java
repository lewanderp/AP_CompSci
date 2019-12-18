package chapter10;

import java.awt.Color;

import resources.Canvas;

public class Car extends Vehicle {
	
	public Car(Canvas C, int xCor, int yCor) {
		super(C, xCor, yCor);
	}

	@Override
	public void DrawVehicle() {
		this.getCanvas().setInkColor(Color.cyan);
		this.getCanvas().drawFilledRectangle(this.getX(), this.getY(), 50, 10);
		this.getCanvas().drawFilledRectangle(this.getX()+10, this.getY()-10, 40, 10);
		this.getCanvas().drawFilledOval(this.getX(), this.getY()+10, 10, 10);
		this.getCanvas().drawFilledOval(this.getX(), this.getY()+10, 10, 10);
	}
	
}
