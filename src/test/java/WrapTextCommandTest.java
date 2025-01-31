import commands.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Test class for the commands.WrapTextCommand class to ensure that
 * its methods execute, getOpening and getEnd work as expected.
 * It provides both positive and negative tests that follows the AAA
 * (Arrange, Act, Assert) pattern.</p>
 */
class WrapTextCommandTest {

  /**
   * <p>Positive test that assures that a text is properly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executePositiveTest()
  {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String input = "ello Worl";
    String result = command.execute(input);
    assertEquals("Hello World!", result);
  }

  /**
   * <p>Negative test that assures that a text is not incorrectly
   * wrapped with the opening and end strings.</p>
   */
  @Test
  void executeNegativeTest()
  {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String input = "ello Worl";
    String result = command.execute(input);
    assertNotEquals("HHello Worlddd!", result);
  }

  /**
   * <p>Positive test that assures that the opening string is correctly
   * retrieved from the wrap text command object.</p>
   */
  @Test
  void getOpeningPositiveTest()
  {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String opening = command.getOpening();
    assertEquals("H", opening);
  }

  /**
   * <p>Negative test that assures that the opening string is not incorrectly
   * retrieved from the wrap text command object.</p>
   */
  @Test
  void getOpeningNegativeTest()
  {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String opening = command.getOpening();
    assertNotEquals("HH", opening);
  }

  /**
   * <p>Positive test that assures that the end string is correctly
   * retrieved from the wrap text command object.</p>
   */
  @Test
  void getEndPositiveTest() {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String opening = command.getEnd();
    assertEquals("d!", opening);
  }

  /**
   * <p>Positive test that assures that the end string is correctly
   * retrieved from the wrap text command object.</p>
   */
  @Test
  void getEndNegativeTest() {
    WrapTextCommand command = new WrapTextCommand("H", "d!");
    String opening = command.getEnd();
    assertNotEquals("d!!", opening);
  }
}