package org.java.week_5.chess;

import org.java.week_7.Exceptions;

public class IllegalMoveException extends GameException {
    public IllegalMoveException(String from, String to, Exception cause) {
        super("the move from " + from + " to " + to + " is illegal: ", cause);
    }
}



