package labs.elevens;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class elevensBoard {

	/**
	 * The size (number of card) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the card for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the card for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the card for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	/**
	 * The card on this board.
	 */
	private card[] cards;

	/**
	 * The deck of card being used to play the current game.
	 */
	private deck decks;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;

    public static String printCards(elevensBoard board){
        List<Integer> cIndexes = board.cardIndexes();
        String toPrint = "[";
        for(int i =0; i< board.deckSize(); i++){
            toPrint+=board.decks.getCard(cIndexes.get(i))+"\t";
        }
        return toPrint;
    }

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public elevensBoard() {
		cards = new card[BOARD_SIZE];
		decks = new deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(decks);
			System.out.println("----------");
		}
		dealMyCards();
	}

	/**
	 * Start a new game by shuffling the deck and
	 * dealing some card to this board.
	 */
	public void newGame() {
		decks.shuffle();
		dealMyCards();
	}

	/**
	 * Accesses the size of the board.
	 * Note that this is not the number of card it contains,
	 * which will be smaller near the end of a winning game.
	 * @return the size of the board
	 */
	public int size() {
		return cards.length;
	}

	/**
	 * Determines if the board is empty (has no card).
	 * @return true if this board is empty; false otherwise.
	 */
	public boolean isEmpty() {
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Deal a card to the kth position in this board.
	 * If the deck is empty, the kth card is set to null.
	 * @param k the index of the card to be dealt.
	 */
	public void deal(int k) {
		cards[k] = decks.deal();
	}

	/**
	 * Accesses the deck's size.
	 * @return the number of undealt card left in the deck.
	 */
	public int deckSize() {
		return decks.size();
	}

	/**
	 * Accesses a card on the board.
	 * @return the card at position k on the board.
	 * @param k is the board position of the card to return.
	 */
	public card cardAt(int k) {
		return cards[k];
	}

	/**
	 * Replaces selected card on the board by dealing new card.
	 * @param selectedCards is a list of the indices of the
	 *        card to be replaced.
	 */
	public void replaceSelectedCards(List<Integer> selectedCards) {
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}

	/**
	 * Gets the indexes of the actual (non-null) card on the board.
	 *
	 * @return a List that contains the locations (indexes)
	 *         of the non-null entries on the board.
	 */
	public List<Integer> cardIndexes() {
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				selected.add(new Integer(k));
			}
		}
		return selected;
	}

	/**
	 * Generates and returns a string representation of this board.
	 * @return the string version of this board.
	 */
	public String toString() {
		String s = "";
		for (int k = 0; k < cards.length; k++) {
			s = s + k + ": " + cards[k] + "\n";
		}
		return s;
	}

	/**
	 * Determine whether or not the game has been won,
	 * i.e. neither the board nor the deck has any more card.
	 * @return true when the current game has been won;
	 *         false otherwise.
	 */
	public boolean gameIsWon() {
		if (decks.isEmpty()) {
			for (card c : cards) {
				if (c != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Determines if the selected card form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face card
	 * whose values add to 11, and (2) a group of three card consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected card.
	 * @return true if the selected card form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face card whose values add to 11, or (2) a group
	 * of three card consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    }


	/**
	 * Deal card to this board to start the game.
	 */
	private void dealMyCards() {
		for (int k = 0; k < cards.length; k++) {
			cards[k] = decks.deal();
		}
	}

	/**
	 * Check for an 11-pair in the selected card.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}

	/**
	 * Check for a JQK in the selected card.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}
}
