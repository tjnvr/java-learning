package inheritanceobjects;

import lombok.Getter;

@Getter
public class Card extends Object {

    private Suite suite;
    private Rank rank;

    public Card(Suite suite, Rank rank) {
        this.suite = suite;
        this.rank = rank;
    }

    enum Rank {
        TWO("Two", 2),
        THREE("Three", 3),
        FOUR("Four", 4),
        FIVE("Five", 5),
        SIX("Six", 6),
        SEVEN("Seven", 7),
        HEIGHT("Height", 8),
        NINE("Nine", 9),
        TEN("Ten", 10),
        JACK("Jack", 11),
        QUEEN("Queen", 12),
        KING("King", 13),
        AS("As", 14);

        private final String name;
        private final int value;

        Rank(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    enum Suite {
        CLUBS("clubs", 1),
        DIAMONDS("diamonds", 2),
        HEARTS("hearts", 3),
        SPADES("spades", 4);

        private final String name;
        private final int value;

        Suite(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }
        return ((Card) obj).getRank() == this.rank &&
               ((Card) obj).getSuite() == this.suite;
    }

    public int hashCode() {
        return ((suite.value - 1) * 13) + rank.value;
    }

    public String toString() {
        return rank.name + " of " + suite.name;
    }
}
