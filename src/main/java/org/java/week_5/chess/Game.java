package org.java.week_5.chess;

public class Game {
    private Piece[][] board;

    Game() {
        this.board = new Piece[8][8];
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                this.board[i][j] = new Pawn(i,j,"white");
            }

        }
    }

    void printBoard() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.print(board[i][j].name() + " ");
            }
            System.out.println();
        }
    }
}
