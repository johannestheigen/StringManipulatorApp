package commands;

/**
 * <p>Represents a command that can be applied to a text by
 *   replacing the first occurrence of a target string with
 *   replacement string.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.3
 * @since 01.30.2025
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  /**
   * <p>Replaces the first occurrence of the target
   * string with the replacement string.</p>

   * @param target The string to replace
   * @param replacement The string that replaces the target
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  /**
   * <p>Executes the command by replacing the first occurrence
   * of the target string with the replacement string.</p>

   * @param text The text to apply the command to.
   * @return The text with the first occurrence of the target
   */
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("The text cannot be null.");
    }
    if (text.isEmpty()) {
      throw new IllegalArgumentException("The text cannot be empty.");
    }
    if (!text.contains(getTarget())) {
      throw new IllegalArgumentException("The target was not found in the text.");
    }
    return text.replaceFirst(getTarget(), getReplacement());
  }
}