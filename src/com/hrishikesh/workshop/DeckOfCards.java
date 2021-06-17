/******************************************************************************
 * Purpose : Workshop 2 Oops
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/
package com.hrishikesh.workshop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {
	
	private  String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private  String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private  String[] deck = new String[52];

	/**
	 * Creates a deck of cards (1D array) from symbols[] and ranks[]
	 * Created HashSet to check if all cards are unique
	 * If sizes are same it means all cards are unique
	 * @return string array deck of cards if all cards are unique
	 * Else return null
	 */
	private String[] buildDeck() {
		for (int i = 0; i < deck.length; i++)
			deck[i] = suits[i / 13] + "->" + ranks[i % 13];
		
		Set<String> checkSet = new HashSet<String>(Arrays.asList(deck));
		
		if(checkSet.size()==deck.length) {
			return deck;
		}
		else {
			return null;
		}
	}

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.buildDeck();
	}

}
