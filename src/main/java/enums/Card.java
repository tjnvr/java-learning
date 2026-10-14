package enums;

import lombok.val;

public class Card {
    private Suite suite;
    private int rank;

    public Card(Suite suite, int rank) {
        this.suite = suite;
        this.rank = rank;
    }

    enum Suite {
        CLUBS("clubs", 1),
        DIAMONDS("diamonds", 2),
        HEARTS("hearts", 3),
        SPADES("spades", 4);

        private final String name;
        private final int value;

        Suite(String name, int value){
            this.name = name;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        String rankString = switch (rank) {
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> String.valueOf(rank);
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            case 14 -> "Ace";
            default -> throw new IllegalStateException("Unexpected value: " + rank);
        };

        return rankString + " of " + suite.name;
    }
}
