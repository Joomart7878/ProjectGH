package org.java.week_7;

public class GenderMismatchException extends Exception {
  public GenderMismatchException() {
    super("Only males are allowed!");
  }
}
