package com.javaChapter8.TicTacToe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    Board board;
    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe(board);
    }

    @AfterEach
    void tearDown() {
    }
@Test
    void testThatTicTacToeHasABoard(){
        ticTacToe = new TicTacToe(board);
        assertNotNull(ticTacToe.getBoard());
}
@Test
    void testThatBoardHasA3By3Array(){
        board = new Board(3);
        assertNotNull(board.getCells());
}
@Test
    void testThatBoardHasBeenToEmptyAtCreation(){
        board = new Board(3);
}

}