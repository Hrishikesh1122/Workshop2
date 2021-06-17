/******************************************************************************
 * Purpose : Workshop 2 Oops
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/
package service;

import java.util.ArrayList;
import java.util.HashSet;
import model.Card;

public class DeckOfCards {
	
	private  String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private  String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private  ArrayList<Card> deck = new ArrayList<>(52);

	/**
	 * Creates a deck of cards "deck" (ArrayList) from symbols[] and ranks[]
	 * deck stores objects of class Card.
	 * Created HashSet to check if all cards are unique
	 * If sizes are same it means all cards are unique
	 * @return 1 if all cards are unique
	 * Else return 0
	 */
	private int buildDeck() {
		
		for(int i=0;i<52;i++) {
			Card newcard = new Card(suits[i/13],ranks[i%13]);
			deck.add(newcard);
		}
		
		HashSet<Object> hashSet = new HashSet<>(deck);
		
		if(hashSet.size()==deck.size()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.buildDeck();
	}

}
