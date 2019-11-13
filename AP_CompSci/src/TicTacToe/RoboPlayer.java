package TicTacToe;

import java.util.Random;

public class RoboPlayer { // basic logic class, implement for robo- player in TTT
	
	private TTTGS[][] ref;
	private Random r = new Random();
	
	public RoboPlayer(TTTGS[][] refre) {
		ref = refre;
	}
	public int	toPlayXCor(){
		if (whichPlayX() != -1) {
			return whichPlayX()*100+100;
		} else {
			return r.nextInt(3)*100+100;
		}
	}
	public int toPlayYCor() {
		if (whichPlayY() != -1) {
			return whichPlayY()*100+100;
		} else {
			return r.nextInt(3)*100+100;
		}
	}
	public int whichPlayX() {
		int x = -1;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum+=ref[i][j].holder;
			}
			if (sum == 2 || sum == -2) {
				x = i;
				break;
			}
		}
		return x;
	}
	public int whichPlayY() {
		int y = -1;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum+=ref[j][i].holder;
			}
			if (sum == 2 || sum == -2) {
				y = i;
				break;
			}
		}
		return y;
	}
}
