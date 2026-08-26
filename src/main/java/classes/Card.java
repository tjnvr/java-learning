package classes;

import lombok.val;

public class Card {
    private int suite; // 1 - 4, clubs, diamonds, hearts, spades
    private int rank; // 2 - 10, J, Q, K, A

    public Card(int suite, int rank) {
        this.suite = suite;
        this.rank = rank;
    }

    @Override
    public String toString() {
        val rankString = switch (rank) {
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> String.valueOf(rank);
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            case 14 -> "Ace";
            default -> throw new IllegalStateException("Unexpected value: " + rank);
        };

        val suiteString = switch (suite) {
            case 1 -> "Clubs";
            case 2 -> "Diamonds";
            case 3 -> "Hearts";
            case 4 -> "Spades";
            default -> throw new IllegalStateException("Unexpected value: " + suite);
        };

        return rankString + " of " + suiteString;
    }
}
