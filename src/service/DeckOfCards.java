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
import java.util.Scanner;

import model.Card;
import model.Player;

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
	
	/**
	 * Creates players according to user input from console
	 * Checks for condition that number of players should be more than 2 and less than
	 * or equal to 4. If condition is satisfied it
	 * Creates objects player of class Player and assigns them a playerName
	 * Otherwise it asks user to enter number again
	 */
	private void createPlayers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many players ? ");
		int numberOfPlayers = sc.nextInt();
		
		if(numberOfPlayers>2 && numberOfPlayers<=4) {
			Scanner sc1 = new Scanner(System.in);
			for(int i=1;i<=numberOfPlayers;i++) {
				System.out.println("Enter player "+i+" name");
				String name = sc1.nextLine();
				Player player = new Player(name);	
			}
			sc1.close();
		}
		else {
			System.out.println("Number should be more than 2 and less than or equal to 4");
			createPlayers();
		}
	}
	
	

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.buildDeck();
		deck.createPlayers();
	}

}
