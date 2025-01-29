/**
 * <p>Represents a command that can be applied to a text by
 *   replacing the first occurrence of a target string with
 *   replacement string.</p>

 * @author Johannes Nupen Theigen
 * @version 0.0.2
 * @since 01.29.2025
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
    return text.replaceFirst(getTarget(), getReplacement());
  }
}