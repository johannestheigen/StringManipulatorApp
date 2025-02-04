package util;

/**
 * <p>Printer class that prints the menu and prompts for user input.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.2
 * @since 02.04.2025
 */
public class Printer {

  /**
   * <p>Prints the menu of the application.</p>
   */
  public void printMenu() {
    System.out.println("Welcome to the String Manipulator Application!");
    System.out.println("Please select one of the following options:");
    System.out.println("1. Wrap text");
    System.out.println("2. Wrap a selected part of the text");
    System.out.println("3. Wrap text line by line");
    System.out.println("4. Replace text");
    System.out.println("5. Replace the first occurrence of a text");
    System.out.println("6. Capitalize text");
    System.out.println("7. Capitalize words in text");
    System.out.println("8. Capitalize a selected part of the text");
    System.out.println("9. Run a sequence of commands");
    System.out.println("10. Clear text");
    System.out.println("0. Exit the application");
  }

  /**
   * <p>Prints a warning message before exiting the application.</p>
   */
  public void printExitWarning() {
    System.out.println("Are you sure you want to exit the application? (y/n)");
  }

  /**
   * <p>Prints an exit message when the application is closed.</p>
   */
  public void printExitMessage() {
    System.out.println("Exiting the application...");
  }

  /**
   * <p>Prints a message when the user enters invalid input.</p>
   */
  public void printInvalidInput() {
    System.out.println("Invalid input. Please try again.");
  }

  /**
   * <p>Prints a message if an error occurs.</p>

   * @param message The error message
   */
  public void printError(String message) {
    System.out.println("Error! " + message);
  }

  /**
   * <p>Prompts the user to enter the text they want to modify.</p>
   */
  public void promptForTextToModify() {
    System.out.println("Please enter the text you want to modify:");
  }

  /**
   * <p>Prompts the user for the opening tag they want to wrap the text with.</p>
   */
  public void promptForOpeningTag() {
    System.out.println("Please enter the opening tag you want to wrap the text with:");
  }

  /**
   * <p>Prompts the user for the closing tag they want to wrap the text with.</p>
   */
  public void promptForClosingTag() {
    System.out.println("Please enter the closing tag you want to wrap the text with:");
  }

  /**
   * <p>Prompts the user for the text they want to wrap.</p>
   */
  public void promptForTextToWrap() {
    System.out.println("Please enter the text you want to wrap:");
  }

  /**
   * <p>Prompts the user for the texts they want to wrap.</p>
   */
  public void promptForTextsToWrap() {
    System.out.println("Please enter the text you want to wrap. "
        + "Press Enter after each line. Press Enter again without typing anything to finish:");
  }

  /**
   * <p>Prompts the user for the text they want to replace.</p>
   */
  public void promptForTextToReplace() {
    System.out.println("Please enter the text you want to replace:");
  }

  /**
   * <p>Prompts the user for the text they want to replace it with.</p>
   */
  public void promptForTextToReplaceWith() {
    System.out.println("Please enter the text you want to replace it with:");
  }

  /**
   * <p>Prompts the user for the part of the text they want to capitalize.</p>
   */
  public void promptForPartOfTextToCapitalize() {
    System.out.println("Please enter the part of the text you want to capitalize:");
  }

  /**
   * <p>Prompts the user for the sequence of commands they want to run on the text.</p>
   */
  public void promptForSequenceOfCommands() {
    System.out.println("Please enter the sequence of "
        + "commands you want to run on the text (e.g., wrap replace capitalize):");
  }

  /**
   * <p>Prints a message when the text is empty.</p>

   * @param command The command that requires a text
   */
  public void invalidCommand(String command) {
    System.out.println("Invalid command: " + command);
  }

  public void printResult(String result) {
    System.out.println("Result: " + result);
  }

  /**
   * <p>Prompts the user to press any key to continue using the application.</p>
   */
  public void promptForAnyKeyToContinue() {
    System.out.println("Press any key to continue...");
  }

  /**
   * <p>Prints a message when the text is cleared.</p>
   */
  public void printTextCleared() {
    System.out.println("Successfully cleared the text.");
  }
}
