import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * <p>Test class for the  commands.ReplaceFirstTextCommand class to ensure
 * that its method execute works as expected. It provides both
 * positive and negative tests that follows the AAA (Arrange,
 * Act, Assert) pattern.</p>
 */
class ReplaceFirstTextCommandTest {

  /**
   * <p>Positive test that assures that the first occurrence of
   * the targeted part of a string is correctly replaced by the
   * replacement string.</p>
   */
  @Test
  void executePositiveTest() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("old text", "new text");
    String input = "This is the old text with the old text.";
    String result = command.execute(input);
    assertEquals("This is the new text with the old text.", result);
  }

  /**
   * <p>Negative test that assures that the first occurrence of
   * the targeted part of a string is not incorrectly replaced by the
   * replacement string.</p>
   */
  @Test
  void executeNegativeTest() {
    ReplaceTextCommand command = new ReplaceTextCommand("old text", "new text");
    String input = "This is the old text with the old text.";
    String result = command.execute(input);
    assertNotEquals("This is the neww text with the old text.", result);
  }
}