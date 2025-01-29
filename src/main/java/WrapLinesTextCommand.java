/**
 * <p>Represents a command that can be applied to a text.
 * This command splits the text by line breaks (e.g., "\n")
 * and wraps each line individually with the specified opening and closing strings.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.29.2025
 */
public class WrapLinesTextCommand extends WrapTextCommand {

  /**
   * <p>Creates a new WrapLinesTextCommand with the given opening and end strings.</p>

   * @param opening The opening string.
   * @param end The end string.
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  /**
   * <p>Splits the text by line breaks (e.g., "\n")
   * and wraps each line individually with the specified opening and closing strings.</p>

   * @param text The text to apply the command to.
   * @return The text with each line wrapped with the opening and end strings.
   */
  public String execute(String text) {
    return getOpening() + text.replace("\n", getEnd() + " " + getOpening()) + getEnd();
  }
}