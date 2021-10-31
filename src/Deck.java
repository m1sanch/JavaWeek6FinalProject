import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  //Fields
  //Collection of cards for a deck of cards
  private List<Card> cards = new ArrayList<Card>();

  
  //Constructor
  //Standard deck of cards
  public Deck() {
    for(int index = 2; index <=14; index++) {
      for(int suitValue = 1; suitValue<=4; suitValue++) {
        cards.add(new Card(index, suitValue));
      }
    }
  }

  
 
  //Methods
  
  //Shuffle - randomizes the order of cards
  public void shuffleDeck () {
    //comments if necessary
    Collections.shuffle(cards);    
    //end of shuffle method
  }
  
  

  //Draw - removes and returns the top card of the Cards field  
  public Card drawCard() {
    //removes top card but due to array properties need to minus one for index
    return cards.remove(cards.size() - 1);
    //end of Deck class
  }
  
  
//end of Deck class
}
