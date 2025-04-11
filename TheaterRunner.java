import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TheaterRunner {
  public static void main(String[] args) {
    
  /**
   * Allows for scanner input, creates two array list objects(userResponses, responsesUser)
   *
   * Precondition: Create two arrayLists
   * Postcondition: user input 
   *
   * @param No parameters
   * @return Overall component
   */
    
    Scanner input = new Scanner(System.in);
    ArrayList<String> userResponses = new ArrayList<String>();
    ArrayList<String> responsesUser = new ArrayList<String>();
    
    /**
   * Creates instance of myStory, prints out question, toString, user input for teamName, and returns userResponse
   *
   * Precondition: Must be user input
   * Postcondition: Output teamName/user input
   *
   * @param userResponses
   * @return teamName that user inputs
   */
    
    myStory myScene = new myStory(userResponses);
    System.out.println("What team would you like to use?");
    System.out.println(myScene);
    String teamName = input.nextLine();
    userResponses.add(teamName);
    System.out.println("Your team: " + userResponses);

    /**
   * Creates instance of Scenetwo, prints out question, toString, user input for positionName, and returns responsesUser
   *
   * Precondition: Must be user input
   * Postcondition: Output positionName/user input
   *
   * @param responsesUser
   * @return positionName that user inputs
   */
    
    Scenetwo sceneTwo = new Scenetwo(responsesUser);
    System.out.println("Type in a NFL player's position that you would like to add to your roster.");
    System.out.println(sceneTwo);
    String positionName = input.nextLine();
    responsesUser.add(positionName);
    System.out.println("Your position: " + positionName);

  /**
   * Creates instance of Scenethree and draws myScene, sceneTwo, and sceneThree
   *
   * Precondition: Draws scenes
   * Postcondition: displays scenes on the theater
   *
   * @param No parameters
   * @return myScene, sceneTwo, and sceneThree
   */
    
    Scenethree sceneThree = new Scenethree();
    
    myScene.drawScene();
    sceneTwo.drawScene();
    sceneThree.drawScene();
    Theater.playScenes(myScene, sceneTwo, sceneThree);
  }
}
