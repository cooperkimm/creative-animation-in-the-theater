import org.code.theater.*;
import java.util.ArrayList;
import org.code.media.*;
import java.util.Random;

public class Scenethree extends Scene{
  
   /**
   * Creates instance variables for players and creates constructor
   *
   * Precondition: Must use instance variable and constructor
   * Postcondition: Create a constructor for Players ArrayList
   *
   * @param no parameter
   * @return Players ArrayList
   */
  
  private ArrayList<String> Players;

  public Scenethree(){
    Players = FileReader.toStringList("Players.txt");
  }

  /**
   * Sets the background to navy, customizes text, and iterates through players ArrayList to output random player
   *
   * Precondition: Must use iteration and images to drawScene
   * Postcondition: draws scene of players name and plays sound
   *
   * @param No parameters
   * @return third scene for the theater
   */

  public void drawScene(){
    clear("navy");
    setTextHeight(22);
    setTextColor("white");
    for(int i = 0; i < Players.size(); i++){
      int randomIndex = new Random().nextInt(Players.size());
      String playerRandom = Players.get(randomIndex);
      drawText("Random Player: " + playerRandom, 20, 200);
      break;
    }
    playSound("trumpet_x.wav");
  }

 
  
     
}
