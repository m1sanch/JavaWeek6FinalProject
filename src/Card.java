public class Card {

 //Fields
  
 //Card Value (2 - 14) 
  private int value;
  
 //Card Name (Hearts, Diamond, Spades, Clubs
  private int name;

 
  
  //Constructor
  public Card () {

  }
  
  
  public Card(int number, int suit) {
    
    this.value = number;
    this.name = suit;
  }
  
  
  
  //Methods
  
  public int getValue() {
    return value;
  }


  public int getName() {
    return name;
  }


  //Describes the card value and suit of card
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
