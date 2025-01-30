/**
 * <p>Represents a command that can be applied to a text.
 * This command wraps a selection of text with an opening and end string.</p>
 * </p>

 * @author Johannes Nupen Theigen
 * @version 0.0.3
 * @since 01.30.2025
 */
public class WrapSelectionTextCommand extends WrapTextCommand {

  /**
   * <p>Creates a new WrapSelectionTextCommand with the given opening and end strings.</p>
   *
   * @param opening The opening string.
   * @param end The end string.
   */
  public WrapSelectionTextCommand(String opening, String end) {
    super(opening, end);
  }

  /**
   * <p>This command wraps a selection of text with an opening and end string.</p>

   * @param text The text to apply the command to.
   * @param selection The part of the text to wrap
   * @return The text with the selection wrapped with the opening and end strings.
   */
  public String execute(String text, String selection) {
    if (!text.contains(selection)) {
      throw new IllegalArgumentException("The selection was not found in the text.");
    }
    return text.replace(selection, getOpening() + selection + getEnd());
  }
}