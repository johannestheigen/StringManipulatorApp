import commands.CapitalizeTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the CapitalizeTextCommandTest class to ensure that
 * the execute work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class CapitalizeTextCommandTest {

  /**
   * <p>Positive test that assures that a the first letter of
   * a text is properly capitalized</p>
   */
  @Test
  void executePositiveTest() {
  CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
  String textToBeCapitalized = "hello world";
  String expected = "Hello world";
  String actual = capitalizeTextCommand.execute(textToBeCapitalized);
  assertEquals(expected, actual, "The text did not match the expected output.");
  }

  /**
   * <p>Negative test that assures that an IllegalArgumentException is thrown
   * when the text is null or empty.</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
    assertThrows(IllegalArgumentException.class, () -> capitalizeTextCommand.execute(null));
    assertThrows(IllegalArgumentException.class, () -> capitalizeTextCommand.execute(""));
  }
}