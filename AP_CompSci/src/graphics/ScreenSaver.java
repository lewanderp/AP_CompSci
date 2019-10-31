package graphics;

import java.awt.Color;
import java.util.Random;
import resources.Canvas;

public class ScreenSaver {
	public static int XMULT;
	public static int YMULT;
	public static void main (String [] args) {
		Canvas c = new Canvas();
		Random r = new Random();
		
		c.setVisible(true);
		c.setSize(1000, 500);
		drawBack(c);
		
		int randX = r.nextInt(450);
		int randY = r.nextInt(950);
		c.drawFilledOval(randY, randX, 50, 50);
		Color colorStr = genColor();
		int xNegCount = 0;
		int yNegCount = 0;
		int count = 0;
		while (true) {
			int xVal = 0;
			int yVal = 0;
			if (XMULT > 0) {
				xVal =  count*XMULT;
				xNegCount = 0;
			} else {
				xNegCount++;
				xVal = count - (XMULT * xNegCount);
			}
			if (YMULT > 0) {
				yVal =  count*YMULT;
				yNegCount = 0;
			} else {
				yNegCount++;
				yVal = count - (YMULT * yNegCount);
			}
			setXMult(xVal);
			setYMult(yVal);
			drawBack(c);
			if (count % 70 == 0) {
				colorStr = genColor();	
			}
			c.setInkColor(colorStr);
			c.drawFilledOval(xVal+1, yVal+1, 50, 50);
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			if (count > 1000) {
				break;
			}
			count++;
			
		}
		
	}
	public static void genDir() {
		
	}
	public static boolean isBotCol(int y) {
		if (y >=500) {
			return true;
		}
		return false;
	}
	public static boolean isTopCol(int y) {
		if (y <= 0) {
			return true;
		}
		return false;
	}
	public static boolean isLeftCol(int x) {
		if (x <= 0) {
			return true;
		}
		return false;
	}
	public static boolean isRightCol(int x) {
		if (x >= 1000) {
			return true;
		}
		return false;
	}
	public static void setXMult(int x) {
		if (isRightCol(x)) {
			XMULT = -1;
		} else if (isLeftCol(x)) {
			XMULT = 1;
		}
	}
	public static void setYMult(int y) {
		if (isBotCol(y)) {
			YMULT = -1;
		} else if (isTopCol(y)) {
			YMULT = 1;
		}
	}
		
	public static Color genColor() {
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
	public static void drawBack(Canvas c) {
		c.setInkColor(Color.black);
		c.drawFilledRectangle(0, 0, 1000, 500);
	}
}
