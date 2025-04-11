import org.code.theater.*;
import java.util.ArrayList;
import org.code.media.*;

public class myStory extends Scene{
  
 /**
   * Creates instance variables for teams and userResponses, constructor, and toString method
   *
   * Precondition: Must use instance variables, constructor, and toString method
   * Postcondition: Output all the team names
   *
   * @param ArrayList<String> userResponses
   * @return toString containing the team names
   */
  
  private ArrayList<String> Teams;
  private ArrayList<String> userResponses;
  
  public myStory(ArrayList<String> userResponses) {
    this.Teams = FileReader.toStringList("Teams.txt");
    this.userResponses = userResponses;
  }
  
   public String toString(){
    return "Teams: " + Teams;
  }
  
   /**
   * Sets the background to navy, creates a NFL logo image, customizes text, and outputs team(user input)
   *
   * Precondition: Must use userResponses and images to drawScene
   * Postcondition: draws scene of team name
   *
   * @param No parameters
   * @return Scene for the theater
   */
  
  public void drawScene(){
    clear("navy");
    drawImage("national-football-league.jpg", 140, 75, 125);
    String teams = userResponses.get(0);
    setTextHeight(30);
    setTextColor("white");
    drawText("Team: " + teams, 100, 300);
    pause(1);
  }

  
     
}
