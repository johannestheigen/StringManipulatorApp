import commands.CapitalizeWordsTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the commands.CapitalizeWordsTextCommand to ensure
 * that its method execute works as expected. It provides both
 * positive and negative tests that follows the AAA (Arrange,
 * Act, Assert) pattern.</p>
 */
class CapitalizeWordsTextCommandTest {

  /**
   * <p>Positive test that assures that the first letter of each word
   * in a string is capitalized.</p>
   */
  @Test
  void executePositiveTest() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
    String result = capitalizeWordsTextCommand.execute("hello world");
    String expected = "Hello World";
    assertEquals(expected, result, "The execution output does not match the expected result, failing the positive test.");
  }

  /**
   * <p>Negative test that checks if the method throws an IllegalArgumentException
   * when the input is null or empty.</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
    assertThrows(IllegalArgumentException.class, () -> capitalizeWordsTextCommand.execute(null), "The method does not throw an IllegalArgumentException when the input is null, failing the negative test.");
    assertThrows(IllegalArgumentException.class, () -> capitalizeWordsTextCommand.execute(""), "The method does not throw an IllegalArgumentException when the input is empty, failing the negative test.");
  }
}