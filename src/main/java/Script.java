import java.util.ArrayList;
import java.util.List;

/**
 * <p>The script class is able to execute a
 * sequence of commands on a text.</p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 01.31.2025
 */
public class Script {

  private final List<TextCommand> commands;

  /**
   * <p>Creates a new instance of the script class.
   * that can be used to execute a sequence of commands on a text.</p>
   *
   */
  public Script() {
    commands = new ArrayList<>();
  }

  /**
   * <p>Executes a sequence of commands on the text.</p>
   *
   * @param text The text to execute the commands on
   * @return The text after the commands have been
   */
  public String execute(String text) {
    String result = text;
    for (TextCommand command : commands) {
      result = command.execute(result);
    }
    return result;
  }

  /**
   * <p>Adds a command to the script.</p>

   * @param command The command to add
   */
  public void addCommand(TextCommand command) {
    if (command == null) {
      throw new IllegalArgumentException("Command cannot be null");
    }
    commands.add(command);
  }
}