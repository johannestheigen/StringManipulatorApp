package commands;

/**
 * <p>
 *   Represents a command that can be applied to a text
 *   which capitalizes the first letter of each word in a text.
 * </p>
 *
 * @author Johannes
 * @version 0.0.1
 * @since 01.31.2025
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  /**
   * <p>Creates a new instance of the commands.CapitalizeWordsTextCommand.</p>
   */
  public CapitalizeWordsTextCommand() {
    super();
  }

  /**
   * <p>Capitalizes the first letter of each word in a text.</p>

   * @param text The text to apply the command to.
   * @return The text with the first letter of each word capitalized.
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be null or empty.");
    }
    for (String word : text.split(" ")) {
      text = text.replace(word, super.execute(word));
    }
    return text;
  }
}
