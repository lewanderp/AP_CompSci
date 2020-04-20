package labs.elevens;

import java.util.Arrays;

public class deckTester{
    public static void main(String[] args){

        String [] ranks1 = {"A", "B", "C", "D"};
        String [] suits1 = {"T1", "T2", "T3", "T4"};
        int [] values = {1, 2 , 3, 4};
        deck d1 = new deck(ranks1, suits1, values);
        String [] ranks2 = {"E", "F", "G", "H"};
        String [] suits2 = {"T5", "T6", "T7", "T8"};
        deck d2 = new deck(ranks2, suits2, values);
        String [] ranks3 = {"I", "J", "K", "L"};
        String [] suits3 = {"T9", "T10", "T11", "T12"};
        deck d3 = new deck(ranks3, suits3, values);

        System.out.println("Deck 1: ");
        System.out.println(Arrays.toString(d1.getDeck()) + "|| Size: " + d1.getDeck().length);
        System.out.println("Deck 2: ");
        System.out.println(Arrays.toString(d2.getDeck()) + "|| Size: " + d2.getDeck().length);
        System.out.println("Deck 3: ");
        System.out.println(Arrays.toString(d3.getDeck()) + "|| Size: " + d3.getDeck().length);

        d1.shuffle();
        d2.shuffle();
        d3.shuffle();
        
        System.out.println("Shuffled Decks: ");
        System.out.println("Deck 1: ");
        System.out.println(Arrays.toString(d1.getDeck()) + "|| Size: " + d1.getDeck().length);
        System.out.println("Deck 2: ");
        System.out.println(Arrays.toString(d2.getDeck()) + "|| Size: " + d2.getDeck().length);
        System.out.println("Deck 3: ");
        System.out.println(Arrays.toString(d3.getDeck()) + "|| Size: " + d3.getDeck().length);


        card d1c1, d1c2, d1c3;
        card d2c1, d2c2, d2c3;
        card d3c1, d3c2, d3c3;
        d1c1 = d1.deal();
        d1c2 = d1.deal();
        d1c3 = d1.deal();
        d2c1 = d2.deal();
        d2c2 = d2.deal();
        d2c3 = d2.deal();
        d3c1 = d3.deal();
        d3c2 = d3.deal();
        d3c3 = d3.deal();
        System.out.println("Cards from d1: " + d1c1 +"\t"+ d1c2 +"\t"+ d1c3);
        System.out.println("Cards from d2: " + d2c1 +"\t"+ d2c2 +"\t"+ d2c3);
        System.out.println("Cards from d3: " + d3c1 +"\t"+ d3c2 +"\t"+ d3c3);
    }
}