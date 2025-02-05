import commands.CapitalizeSelectionCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the commands.CapitalizeSelectionCommand class to ensure that
 * the execute work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class CapitalizeSelectionCommandTest {

  /**
   * <p>Positive test that assures that a the first letter of
   * a selected text is properly capitalized</p>
   */
  @Test
  void executePositiveTest() {
    CapitalizeSelectionCommand capitalizeSelectionCommand = new CapitalizeSelectionCommand("hello");
    String input = "hello world";
    String result = capitalizeSelectionCommand.execute(input);
    String expectedOutput = "Hello world";
    assertEquals(expectedOutput, result, "The text did not match the expected output.");
  }

  /**
   * <p>Negative test that assures that an IllegalArgumentException is thrown
   * when the selection is null or empty, and when the text is null or empty.</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeSelectionCommand capitalizeSelectionCommand = new CapitalizeSelectionCommand(null);
    String text1 = "hello world";
    assertThrows(IllegalArgumentException.class, () -> capitalizeSelectionCommand.execute(text1));
    CapitalizeSelectionCommand capitalizeSelectionCommand2 = new CapitalizeSelectionCommand("");
    String text2 = "hello world";
    assertThrows(IllegalArgumentException.class, () -> capitalizeSelectionCommand2.execute(text2));
    assertThrows(IllegalArgumentException.class, () -> capitalizeSelectionCommand.execute(null));
    assertThrows(IllegalArgumentException.class, () -> capitalizeSelectionCommand.execute(" "));
  }
}