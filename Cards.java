package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    public static void main(String[] args) {
        List<PlayingCard> deck = createDeck();

        // Print the created deck
        for (PlayingCard card : deck) {
            System.out.println(card.toString());
        }
    }

    public static List<PlayingCard> createDeck() {
        List<PlayingCard> deck = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                PlayingCard card = new PlayingCard(rank, suit);
                deck.add(card);
            }
        }

        return deck;
    }

    @Override
    public String toString() {
        return "Cards []";
    }
}

abstract class Card {
    @Override
    public abstract String toString();
}

class PlayingCard extends Card {
    private final Rank rank;
    private final Suit suit;

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}
