package graphics;

import java.awt.Color;
import resources.Canvas;

public class SkyLine {
	public static void main (String [] args)	{
		Canvas c = new Canvas();
		
		c.setSize(1000, 500);
		c.setVisible(true);
		c.setInkColor(Color.black);
		c.drawFilledRectangle(0, 0, 1000, 500);
		
		for (int i = 0; i < 10; i++) {
			Building b = new Building(false, 1000, 500);
			b.drawBuilding(c);
			b.changeColor(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Howdy2");
		}
	}
}
