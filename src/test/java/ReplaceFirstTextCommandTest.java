import commands.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
   * <p>Negative test that ensures an IllegalArgumentException is thrown
   * when the text is null, empty or the target string is not found in the input.</p>
   */
  @Test
  void executeNegativeTest() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("old text", "new text");
    assertThrows(IllegalArgumentException.class, () -> command.execute(null), "Text cannot be null");
    assertThrows(IllegalArgumentException.class, () -> command.execute(""), "Text cannot be empty");
    String input = "some random text";
    assertThrows(IllegalArgumentException.class, () -> command.execute(input), "The target was not found in the text.");
  }
}