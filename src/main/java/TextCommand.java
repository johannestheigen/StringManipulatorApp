/**
 * <p>Represents a command that can be applied to a text.</p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.29.2025
 */
public interface TextCommand {
  /**
   * <p>
   *   Executes a command that can be applied to a text.
   * </p>

   * @param text The text to apply the command to.
   */
  void execute(String text);
}