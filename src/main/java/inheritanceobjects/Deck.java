package inheritanceobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    public final static List<Card> CARDS = initCards();

    private static List<Card> initCards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        Arrays.stream(Card.Suite.values()).forEach(suite -> {
            Arrays.stream(Card.Rank.values()).forEach(rank -> {
                cards.add(new Card(suite, rank));
            });
        });

        return cards;
    }
}
