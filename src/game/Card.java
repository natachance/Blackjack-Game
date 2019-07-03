package game;

public class Card {
    //variables for each attribute of a card
    private char suit;
    private int faceValue;
    private int pointValue;
    private String cardName;

    //Card constructor
    public Card(char suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;

        //accounts for face cards by assigning them all values of 10, while maintaining their number identifier
        if (faceValue > 10){
            pointValue = 10;
        } else {
            pointValue = faceValue;
        }

        switch(faceValue){
            case 1:
                cardName = "Ace";
                break;
            case 2:
                cardName = "2";
                break;
            case 3:
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "10";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";
                break;
        }
    }

    //getter methods for all instance variables in Card class
    public char getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    //toString to be able to print card suit and value (I think I can adjust this to make it print better)
    @Override
    public String toString() {
        return "Card: " +
                cardName + " " +
                suit;
    }
}
