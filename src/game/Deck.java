package game;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();
    private char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    //constructor for the deck, it calls the populateDeck method
    public Deck (){
        populateDeck();
    }

    //method to populate the cards array (which is essentially the deck), with each suit having cards valued 1-13
    private void populateDeck() {
        int index = 0;

        //outer loop assigns an int value from 1-13
        for(int i = 1; i < 14; i++){
            //inner loop assigns a suit, going through the suits char array - loops 4 times per int (1♠, 1♦, 1♥, 1♣)
            for(int x = 0; x < 4; x++){
                Card card = new Card(suits[x], i); //assigns suit at index of x, and int i to the card
                cards[index] = card; //adds the unique card created on above line to cards array (i.e. adds to deck)
                index++; //index will go up to 51 to populate the 52 card deck array, each card with a unique number/position assigned
            }
        }
    }

    //method to deal a card
    public void deal(Player player){
        int value;

        do{
            Random r = new Random(); //using Random method(?) imported/found online
            value = r.nextInt((51 - 0) + 1) + 0; //picking a random card from the cards array, between 1-52
        } while(usedCards.contains(value)); //checks usedCards ArrayList, if it contains the selected card, will loop again

        player.getHand().getCards().add(cards[value]); //adds the randomly selected card to the player's hand
        usedCards.add(value); //adds the randomly selected card to the usedCards ArrayList
    }

    //clears the usedCards ArrayList, so we can now have any/all cards in the deck available for selection again
    public void shuffleDeck(){
        usedCards.clear();
    }

    //method to deal two cards each to player and dealer at start of hand
    public void initialDeal(Player player, Player dealer) {
        deal(player);
        deal(dealer);
        deal(player);
        deal(dealer);

        System.out.println();
        System.out.println("You were dealt: ");
        player.printHand(true);
        System.out.println();
        System.out.println("And the dealer was dealt: ");
        dealer.printHand(false);
    }
}
