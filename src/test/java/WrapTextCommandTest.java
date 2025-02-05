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
    WrapTextCommand command = new WrapTextCommand("#", "#");
    String input = "Hello World";
    String result = command.execute(input);
    assertEquals("#Hello World#", result);
  }

  /**
   * <p>Negative test that ensures an IllegalArgumentException is thrown
   * when the text string is null or empty.</p>
   */
  @Test
  void executeNegativeTest() {
    WrapTextCommand command = new WrapTextCommand("#", "#");
    String input = "";
    assertThrows(IllegalArgumentException.class, () -> command.execute(input));
    WrapTextCommand command2 = new WrapTextCommand("#", "#");
    assertThrows(IllegalArgumentException.class, () -> command2.execute(null));
  }

  /**
   * <p>Positive test that assures that the opening string is correctly
   * retrieved from the wrap text command object.</p>
   */
  @Test
  void getOpeningPositiveTest()
  {
    WrapTextCommand command = new WrapTextCommand("#", "#");
    String opening = command.getOpening();
    assertEquals("#", opening);
  }

  /**
   * <p>Negative test that assures that an IllegalArgumentException is thrown
   * when the opening string is null or empty.
   * </p>
   */
  @Test
  void getOpeningNegativeTest()
  {
    WrapTextCommand command = new WrapTextCommand("", "#");
    assertThrows(IllegalArgumentException.class, command::getOpening);
    WrapTextCommand command2 = new WrapTextCommand(null, "#");
    assertThrows(IllegalArgumentException.class, command2::getOpening);
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
   * <p>Negative test that assures that an IllegalArgumentException is thrown
   * when the end string is null or empty.</p>
   */
  @Test
  void getEndNegativeTest() {
    WrapTextCommand command = new WrapTextCommand("#", null);
    assertThrows(IllegalArgumentException.class, command::getEnd);
    WrapTextCommand command2 = new WrapTextCommand("#", "");
    assertThrows(IllegalArgumentException.class, command2::getEnd);
  }
}