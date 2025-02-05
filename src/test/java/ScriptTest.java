import commands.CapitalizeTextCommand;
import commands.ReplaceTextCommand;
import commands.Script;
import commands.TextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the commands.Script to ensure that its method execute
 * works as expected. It provides both positive and negative tests
 * that follows the AAA (Arrange, Act, Assert) pattern.</p>
 */
class ScriptTest {

  /**
   * <p>Positive test that assures that the script executes a sequence
   * of commands on a text as expected.</p>
   */
  @Test
  void executePositiveTest() {
    Script script = new Script();
    script.addCommand(new CapitalizeTextCommand());
    script.addCommand(new ReplaceTextCommand("World", "Java"));
    String textToBeModified = "Hello World";
    String expected = "Hello Java";
    String actual = script.execute(textToBeModified);
    assertEquals(expected, actual, "The execution output does not match the expected result, failing the positive test.");
  }

  /**
   * <p>Negative test that assures that the script throws an IllegalArgumentException
   * when trying to execute a script on a text that is null or empty.</p>
   */
  @Test
  void executeNegativeTest() {
    Script script = new Script();
    script.addCommand(new CapitalizeTextCommand());
    script.addCommand(new ReplaceTextCommand("World", "Java"));
    assertThrows(IllegalArgumentException.class,
        () -> script.execute(null),
        "Executing a null text should throw IllegalArgumentException.");
    assertThrows(IllegalArgumentException.class,
        () -> script.execute(""),
        "Executing an empty text should throw IllegalArgumentException.");
  }

  /**
   *<p>Positive test that assures that a command is successfully added to the script.</p>
   */
  @Test
  void addCommandPositiveTest() {
    Script script = new Script();
    TextCommand command = new ReplaceTextCommand("old", "new");
    script.addCommand(command);
    assertEquals(1, script.getCommands().size());
    assertEquals(command, script.getCommands().getFirst());
  }

  /**
   * <p>Negative test that assures that the script throws an IllegalArgumentException
   * when trying to add a null command.</p>
   */
  @Test
  void addCommandNegativeTest() {
    Script script = new Script();
    assertThrows(IllegalArgumentException.class,
        () -> script.addCommand(null),
        "Adding a null command should throw IllegalArgumentException.");
  }
}