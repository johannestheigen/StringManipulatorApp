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
   * <p>Negative test that assures that the targeted part of a string
   * is not replaced by an incorrect replacement string.</p>
   */
  @Test
  void executeNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String input = "This is a string with text to be replaced.";
    String result = command.execute(input);
    assertNotEquals("This is a string with texxt to be replaced.", result);
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
   * <p>Negative test that assures that the target string is not incorrectly
   * retrieved from the replace text command object.</p>
   */
  @Test
  void getTargetNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String target = command.getTarget();
    assertNotEquals("texxt to be replaced", target);
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
   * <p>Negative test that assures that the replacement string is not incorrectly
   * retrieved from the replace text command object.</p>
   */
  @Test
  void getReplacementNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("text to be replaced", "replaced text");
    String replacement = command.getReplacement();
    assertNotEquals("replacedd text", replacement);
  }
}