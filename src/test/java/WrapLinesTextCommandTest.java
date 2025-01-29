import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the WrapLinesTextCommandTest class to ensure that
 * its method execute work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class WrapLinesTextCommandTest {

  /**
   * <p>Positive test that assures that a text is properly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executePositiveTest() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String input = "First line\nSecond line";
    String result = command.execute(input);

    assertEquals("<p>First line</p> <p>Second line</p>", result);
  }

  /**
   * <p>Negative test that assures that a text is not incorrectly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executeNegativeTest()
  {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String input = "First line\nSecond line";
    String result = command.execute(input);
    assertNotEquals("<p>FirstLine</p> <p>SecondLine</p>", result);
  }
}