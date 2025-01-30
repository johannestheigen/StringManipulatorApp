import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the WrapSelectionTextCommand class to ensure that
 * the execute work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class WrapSelectionTextCommandTest {

  /**
   * <p>Positive test that assures that a selection of text is properly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executePositiveTest() {
    WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("<p>", "</p>");
    String text = "Hello World!";
    String selection = "World";
    String result = wrapSelectionTextCommand.execute(text, selection);
    String expected = "Hello <p>World</p>!";
    assertEquals(expected, result, "The wrapped text did not match the expected output.");
  }

  /**
   * <p>Negative test that assures that a selection of text is not incorrectly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executeNegativeTest() {
    WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("<p>", "</p>");
    String text = "Hello World!";
    String selection = "World";
    String result = wrapSelectionTextCommand.execute(text, selection);
    String expected = "Hello W<p>orld</p>!";
    assertNotEquals(expected, result, "The execution output matches the expected result, failing the negative test.");
  }
}