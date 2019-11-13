package TicTacToe;

public class TicTacToe2P {
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		TicTacToe game1 = new TicTacToe(false);
		game1.createWindow();
		while (game1.turnCounter < 10 && game1.won)
		{
			game1.drawBoard(0,0);
			game1.yourTurn();
		}
	}
}
