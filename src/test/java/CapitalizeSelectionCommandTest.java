import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the CapitalizeSelectionCommand class to ensure that
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
   * <p>Negative test that assures that the first letter of
   * a selected text is not incorrectly capitalized</p>
   */
  @Test
  void executeNegativeTest() {
    CapitalizeSelectionCommand capitalizeSelectionCommand = new CapitalizeSelectionCommand("hello");
    String input = "hello world";
    String result = capitalizeSelectionCommand.execute(input);
    String expectedOutput = "hEllo world";
    assertNotEquals(expectedOutput, result, "The execution output matches the expected result, failing the negative test.");
  }
}