package commands;

/**
 * <p>Represents a command that can be applied to a text.
 * This command wraps a selection of text with an opening and end string.</p>
 * </p>

 * @author Johannes Nupen Theigen
 * @version 0.0.4
 * @since 02.05.2025
 */
public class WrapSelectionTextCommand extends WrapTextCommand {

  private final String selection;

  /**
   * <p>Creates a new commands.WrapSelectionTextCommand with the given opening and end strings.</p>
   *
   * @param opening The opening string.
   * @param end The end string.
   * @param selection The selection to wrap.
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  /**
   * <p>This command wraps a selection of text with an opening and end string.</p>

   * @param text The text to apply the command to.
   * @return The text with the selection wrapped with the opening and end strings.
   */
  @Override
  public String execute(String text) {
    if (selection == null) {
      throw new IllegalArgumentException("Text cannot be null");
    }
    if (selection.isEmpty()) {
      throw new IllegalArgumentException("Selection cannot be empty");
    }
    return text.replaceFirst(selection, getOpening() + selection + getEnd());
  }
}