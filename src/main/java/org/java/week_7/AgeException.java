package org.java.week_7;

public class AgeException extends Exceptions{
  public int age;
  public AgeException(int age) {
    super("User must be at least 18 to continue; the given user was " + age);
    this.age = age;
  }
}

