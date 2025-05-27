package org.java.week_5.chess;

import org.java.week_7.Exceptions;

public class IllegalPositionException extends GameException {
    public IllegalPositionException(String position) {
        super(position + " is illegal!");
    }
}