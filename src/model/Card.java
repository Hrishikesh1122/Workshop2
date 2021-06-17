package model;

public class Card {
	public String suit;
	public String rank;

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	

}
