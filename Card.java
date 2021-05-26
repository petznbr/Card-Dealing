package dealcards;

public class Card {

    public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3; //Asigns interger values to suits.
                            
    public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13; //Assigns interger to none numeric values.
                            
    private final int suit; //Holds interger value of suit.
                              
    private final int value; // Holds interger value of value.
    
    public Card(int theValue, int theSuit) // Construct a card with the specified value and suit.
    {
        value = theValue;
        suit = theSuit;
    }
        
    public int getSuit() //Gets the interger value of the suit.
    {
        return suit;
    }
    
    public int getValue() //Gets the interger value of the value.
    { 
        return value;
    }
    
    public String getSuitAsString() //Gets the string value of suit.
    {
        switch ( suit )
        {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "??";
        }
    }
    
    public String getValueAsString() //Gets the string value of value.
    {
        switch ( value )
        {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "??";
        }
    }
    
    public String toString() //Returns the final card.
    {
        return getValueAsString() + " of " + getSuitAsString();
    }
}