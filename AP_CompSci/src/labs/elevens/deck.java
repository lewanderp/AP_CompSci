package labs.elevens;

import java.util.ArrayList;

public class deck {
    
    private ArrayList<card> cards = new ArrayList<card>();
    private card [] deck;
     
    public deck(String[] ranks, String[] suits, int[] values){
        initDeck(genCards(ranks, suits, values));
    }

    private ArrayList<card> genCards(String[] ranks, String[] suits, int[] values){
        
        for(String i:suits){
            for(int j = 0; j<ranks.length && j<values.length; j++){
                cards.add(new card(ranks[j], i, values[j]));
            }
        }
        return cards;
    }

    private void initDeck(ArrayList<card> cards){
        deck = new card[cards.size()];

    }
}