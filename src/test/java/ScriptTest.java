import commands.CapitalizeTextCommand;
import commands.ReplaceTextCommand;
import commands.Script;
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
   * <p>Negative test that assures that the script does not execute a
   * sequence of commands on a text incorrectly.</p>
   */
  @Test
  void executeNegativeTest() {
    Script script = new Script();
    script.addCommand(new CapitalizeTextCommand());
    script.addCommand(new ReplaceTextCommand("World", "Java"));
    String textToBeModified = "Hello World";
    String expected = "hello World";
    String actual = script.execute(textToBeModified);
    assertNotEquals(expected, actual, "The execution output matches the expected result, failing the negative test.");
  }
}