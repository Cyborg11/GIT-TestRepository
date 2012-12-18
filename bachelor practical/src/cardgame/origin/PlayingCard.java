package cardgame.origin;

import java.util.Random;

public class PlayingCard {

	private static String[] RANKS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"},
			SUITS = {"Spades", "Hearts", "Clubs", "Diamonds"};
	private int suit, rank;

	public PlayingCard(int suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	public PlayingCard() {
		Random r = new Random();
		suit = r.nextInt(SUITS.length);
		rank = r.nextInt(RANKS.length);
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
	
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}
}