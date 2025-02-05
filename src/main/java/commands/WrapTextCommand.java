package commands;

/**
 * <p>Represents a command that can be applied to a text.
 * This command wraps a text with an opening and end string.</p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.3
 * @since 02.05.2025
 */
public class WrapTextCommand implements TextCommand {

  private final String opening;
  private final String end;

  /**
   * <p>Creates a new commands.WrapTextCommand with the given opening and end strings.</p>
   *
   * @param opening The opening string.
   * @param end     The end string.
   */
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  /**
   * <p>Wraps a text with opening and end strings.
   * For example, if the opening is "H" and the end is "d!", the text "ello Worl"
   * will be wrapped as "Hello World!".</p>
   *
   * @param text The text to apply the command to.
   * @return The text wrapped with the opening and end strings.
   */
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Text cannot be null.");
    }
    if (text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be empty.");
    }
    return getOpening() + text + getEnd();
  }

  /**
   * <p>Returns the opening string.</p>
   *
   * @return The opening string.
   */
  public String getOpening() {
    if (opening == null) {
      throw new IllegalArgumentException("Opening string cannot be null.");
    }
    if (opening.isEmpty()) {
      throw new IllegalArgumentException("Opening string cannot be empty.");
    }
    return opening;
  }

  /**
   * <p>Returns the end string.</p>
   *
   * @return The end string.
   */
  public String getEnd() {
    if (end == null) {
      throw new IllegalArgumentException("End string cannot be null.");
    }
    if (end.isEmpty()) {
      throw new IllegalArgumentException("End string cannot be empty.");
    }
    return end;
  }
}