//import java.util.Random;

public class Card {

  //Fields
  
//  private static Random random = new Random();
  
  
  //Card Value (2 - 14) 
  private int value;
  
  //Card Name (Hearts, Diamond, Spades, Clubs
  private int name;

  
  //Enumeration of the different suits in a deck of cards
  //Heart, Diamond, Spade, Club
//  enum suitOfCard{
//    HEARTS, DIAMONDS, SPADES, CLUBS
//  }
//  
  
  //Constructor
  public Card () {

  }
  
  
  public Card(int number, int suit) {
    
    this.value = number;
    this.name = suit;
  }
  
  
  
  //Methods
  
  //set the value of the card when a card is randomly drawn from the deck
  //does not need it public as this will be done internally
//  private int setValue() {
//    this.value = random.nextInt(13) + 2;
//    return value;
//  }
  
  public int getValue() {
    return value;
  }


  public int getName() {
    return name;
  }

//  public void setCardValue(int valueOfCard, int suitOfCard) {
//    this.value = valueOfCard;
//    this.name = suitOfCard;
//  }
  
  //set the suit of the card when a card is randomly drawn from the deck
  //does not need to be public as this will be done internally
//  private int setName() {
//    this.name = random.nextInt(3) + 1;
//    return name;
//  }
 
  
  //describes the card value and suit of card
  public String describe() {

    String cardDescription = setStringValue(this.value) + " of " + setSuitValue(this.name);
    return cardDescription;

    //end of describe method
  }
  
  
  
  //create switch to spell out the value of the card
  private String setStringValue(int cardValue) {
  
    String valueOfCard = "";
    
  //create switch for each value in a card deck
    switch(cardValue) {
    
    case 2:
      valueOfCard = "Two";
      break;
    case 3:
      valueOfCard = "Three";
      break;
    case 4:
      valueOfCard = "Four";
      break;
    case 5:
      valueOfCard = "Five";
      break;
    case 6:
      valueOfCard = "Six";
      break;
    case 7:
      valueOfCard = "Seven";
      break;
    case 8:
      valueOfCard = "Eight";
      break;
    case 9:
      valueOfCard = "Nine";
      break;
    case 10:
      valueOfCard = "Ten";
      break;
    case 11:
      valueOfCard = "Jack";
      break;
    case 12:
      valueOfCard = "Queen";
      break;
    case 13:
      valueOfCard = "King";
      break;
    case 14:
      valueOfCard = "Ace";
      break;
    //end of switch
  }
    return valueOfCard;
  //end of cardStringValue Method
  }
  
  
  //create switch to get suit of card
  private String setSuitValue (int cardValue) {
    String cardSuit = "";
    switch(cardValue) {
      case 1:
        cardSuit = "Diamonds";
        break;
      case 2:
        cardSuit = "Hearts";
        break;
      case 3:
        cardSuit = "Spades";
        break;
      case 4:
        cardSuit = "Clubs";
        break;          
        
    //end of switch
    }
    return cardSuit;
    //end of cardSuitValue method
  }
  
  
  //end of Card class
}
