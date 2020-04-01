package labs.elevens;

public class card implements Comparable {

    private String rank;
    private String suit;
    private int value;

    public card(String cardRank, String cardSuit, int cardValue) {
        rank = cardRank;
        suit = cardSuit;
        value = cardValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Object o) {
        card c = (card) (o);

        if (this.getValue() == c.getValue()) {
            return 0;
        } else if (this.getValue() > c.getValue()) {
            return 1;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        card c = (card) (o);
        if (this.compareTo(c) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "[" + rank + ", " + suit + ", " + value + "]";
    }
}