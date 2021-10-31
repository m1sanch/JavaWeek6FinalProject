import java.util.ArrayList;
import java.util.Random;

public class Player {
  
  private static Random random = new Random();

  //Fields
  //Hand - list of cards in hand
  private ArrayList<Card> cardsInHand = new ArrayList<Card>();
  
  //Score - Current score of the player
  private int score;
  
  //Name - name of player
  private String playerName;
  
  
  //Constructor - New players have a score of zero.
  public Player() {
    score = setScore(0);
  }

  
  //Methods

  public ArrayList<Card> getCardsInHand() {
    return cardsInHand;
  }


  public int getScore() {
    return score;
  }


  public int setScore(int score) {
    return this.score = score;
  }


  public String getPlayerName() {
    return playerName;
  }


  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }
  
  
  //Prints out information about the player 
  //Calls the describe method for each card in the Hand List
  public void describe() {   
    System.out.println(String.format("Hello my name is %s . My current score is %d.", getPlayerName(), getScore()));
    System.out.println("I currently have the following cards in my hand:\r\n");
    
    //prints the information for each card in the players hand
    //need an enhanced for loop to get all of the cards in hand
    if(cardsInHand.size() == 0) {
      System.out.println("None");
    } else {
    for(Card card: cardsInHand){
    System.out.println(card.describe());
    }
    }
    //end of describe method
  }

  
  
  //Flip - will remove and return the top card of the Hand
  public Card flip() {
    
    Card flippedCard = new Card();
    
    if (cardsInHand.size() == 1) {
      flippedCard = cardsInHand.remove(0);
    } else if (cardsInHand.size() > 1) {    
    flippedCard = cardsInHand.remove(random.nextInt(cardsInHand.size()));
    }
    return flippedCard;
    //end of flip method
  }

  
  
  //Draw - takes a card from the Deck and adds to the hand field
  public void drawCard(Deck deck) {
    cardsInHand.add(deck.drawCard());
    //end of draw method
  }
  
  
  

  
  //IncrementScore - adds 1 to the score if wins rounds does nothing otherwise
  public void incrementScore() {
    this.score ++;
    //end of incrementScore method
  }


  
  
  //end of Player class
}
