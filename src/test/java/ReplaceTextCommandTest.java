import static org.junit.jupiter.api.Assertions.*;

import commands.ReplaceTextCommand;
import org.junit.jupiter.api.*;

/**
 * <p>Test class for the commands.ReplaceTextCommand class to ensure that
 * its methods execute, getTarget and getReplacement work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class ReplaceTextCommandTest {

  /**
   * <p>Positive test that assures that the targeted part of a string
   * is correctly replaced by the replacement string.</p>
   */
  @Test
  void executePositiveTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String input = "This is a string with text to be replaced.";
    String result = command.execute(input);
    assertEquals("This is a string with replaced text.", result);
  }

  /**
   * <p>Negative test that ensures an IllegalArgumentException is thrown
   * when the target string is not found in the input.</p>
   */
  @Test
  void executeNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String input = "some random text";
    assertThrows(IllegalArgumentException.class, () -> command.execute(input));
  }

  /**
   * <p>Positive test that assures that the target string is correctly
   * retrieved from the replace text command object.</p>
   */
  @Test
  void getTargetPositiveTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String target = command.getTarget();
    assertEquals("text to be replaced", target);
  }

  /**
   * <p>Negative test that ensures an IllegalArgumentException is thrown
   * when an empty target string is provided.</p>
   */
  @Test
  void getTargetNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("", "text to be replaced");
    assertThrows(IllegalArgumentException.class, command::getTarget);
    ReplaceTextCommand command2 = new ReplaceTextCommand(null, "text to be replaced");
    assertThrows(IllegalArgumentException.class, command2::getTarget);
  }

  /**
   * <p>Positive test that assures that the replacement string is correctly
   * retrieved from the replace text command object.</p>
   */
  @Test
  void getReplacementPositiveTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String replacement = command.getReplacement();
    assertEquals("replaced text", replacement);
  }

  /**
   * <p>Negative test that ensures an IllegalArgumentException is thrown
   * when an empty replacement string is provided.</p>
   */
  @Test
  void getReplacementNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", null);
    assertThrows(IllegalArgumentException.class, command::getReplacement);
    ReplaceTextCommand command2 = new ReplaceTextCommand("text to be replaced", "");
    assertThrows(IllegalArgumentException.class, command2::getReplacement);
  }
}