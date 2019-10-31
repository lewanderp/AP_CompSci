package graphics;

import java.awt.Color;
import resources.Canvas;

public class CheckerBoard {
	public static void main (String [] args) {
		Canvas c = new Canvas();
		
		c.setSize(800, 800);
		c.setVisible(true);
		int count = 1;
		boolean [] [] board = new boolean [8][8]; 
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (count % 2 == 0) {
					board[i][j] = false;
					c.setInkColor(Color.black);
					
				} else {
					board[i][j] = true;
					c.setInkColor(Color.white);
				}
				c.drawFilledRectangle(100*j, 100*i, 100, 100);
				count++;
			}
			count++;
		}
		
	}
}
