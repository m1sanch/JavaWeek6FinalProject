
public class App {

  public static void main(String[] args) {
    // Will Play the game of War here
    
    //Instance of new deck to play War
    Deck deckForWar = new Deck();
    
    //Shuffle deck of cards to randomize the cards
    deckForWar.shuffleDeck();

    
    
    //Instance of players to play War
    Player player1 = new Player();
    Player player2 = new Player();
    
    //Inputting player's names
    player1.setPlayerName("Michael Sanchez");
    player2.setPlayerName("Kimberly Sanchez");
    
    
    //Opening statement to welcome the players
    System.out.println(String.format("Welcome %s and %s! \r\nGood luck and may the best player win.\r\nMay the odds be ever in your favor!", player1.getPlayerName(), 
                                                                                                                                             player2.getPlayerName()));
    
    System.out.println("Let the games begin!\r\n-----------------------------------------------------------------------");
    
    
    //For loop to draw a card for player1 and player
    //s.t. player1 draws first card and player 2 draws second card
    //players will alternate in drawing cards
    
    for(int index = 0; index < 52; index++) {
      if(index % 2 == 0) {
        player1.drawCard(deckForWar);
      } else {
        player2.drawCard(deckForWar);
      }
    }
    
    //Establish each players hand of cards for validations
    
    System.out.println("Players please introduce yourself to the judge and report the cards in your hand.  You will also report your current score.");
    
    player1.describe();
    player2.describe();
    
    System.out.println("-----------------------------------------------------------------------");
    
    //for loop to flip card to determine who wins round 1 of War
    //Will keep track of each players score depending on who wins the round
    int numOfDrawRounds = 0;
    
    for(int roundNumber = 1; roundNumber < 27; roundNumber++) {
      
      Card player1Card = player1.flip();
      Card player2Card = player2.flip();
      
      //Player 1 Wins
      if (player1Card.getValue() > player2Card.getValue()) {
        player1.incrementScore();
        System.out.println(String.format("Round %d: %s draws %s and %s draws %s", roundNumber, player1.getPlayerName(), player1Card.describe(), player2.getPlayerName(), player2Card.describe()));
        System.out.println(String.format("%s wins the round!\r\n", player1.getPlayerName()));
      } else 
      //Player 2 Wins
        if (player1Card.getValue() < player2Card.getValue()) {
        player2.incrementScore();
        System.out.println(String.format("Round %d: %s draws %s and %s draws %s", roundNumber, player1.getPlayerName(), player1Card.describe(), player2.getPlayerName(), player2Card.describe()));
        System.out.println(String.format("%s wins the round!\r\n", player2.getPlayerName()));
      } else {
      //In Case of Draw - No player wins
        player1.setScore(player1.getScore());
        player2.setScore(player2.getScore());
        numOfDrawRounds++;
        System.out.println(String.format("Round %d: %s draws %s and %s draws %s", roundNumber, player1.getPlayerName(), player1Card.describe(), player2.getPlayerName(), player2Card.describe()));
        System.out.println("No one wins the round.\r\n");
      }
      
      //Prints Final Round Message
      
      if (roundNumber == 26) {
        System.out.println("Game is over!  Players please report your finals scores to the judges to determine the winner!");
        System.out.println("-----------------------------------------------------------------------");
      }
      
     }
    

    
  //Compare score of player1 to player2 to determine game status    
  System.out.println("Final Score:");
  //Prints both players score with the number of rounds that resulted with no winner.
  System.out.println(String.format("%s's score is %d.\r\n%s's score is %d.\r\nThe number of rounds resulted in a draw are %d.", player1.getPlayerName(), player1.getScore(),
                                                                                                                                player2.getPlayerName(), player2.getScore(),
                                                                                                                                numOfDrawRounds));
  //Compares the scores and prints the winner. 
  if(player1.getScore() > player2.getScore()) {
    System.out.println("The Winner is " + player1.getPlayerName());
  } else if (player1.getScore() < player2.getScore()) {
    System.out.println("The Winner is " + player2.getPlayerName());
  } else {
    System.out.println(String.format("It is a Draw!  %s's score is equal to %s's score.", player1.getPlayerName(), player2.getPlayerName()));
  }

 
  

  }

}