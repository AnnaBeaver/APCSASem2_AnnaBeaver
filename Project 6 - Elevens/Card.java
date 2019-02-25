
public class Card
{
    //holds the suit of the card
    private String suit;
    
    //holds the rank of the card
    private String rank;
    
    //holds the point value of the card
    private int pointValue;
    
    public Card(String cardRank, String cardSuit, int cardPointValue){
        //Constructor
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    
    //getter for the point value of the card
    public int pointValue(){
        return pointValue;
    }
    
    //getter for the suit of the card
    public String suit(){
        return suit;
    }
    
    //getter for the rank of the card
    public String rank(){
        return rank;
    }
    
    //tests if the two cards are equal,and returns either true or false
    public boolean matches(Card otherCard){
        return ( (otherCard.suit()).equals(this.suit()) ) && ( (otherCard.rank()).equals(this.rank()) ) && ( (otherCard.pointValue) == (this.pointValue) );
    }
    
    public String toString(){
        return rank + "of + suit + (Point Value = " + pointValue + ")";
    }
}
