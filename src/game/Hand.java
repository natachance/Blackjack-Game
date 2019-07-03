package game;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){} //default constructor

    //method to get the cards in the hand
    public ArrayList<Card> getCards() {
        return cards;
    }

    //method to get the total value of a hand
    public int getHandValue() {
        int value = 0;
        //looks at each card in the cards (hand) Array Old_TaskList
        for(Card c : cards){
            value += c.getPointValue(); //calls the getter method to get the int pointValue from the card class, adds together
        }
        return value;
    }

    //method to determine if hand value is over 21 (automatically loses)
    public boolean handOver21 (){
        boolean handOver21 = false;
        int value = getHandValue();

        if(value <= 21){
            handOver21 = false;
        } else {
            handOver21 = true;
        }
        return handOver21;
    }

    public void clearHand(){
        cards.clear();
    }
}
