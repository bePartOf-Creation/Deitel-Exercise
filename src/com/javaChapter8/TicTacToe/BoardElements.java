package com.javaChapter8.TicTacToe;

public enum BoardElements {
    EMPTY,
    X,
    O;

    @Override
    public String toString() {
        String element = " ";
        switch(this){
            case EMPTY -> {
                element = "EMPTY";
            }
            case X -> {
                element = "X";
            }
            case O -> {
                element = "O";
            }
        }
        return element;
    }
}
