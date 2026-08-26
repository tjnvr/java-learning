package classes;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public final static List<Card> CARDS = initCards();

    private static List<Card> initCards() {
        val cards = new ArrayList<Card>();
        for (int suite = 1; suite < 5; suite++) {
            for (int rank = 2; rank < 15; rank++) {
                cards.add(new Card(suite, rank));
            }
        }
        return cards;
    }
}
