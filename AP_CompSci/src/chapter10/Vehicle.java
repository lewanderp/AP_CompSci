package chapter10;

import resources.Canvas;

public abstract class Vehicle {
	
	private Canvas c;
	private int x;
	private int y;
	
	public Vehicle(Canvas C, int xCor, int yCor) {
		c = C;
		x = xCor;
		y = yCor;
	}
	public Canvas getCanvas() {
		return c;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public abstract void DrawVehicle();
}
