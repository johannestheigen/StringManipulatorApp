/**
 * <p>Represents a command that can be applied to a text
 * which capitalizes the first letter of a text.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.2
 * @since 01.30.2025
 */
public class CapitalizeTextCommand implements TextCommand {

  /**
   * <p>Capitalizes a the first letter of a text.</p>

   * @param text The text to apply the command to.
   * @return The text capitalized.
   */
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be null or empty.");
    }
    return text.replaceFirst(String.valueOf(text.charAt(0)), String.valueOf(text.charAt(0)).toUpperCase());
  }

  public static void main(String[] args) {
    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
    String textToBeCapitalized = "hello world";
    System.out.println(capitalizeTextCommand.execute(textToBeCapitalized));
  }
}
