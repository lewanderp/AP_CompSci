package graphics;

import java.awt.Color;

public class SmileAndWink {
	public static void main (String [] args) {
		Canvas c = new Canvas();

		// page setup
		drawCanvas(c);
		drawBackground(c);
		drawFaceStart(c);
		
		//animation
		moveIris(c);
		smile(c);
		//speak(c);
		typeString(c, "HELLO WORLD", 375, 400, 30);
	}
	
	public static void drawCanvas(Canvas c) {
		c.setSize(1000, 500);
		c.setVisible(true);
	}
	public static void drawBackground(Canvas c) {
		c.setInkColor(Color.gray);
		c.drawFilledRectangle(0, 0, 1000, 500);
	}
	public static void drawFaceStart(Canvas c) {

		c.setInkColor(Color.yellow);
		c.drawFilledOval(400, 150, 200, 200);
		c.setInkColor(Color.black);
		c.drawFilledOval(425, 215, 60, 60);
		c.drawFilledOval(515, 215, 60, 60);
		for (int i = 0; i < 5; i++) {
			c.drawLine(455, 315-i, 545, 315-i);
		}
		c.setInkColor(Color.gray);
		c.drawFilledOval(440, 230, 10, 10);
		c.drawFilledOval(530, 230, 10, 10);
	}
	public static void moveIris(Canvas c) {
		for (int i = 0; i < 5; i++) {
			c.setInkColor(Color.black);
			c.drawFilledOval(425, 215, 60, 60);
			c.drawFilledOval(515, 215, 60, 60);
			c.setInkColor(Color.gray);
			c.drawFilledOval(440+i, 230+i, 20, 20);
			c.drawFilledOval(530+i, 230+i, 20, 20);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void smile(Canvas c) {
		for(int i = 0; i < 10; i++) {
			c.setInkColor(Color.black);
			for (int j = 0; j < 7; j++) {
				c.drawLine(455, 316-j, 455-i, 316-i-j);
			}
			for (int j = 0; j < 7; j++) {
				c.drawLine(546, 316-j, 546+i, 316-i-j);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void typeString(Canvas c, String s, int x, int y, int fSize) {
		c.setFontSize(fSize);
		for (int i = 0; i < s.length(); i++) {
			String toPrint = "" + s.charAt(i);
			c.drawString(toPrint, x+(i*(fSize-5)), y);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
