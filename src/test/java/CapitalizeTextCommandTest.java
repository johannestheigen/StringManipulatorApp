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
   * <p>Positive test that assures that a text is properly capitalized</p>
   */
  @Test
  void executePositiveTest() {
  CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
  String textToBeCapitalized = "hello world";
  String expected = "HELLO WORLD";
  String actual = capitalizeTextCommand.execute(textToBeCapitalized);
  assertEquals(expected, actual, "The text did not match the expected output.");
  }

  /**
   * <p>Negative test that assures that a text is not incorrectly capitalized</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
    String textToBeCapitalized = "hello world";
    String expected = "HeLLO WORLD";
    String actual = capitalizeTextCommand.execute(textToBeCapitalized);
    assertNotEquals(expected, actual, "The execution output matches the expected result, failing the negative test.");
  }
}