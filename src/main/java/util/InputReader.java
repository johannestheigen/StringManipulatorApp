package util;

import java.util.Scanner;

/**
 * <p>Reads input from the console.</p>
 *
 * @author Johannes Nupen Theigen
 * @version 0.0.1
 * @since 02.01.2025
 */
public class InputReader {

  private final Scanner reader;

  /**
   * <p>Creates a new instance of the InputReader class.</p>
   */
  public InputReader() {
    this.reader = new Scanner(System.in);
  }

  /**
   * <p>Reads a line from the console.</p>
   *
   * @return The line read from the console
   */
  public String readLine() {
    return reader.nextLine();
  }

  /**
   * <p>Closes the input reader.</p>
   */
  public void exit() {
    reader.close();
  }
}