package inheritanceobjects;

public class Main {
    public static void main(String[] args) {
        Deck.CARDS.forEach(System.out::println);
        assert (Deck.CARDS.size() == 52);
        assert (new Card(Card.Suite.SPADES, Card.Rank.AS).toString().equals("Ace of Spades"));
        assert (new Card(Card.Suite.CLUBS, Card.Rank.FIVE).toString().equals("5 of Clubs"));
    }
}
