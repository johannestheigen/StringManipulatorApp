/**
 * <p>Represents a command that can be applied to a text.
 * This command wraps a text with an opening and end string.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.2
 * @since 01.30.2025
 */
public class WrapTextCommand implements TextCommand {

  private final String opening;
  private final String end;

  /**
   * <p>Creates a new WrapTextCommand with the given opening and end strings.</p>

   * @param opening The opening string.
   * @param end The end string.
   */
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  /**
   * <p>Wraps a text with opening and end strings.
   * For example, if the opening is "H" and the end is "d!", the text "ello Worl"
   * will be wrapped as "Hello World!".</p>

   * @param text The text to apply the command to.
   * @return The text wrapped with the opening and end strings.
   */
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be null or empty.");
    }
    return getOpening() + text + getEnd();
  }

  /**
   * <p>Returns the opening string.</p>

   * @return The opening string.
   */
  public String getOpening() {
    return opening;
  }

  /**
   * <p>Returns the end string.</p>

   * @return The end string.
   */
  public String getEnd() {
    return end;
  }
}