package app;

import java.util.Scanner;

/**
 * <p>
 *   Represents the user interface of the String Manipulator Application.
 *   Currently in a very early stage of development.
 * </p>

 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.31.2025
 */
public class UserInterface {

  /**
   * <p>Runs the String Manipulator Application.</p>
   */
  public void runApp() {
    System.out.println("Welcome to String Manipulator Application!");
    Scanner reader = new Scanner(System.in);
    String userInput = reader.nextLine();
    if (userInput.equals("0")) {
      System.out.println("Thank you for using the String Manipulator Application!");
      reader.close();
    } else {
      System.out.println("Invalid input. Please try again.");
      runApp();
    }
  }

  /**
   * <p>Runs the String Manipulator Application.</p>

   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    UserInterface userInterface = new UserInterface();
    userInterface.runApp();
  }
}
