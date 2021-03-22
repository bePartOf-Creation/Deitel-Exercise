package com.javaChapter8.TicTacToe;

import java.util.Arrays;

public class Board {

    private final BoardElements[][] cells;

    public Board(int cellNumber) {
        this.cells = new BoardElements[cellNumber][cellNumber];
//        for(int row = 0; row < cells.length; row++){
//            Arrays.fill(cells[row],BoardElements.EMPTY);
//        }
    }
    public BoardElements[][] getCells() {
        return cells;
    }
}