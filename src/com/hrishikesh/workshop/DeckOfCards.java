/******************************************************************************
 * Purpose : Workshop 2 Oops
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/
package com.hrishikesh.workshop;

public class DeckOfCards {
	
	private static String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private static String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private static String[] deck = new String[52];

	/**
	 * Creates a deck of cards (1D array) from symbols[] and ranks[]
	 * @return string array deck of cards
	 */
	private String[] getDeck() {
		for (int i = 0; i < deck.length; i++)
			deck[i] = suits[i / 13] + "->" + ranks[i % 13];
		return deck;
	}

	public static void main(String[] args) {
		DeckOfCards d = new DeckOfCards();
		d.getDeck();
	}

}
