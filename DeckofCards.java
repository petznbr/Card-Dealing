package dealcards;

public class DeckofCards {
    
    private Card[] deck; // Am array to hold all 52 cards.
    private int cardsUsed; // Holds number of cards dealt.
    
    public DeckofCards() //Creates a deck of cards.
    {
       deck = new Card[52];
       int cardCt = 0;
       for ( int suit = 0; suit <= 3; suit++ ) //For loop to create suit of cards.
       {
          for ( int value = 1; value <= 13; value++ ) //For loop to create value of cards.
          {
             deck[cardCt] = new Card(value,suit);
             cardCt++;
          }
       }
       cardsUsed = 0; //Sets used cards to 0.
    }
    
    public void shuffle() //Sets card deck to 52 and Shuffles cards.
    {
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
    
    public int cardsLeft() //Calculates number of cards remaining in deck.
    {
        return 52 - cardsUsed;
    }
    
    public Card dealCard() //Deals one card out and returns the card.
    {
        if (cardsUsed == 52)
           shuffle();
        cardsUsed++; //Adds one card to used card pile.
        return deck[cardsUsed - 1]; //Minuses one card from deal deck.
    }

}