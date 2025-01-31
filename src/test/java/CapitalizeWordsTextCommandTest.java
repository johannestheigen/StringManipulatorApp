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
   * <p>Negative test that assures that the first letter of each word
   * in a string is not incorrectly capitalized.</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
    String result = capitalizeWordsTextCommand.execute("hello world");
    String expected = "hEllo woRld";
    assertNotEquals(expected, result, "The execution output matches the expected result, failing the negative test.");
  }
}