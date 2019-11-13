package TicTacToe;

public class TTTGS {
	
	public int holder;
	public boolean filled = false;
	
	public TTTGS () {
		holder = 0;
	}
	public void setHolder(int hldr) {
		holder = hldr;
		// 1 == X
		//-1 == O
	}
	public void setFilled(boolean wot) {
		filled = wot;
	}
}
