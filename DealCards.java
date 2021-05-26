//********************************************************************
//  Creates a card deck using DeckofCards class and Card class and deals out
//  cards one by one and counts how many cards are left in deck.
//********************************************************************

package dealcards;

public class DealCards {

    public static void main(String[] args) {
        
        DeckofCards cards = new DeckofCards(); //Creats new DeckofCards object.
        int cardNumber = 0; //Sets up number of cards to 0.
        
        cards.shuffle(); //Shuffles deck of cards.
        
       do //Sets up loop to deal card and print out value.
       {
           System.out.println(cards.dealCard()); //Prints out dealt card.
           System.out.println("Left over cards in deck: " + cards.cardsLeft()); //Prints out number of cards left in deck.
           cardNumber ++; //adds one to card pile dealt.
       }
       while(cardNumber <= 51); //Will continue until cardNumber is 51.
    }
    
}