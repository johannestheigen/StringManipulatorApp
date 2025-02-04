package app;

import commands.CapitalizeSelectionCommand;
import commands.CapitalizeTextCommand;
import commands.CapitalizeWordsTextCommand;
import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;
import commands.WrapLinesTextCommand;
import commands.WrapSelectionTextCommand;
import commands.WrapTextCommand;
import util.InputReader;
import util.Printer;

/**
 * <p>
 * Represents the user interface of the String Manipulator Application.
 * </p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.4
 * @since 02.04.2025
 */
public class UserInterface {

  private String textToBeModified;
  private InputReader inputReader;
  private Printer printer;
  private boolean isInSequence;

  /**
   * <p>Initializes the user interface.</p>
   */
  public void init() {
    inputReader = new InputReader();
    printer = new Printer();
    isInSequence = false;
  }

  /**
   * <p>Starts the String Manipulator Application.</p>
   */
  public void start() {
    runApp();
  }

  /**
   * <p>Wraps the text with the specified opening and closing tags.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the opening and closing tags.
   * The text is wrapped with the specified tags and the result
   * is printed to the console.</p>
   */
  public void wrapTextCommand() {
    try {
      isTextEmpty();
      printer.promptForOpeningTag();
      String opening = inputReader.readLine();
      printer.promptForClosingTag();
      String closing = inputReader.readLine();
      WrapTextCommand wrapTextCommand = new WrapTextCommand(opening, closing);
      textToBeModified = wrapTextCommand.execute(textToBeModified);
      if (!isInSequence) {
        printer.printResult(textToBeModified);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Wraps the selected part of the text with the specified opening and closing tags.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the opening and closing tags.
   * The user is prompted to enter the text to wrap.
   * The selected part of the text is wrapped with the specified tags and the result
   * is printed to the console.</p>
   */
  public void wrapSelectionTextCommand() {
    try {
      isTextEmpty();
      printer.promptForOpeningTag();
      String opening = inputReader.readLine();
      printer.promptForClosingTag();
      String closing = inputReader.readLine();
      printer.promptForTextToWrap();
      String selection = inputReader.readLine();
      WrapSelectionTextCommand wrapSelectionTextCommand =
          new WrapSelectionTextCommand(opening, closing, selection);
      textToBeModified = wrapSelectionTextCommand.execute(textToBeModified);
      if (!isInSequence) {
        printer.printResult(textToBeModified);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Wraps the text line by line with the specified opening and closing tags.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the opening and closing tags.
   * The user is prompted to enter the text to wrap.
   * The text is wrapped line by line with the specified tags and the result
   * is printed to the console.</p>
   */
  public void wrapLinesCommand() {
    try {
      isTextEmpty();
      printer.promptForOpeningTag();
      final String opening = inputReader.readLine();
      printer.promptForClosingTag();
      String closing = inputReader.readLine();
      printer.promptForTextsToWrap();
      StringBuilder textBuilder = new StringBuilder();
      String line;
      while (!(line = inputReader.readLine()).isEmpty()) {
        textBuilder.append(line).append(System.lineSeparator());
      }
      WrapLinesTextCommand wrapLinesTextCommand = new WrapLinesTextCommand(opening, closing);
      String result = wrapLinesTextCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Replaces the specified text with the specified text.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the text to replace.
   * The user is prompted to enter the text to replace it with.
   * The text is replaced with the specified text and the result
   * is printed to the console.</p>
   */
  public void replaceTextCommand() {
    try {
      isTextEmpty();
      printer.promptForTextToReplace();
      String textToReplace = inputReader.readLine();
      printer.promptForTextToReplaceWith();
      String textToReplaceWith = inputReader.readLine();
      ReplaceTextCommand replaceTextCommand =
          new ReplaceTextCommand(textToReplace, textToReplaceWith);
      String result = replaceTextCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Replaces the first occurrence of the specified text with the specified text.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the text to replace.
   * The user is prompted to enter the text to replace it with.
   * The first occurrence of the specified text is replaced with the specified text and the result
   * is printed to the console.</p>
   */
  public void replaceFirstTextCommand() {
    try {
      isTextEmpty();
      printer.promptForTextToReplace();
      String textToReplace = inputReader.readLine();
      printer.promptForTextToReplaceWith();
      String textToReplaceWith = inputReader.readLine();
      ReplaceFirstTextCommand replaceFirstTextCommand =
          new ReplaceFirstTextCommand(textToReplace, textToReplaceWith);
      String result = replaceFirstTextCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Capitalizes the text.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The text is capitalized and the result is printed to the console.</p>
   */
  public void capitalizeTextCommand() {
    try {
      isTextEmpty();
      CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
      String result = capitalizeTextCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printInvalidInput();
    }
  }

  /**
   * <p>Capitalizes the words in the text.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The words in the text are capitalized and the result is printed to the console.</p>
   */
  public void capitalizeWordsTextCommand() {
    try {
      isTextEmpty();
      CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
      String result = capitalizeWordsTextCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Capitalizes the selected part of the text.</p>
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter the part of the text to capitalize.
   * The selected part of the text is capitalized and the result is printed to the console.</p>
   */
  public void capitalizeSelectionCommand() {
    try {
      isTextEmpty();
      printer.promptForPartOfTextToCapitalize();
      String selection = inputReader.readLine();
      CapitalizeSelectionCommand capitalizeSelectionCommand =
          new CapitalizeSelectionCommand(selection);
      String result = capitalizeSelectionCommand.execute(textToBeModified);
      textToBeModified = result;
      if (!isInSequence) {
        printer.printResult(result);
        pressAnyKeyToContinue();
      }
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Runs a sequence of commands on the text.
   * If the text is empty, the user is prompted to enter a text.
   * The user is prompted to enter a sequence of commands.
   * Each command is executed on the text and the result is printed to the console.
   * The user must enter the command numbers found in the menu
   * separated by a space (e.g., 1 2 3 4 5 6 7 8).</p>
   */
  public void runSequenceOfCommands() {
    try {
      isTextEmpty();
      isInSequence = true;
      printer.promptForSequenceOfCommands();
      for (String command : inputReader.readLine().split(" ")) {
        switch (command) {
          case "1" -> wrapTextCommand();
          case "2" -> wrapSelectionTextCommand();
          case "3" -> wrapLinesCommand();
          case "4" -> replaceTextCommand();
          case "5" -> replaceFirstTextCommand();
          case "6" -> capitalizeTextCommand();
          case "7" -> capitalizeWordsTextCommand();
          case "8" -> capitalizeSelectionCommand();
          default -> printer.invalidCommand(command);
        }
      }
      textToBeModified = textToBeModified.strip();
      System.out.println(textToBeModified);
      pressAnyKeyToContinue();
    } catch (Exception e) {
      printer.printError(e.getMessage());
    }
  }

  /**
   * <p>Prompts the user to press any key to continue using the application.</p>
   */
  public void pressAnyKeyToContinue() {
    printer.promptForAnyKeyToContinue();
    inputReader.readLine();
    printer.printMenu();
  }

  /**
   * <p>Checks if the text is empty.
   * If the text is empty, the user is prompted to enter a text.</p>
   *
   * @return True if the text is empty, false otherwise
   */
  public boolean isTextEmpty() {
    if (textToBeModified == null || textToBeModified.isEmpty()) {
      printer.promptForTextToModify();
      textToBeModified = inputReader.readLine();
      return true;
    }
    return false;
  }

  /**
   * <p>Clears the text to be modified.</p>
   */
  public void clearText() {
    textToBeModified = null;
    printer.printTextCleared();
    pressAnyKeyToContinue();
  }

  /**
   * <p>Runs the String Manipulator Application.
   * The user is presented with a menu of options.
   * The user can select an option by entering the corresponding number.
   * The user can exit the application by entering 0.</p>
   */
  public void runApp() {
    try {
      init();
      printer.printMenu();
      boolean running = true;
      while (running) {
        String userInput = inputReader.readLine();
        switch (userInput) {
          case "0" -> {
            printer.printExitWarning();
            String exitInput = inputReader.readLine();
            if (exitInput.equals("y")) {
              printer.printExitMessage();
              running = false;
            }
          }
          case "1" -> wrapTextCommand();
          case "2" -> wrapSelectionTextCommand();
          case "3" -> wrapLinesCommand();
          case "4" -> replaceTextCommand();
          case "5" -> replaceFirstTextCommand();
          case "6" -> capitalizeTextCommand();
          case "7" -> capitalizeWordsTextCommand();
          case "8" -> capitalizeSelectionCommand();
          case "9" -> runSequenceOfCommands();
          case "10" -> clearText();
          default -> {
            printer.printInvalidInput();
            pressAnyKeyToContinue();
          }
        }
      }
      inputReader.exit();
    } catch (Exception e) {
      printer.printError(e.getMessage());
      pressAnyKeyToContinue();
    }
  }
}