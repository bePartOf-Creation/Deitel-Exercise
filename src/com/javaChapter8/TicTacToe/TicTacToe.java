package com.javaChapter8.TicTacToe;

public class TicTacToe {
    private final Board board;

    public TicTacToe(Board board) {
        this.board = new Board(3);
    }

    public Board getBoard() {
        return  board;
    }
}
