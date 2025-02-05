package commands;

/**
 * <p>Represents a command that can be applied to a text.
 * This command replaces a target string with a replacement string.</p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.4
 * @since 02.05.2025
 */
public class ReplaceTextCommand implements TextCommand {
  private final String target;
  private final String replacement;

  /**
   * <p>Creates a new commands.ReplaceTextCommand with the given target and replacement strings.</p>

   * @param target the string to replace
   * @param replacement the string that replaces the target
   */
  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * <p>Executes the command by replacing the target string with the replacement string.
   * If the target string is not found, the text is returned unchanged.</p>

   * @param text The text to apply the command to.
   * @return The text with the target string replaced by the replacement string.
   */
  public String execute(String text) {
    if (!text.contains(getTarget())) {
      throw new IllegalArgumentException("The target was not found in the text.");
    }
    return text.replace(getTarget(), getReplacement());
  }

  /**
   * <p>Retrieves the target String to be replaced.</p>

   * @return The targeted part of the string to place.
   */
  public String getTarget() {
    if (target == null) {
      throw new IllegalArgumentException("The target string cannot be null.");
    }
    if (target.isEmpty()) {
      throw new IllegalArgumentException("The target string cannot be empty.");
    }
    return target;
  }

  /**
   * <p>Retrieves the string that is to replace the target string.</p>

   * @return The string that replaces the target.
   */
  public String getReplacement() {
    if (replacement == null) {
      throw new IllegalArgumentException("The replacement string cannot be null.");
    }
    if (replacement.isEmpty()) {
      throw new IllegalArgumentException("The replacement string cannot be empty.");
    }
    return replacement;
  }
}