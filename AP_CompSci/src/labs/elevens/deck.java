package labs.elevens;

import java.util.ArrayList;
import java.util.Random;

public class deck {

    private ArrayList<card> cards = new ArrayList<card>();
    private int deckSize;

    public deck(String[] ranks, String[] suits, int[] values) {
        cards = genCards(ranks, suits, values);
        deckSize = cards.size()-1;
    }

    private ArrayList<card> genCards(String[] ranks, String[] suits, int[] values) {
        ArrayList<card> toReturn = new ArrayList<card>();
        for (String i : suits) {
            for (int j = 0; j < ranks.length; j++) {
                toReturn.add(new card(ranks[j], i, values[j]));
            }
        }
        return toReturn;
    }

    public card[] getDeck() {
        card[] deck = new card[cards.size()];
        int i = 0;
        for (card c : cards) {
            deck[i] = c;
            i++;
        }
        return deck;
    }

    public void shuffle() {
        Random r = new Random();
        for (int i = 0; i < cards.size(); i++) {
			int randomIndexToSwap = r.nextInt(cards.size());
			card temp = cards.get(randomIndexToSwap);
			cards.set(randomIndexToSwap, cards.get(i));
			cards.set(i, temp);
		}
    }

    public card deal(){
        int size = deckSize;
        deckSize--;
        return getCard(size);
    }

    public card getCard(int index) {
        return cards.get(index);
    }
}