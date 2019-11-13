package tictactoe;
import java.awt.Color;
import java.awt.Point;
import resources.Canvas;

import java.util.Random;

public class TicTacToe {
	
	Random r = new Random();
	TTTGS[][] box = new TTTGS[3][3];
	Canvas cv = new Canvas(); 
	public int turnCounter = 1;
	boolean won;
	boolean vsComputer;
	
	public TicTacToe(boolean VScomputer) {
		vsComputer = VScomputer;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				TTTGS creator = new TTTGS();
				box[x][y] = creator;
			}
		}
		won = true;
	}
	public void createWindow() {
		
		cv.setSize(600, 700);
		cv.setVisible(true);
	}
	public void drawBoard(int xcor, int ycor) {
	
		int l1Y = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(200+l1Y+ycor, 0, 200+l1Y+ycor, 600);
			l1Y++;
		}
		int l2Y = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(400+l2Y+ycor, 0, 400+l2Y+ycor, 600);
			l2Y++;
		}
		int l1X = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(0, 200+l1X+xcor, 600, 200+l1X+xcor);
			l1X++;
		}
		int l2X = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(0, 400+l2X+xcor, 600, 400+l2X+xcor);
			l2X++;
		}
	}
	public void drawX(int p1x, int p1y, int p2x, int p2y) {
		cv.setInkColor(Color.blue);
		int l1X = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(p1x, p1y+l1X, p2x, p2y+l1X);
			l1X++;
		}
		int l2X = -5;
		for (int x = 0; x < 10; x++) {
			cv.drawLine(p2x, p1y+l2X, p1x, p2y+l2X);
			l2X++;
		}
		cv.setInkColor(Color.black);
	}
	public void drawCirc(int crnX, int crnY) {
		cv.setInkColor(Color.red);
		cv.drawFilledOval(crnX, crnY, 190, 190);
		cv.setInkColor(Color.black);
	}
	public int isWon() {
		int winner = 0;
		int sum = 0;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				sum+=box[x][y].holder;
			}
			if (sum == 3 || sum == -3) {
				if (sum == 3) {
					winner = 1;
				} else {
					winner = -1;
				}
				break;
			} else {
				sum = 0;
			}
			
		}
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				sum+=box[y][x].holder;
			}
			if (sum == 3 || sum == -3) {
				if (sum == 3) {
					winner = 1;
				} else {
					winner = -1;
				}
				break;
			} else {
				sum = 0;
			}
			
		}
		if (box[0][0].holder + box[1][1].holder + box[2][2].holder == 3) {
			winner = 1;
		} else if (box[0][0].holder + box[1][1].holder + box[2][2].holder == -3 ) {
			winner = -1;
		} else if (box[0][2].holder + box[1][1].holder + box[2][0].holder == 3 ) {
			winner = 1;
		} else if (box[0][2].holder + box[1][1].holder + box[2][0].holder == -3 ) {
			winner = -1;
		}
		return winner;
	}
	public void yourTurn() {
		if (turnCounter%2 == 0) {
			cv.setFontSize(20);
			cv.drawString("Circles's Turn",  100, 625);
		} else {
			cv.setFontSize(20);
			cv.drawString("X's Turn",  100, 625);
		}
		if (vsComputer == false) {
			humanPlayer();
		} else {
			if (turnCounter%2 != 0) {
				humanPlayer();
			} else {
				robotPlayer();
			}
		}
		isWonDisplay();
	}
	public void robotPlayer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x1cor = r.nextInt(3)*100+100;
		int y1cor = r.nextInt(3)*100+100;
		int x = -1;
		int y = -1;
		
		if (x1cor < 200) {
			x = 0;
			x1cor = 5;
		} else if (x1cor > 200 && x1cor < 400) {
			x = 1;
			x1cor = 205;
		} else {
			x = 2;
			x1cor = 405;
		}
		if (y1cor < 200) {
			y = 0;
			y1cor = 5;
		} else if (y1cor > 200 && y1cor < 400) {
			y = 1;
			y1cor = 205;
		} else {
			y = 2;
			y1cor = 405;
		}
		if (box[x][y].filled) {
			return;
		}
		box[x][y].setFilled(true);
		if (turnCounter%2 == 0) {
			box[x][y].setHolder(-1);
			drawCirc(x1cor, y1cor);
			
		} else {
			box[x][y].setHolder(1);
			drawX(x1cor, y1cor, x1cor+195, y1cor+195);
		}
		endOfTurnActions();
	}
	public void humanPlayer() {
		cv.waitForClick();
		Point xy = cv.waitForClick();
		int x1cor = (int)xy.getX();
		int y1cor = (int)xy.getY();
		int x = -1;
		int y = -1;
		
		if (x1cor < 200) {
			x = 0;
			x1cor = 5;
		} else if (x1cor > 200 && x1cor < 400) {
			x = 1;
			x1cor = 205;
		} else {
			x = 2;
			x1cor = 405;
		}
		if (y1cor < 200) {
			y = 0;
			y1cor = 5;
		} else if (y1cor > 200 && y1cor < 400) {
			y = 1;
			y1cor = 205;
		} else {
			y = 2;
			y1cor = 405;
		}
		if (box[x][y].filled) {
			cv.drawString("Square already filled!", 250, 625);
			cv.waitForClick();
			cv.eraseString("Square already filled!", 250, 625);
			return;
		}
		box[x][y].setFilled(true);
		if (turnCounter%2 == 0) {
			box[x][y].setHolder(-1);
			drawCirc(x1cor, y1cor);
			
		} else {
			box[x][y].setHolder(1);
			drawX(x1cor, y1cor, x1cor+195, y1cor+195);
		}
		endOfTurnActions();
	}
	public void endOfTurnActions() {
		if (turnCounter%2 == 0) {
			cv.setFontSize(20);
			cv.eraseString("Circles's Turn",  100, 625);
		} else {
			cv.setFontSize(20);
			cv.eraseString("X's Turn",  100, 625);
		}
		turnCounter++;
	}
	public void isWonDisplay() {
		if (isWon() == 1) {
			cv.setInkColor(Color.white);
			cv.drawFilledRectangle(0, 0, 600, 700);
			cv.setInkColor(Color.black);
			cv.drawString("X Won!", 250, 340);
			won = false;
		} else if (isWon() == -1) {
			cv.setInkColor(Color.white);
			cv.drawFilledRectangle(0, 0, 600, 700);
			cv.setInkColor(Color.black);
			cv.drawString("O Won!", 250, 340);
			won = false;
		}
	}
}
