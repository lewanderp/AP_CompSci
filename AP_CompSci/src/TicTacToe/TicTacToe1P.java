package TicTacToe;

public class TicTacToe1P {
	public static void main (String [] args) {
		TicTacToe game1 = new TicTacToe(true);
		
		game1.createWindow();
		while (game1.turnCounter < 10 && game1.won)
		{
			game1.drawBoard(0,0);
			game1.yourTurn();
		}
	}
}
