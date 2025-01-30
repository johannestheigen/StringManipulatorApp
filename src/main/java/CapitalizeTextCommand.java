/**
 * <p>Represents a command that can be applied to a text
 * which capitalizes a text.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.30.2025
 */
public class CapitalizeTextCommand implements TextCommand {

  /**
   * <p>Capitalizes a text.</p>

   * @param text The text to apply the command to.
   * @return The text capitalized.
   */
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be null or empty.");
    }
    return text.toUpperCase();
  }
}
