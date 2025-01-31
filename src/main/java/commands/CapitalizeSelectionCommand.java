package commands;

/**
 * <p>Represents a command that can be applied to a text.
 * This command capitalizes a selection of text.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.31.2025
 */
public class CapitalizeSelectionCommand extends CapitalizeTextCommand {

  private final String selection;

  /**
   * <p>Creates a new instance of the commands.CapitalizeSelectionCommand.</p>

   * @param selection The selection to capitalize.
   */
  public CapitalizeSelectionCommand(String selection) {
    super();
    this.selection = selection;
  }

  /**
   * <p>Capitalizes a selection of text.</p>

   * @param text The text to apply the command to.
   * @return The text with the selection capitalized.
   */
  @Override
  public String execute(String text) {
    if (selection == null || selection.isEmpty()) {
      throw new IllegalArgumentException("Selection cannot be null or empty.");
    }
    return text.replace(selection, super.execute(selection));
  }
}