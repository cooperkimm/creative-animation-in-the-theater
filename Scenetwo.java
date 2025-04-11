import org.code.theater.*;
import java.util.ArrayList;
import org.code.media.*;

public class Scenetwo extends Scene{
  
   /**
   * Creates instance variables for positions and responsesUser, constructor, and toString method
   *
   * Precondition: Must use instance variables, constructor, and toString method
   * Postcondition: Output all the position names
   *
   * @param ArrayList<String> responsesUser
   * @return toString containing the position names
   */
  
  private ArrayList<String> Positions;
  private ArrayList<String> responsesUser;
  
  public Scenetwo(ArrayList<String> responsesUser){
    this.Positions = FileReader.toStringList("Positions.txt");
    this.responsesUser = responsesUser;
  }
  
  public String toString(){
    return "Positions: " + Positions;
  }

  /**
   * Sets the background to navy, creates a NFL catch image, customizes text, and outputs positions(user input)
   *
   * Precondition: Must use responsesUser and images to drawScene
   * Postcondition: draws scene of position name
   *
   * @param No parameters
   * @return second scene for the theater
   */
  
  public void drawScene(){
    clear("navy");
    drawImage("nfl-catch.jpg", 140, 75, 125);
    String positions = responsesUser.get(0);
    setTextHeight(30);
    setTextColor("white");
    drawText("Position: " + positions, 100, 300);
    pause(1);
  }
  
}
