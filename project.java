package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

public class project{

    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Create and shuffle the deck
        List<PlayingCard> deck = createDeck();
        shuffleDeck(deck);

        // Deal cards to players
        dealCards(deck, player1, player2);

        // Print the initial hands of players
        System.out.println(player1.getName() + "'s hand: " + player1.getHand());
        System.out.println(player2.getName() + "'s hand: " + player2.getHand());

        // Implement the game logic here
        // ...

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

    public static void shuffleDeck(List<PlayingCard> deck) {
        // Implement deck shuffling logic here
        // ...
    }

    public static void dealCards(List<PlayingCard> deck, Player... players) {
        // Implement card dealing logic here
        // ...
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

class Player {
    private final String name;
    private List<PlayingCard> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<PlayingCard> getHand() {
        return hand;
    }

    // Add methods for player actions, e.g., playCard, requestCard, etc.
    // ...
}

enum rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

enum suit  {
    CLUBS, DIAMONDS, HEARTS, SPADES
}
