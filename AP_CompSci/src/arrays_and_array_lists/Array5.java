package arrays_and_array_lists;

import java.awt.Color;
import resources.Canvas;

public class Array5 {
	public static void main (String [] args) {
		
		Canvas c = new Canvas();
		
		//convex points
		int[] convHexX = {-1,0,2,3,2 ,0 ,-1};
		int[] convHexY = {0 ,2,2,0,-2,-2,0};
		
		//concave points
		int[] concHexX = {1,0,2,3,2 ,0 ,1};
		int[] concHexY = {0 ,2,2,0,-2,-2,0};
		
		// page setup
		pageSetup(c);
		
		//convex hexagon setup
		for (int i = 0; i < convHexX.length; i++) {
			convHexX[i]*=50;
			convHexX[i]+=100;
		}
		for (int i = 0; i < convHexX.length; i++) {
			convHexY[i]*=40;
			convHexY[i]+=100;
		}
		c.drawFilledPolygon(convHexX, convHexY, convHexX.length);
		
		//concave hexagon setup
		for (int i = 0; i < concHexX.length; i++) {
			concHexX[i]*=50;
			concHexX[i]+=100;
		}
		for (int i = 0; i < concHexX.length; i++) {
			concHexY[i]*=40;
			concHexY[i]+=300;
		}
		c.drawFilledPolygon(concHexX, concHexY, concHexX.length);
		
		for (int i = 0; i < 1000; i++) {
			movePolyX(concHexX, concHexY, c);
			c.drawFilledPolygon(convHexX, convHexY, convHexX.length);
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void movePolyX(int X[], int Y[], Canvas c) { // moves polygon
		pageSetup(c);
		for (int i = 0; i < X.length; i++) {
			X[i]++;
		}
		c.drawFilledPolygon(X, Y, X.length);
	}
	public static void pageSetup(Canvas c) { // you wanna guess?
		c.setInkColor(Color.black);
		c.setVisible(true);
		c.setSize(1000, 500);
		c.drawFilledRectangle(0, 0, 1000, 500);
		c.setInkColor(Color.cyan);
	}
}
