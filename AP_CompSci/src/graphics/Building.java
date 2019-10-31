package graphics;

import java.awt.Color;
import java.util.Random;

public class Building {
	
	@SuppressWarnings("unused")
	private boolean windows;
	private int maxX;
	private int maxY;
	private int X;
	private int Y;
	
	public Building(boolean areWindows, int Xmax, int Ymax) {
		windows = areWindows;
		maxX = Xmax;
		maxY = Ymax;
		X = genDem(maxX);
		Y = genDem(maxY);
	}
	public void changeColor(Canvas c) {
		c.setInkColor(genColor());
	}
	public void drawBuilding(Canvas c) {
		int width = genDem(100)+20;
		int height = maxY-Y;
		c.setInkColor(genColor());
		c.drawFilledRectangle(X, Y, width, height );
		c.drawRectangle(X+1, Y+1, width+2, height+2);
		c.setInkColor(Color.black);
		c.drawRectangle(X-1, Y-1, width+2, height+2);
		if (windows == true) {
			drawWindows(width, height, c);
		}
	}
	private void drawWindows(int width, int height, Canvas c) {
		c.setInkColor(Color.white);
		for (int i = 0; i < (width/10); i++) {
			for (int j = 0; j < (height / 10); j++) {
				
			}
		}
		c.drawFilledRectangle(X, Y, width, height);
	}
	private int genDem(int max) {
		Random r = new Random();
		return r.nextInt(max);
	}
	private Color genColor() {
		System.out.println("howdy3");
		Random r = new Random();
		int ran = r.nextInt(4)+1;
		
		if (ran == 1) {
			return Color.cyan;
		}else if (ran == 2) {
			return Color.green;
		}else if (ran == 3) {
			return Color.yellow;
		} else {
			return Color.magenta;
		}

	}
	
}
