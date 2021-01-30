package com.javaChapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
        Turtle turtle;
        Pen pen;
    @BeforeEach
    void setUp() {
        pen = new Pen();
    }

    @AfterEach
    void tearDown() {
    }
@Test
    void test_ThatTurtleHasAPen(){
        turtle = new Turtle(pen);
        assertNotNull(turtle.getPen());
}
@Test
    void test_ThatTurtlePen_isUP(){
        turtle = new Turtle(pen);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        PenOrientation actual = turtle.getPen().getPenOrientation();
        assertEquals(PenOrientation.PEN_UP,actual);
}
@Test
    void test_ThatTurtlePen_isDOwn(){
        turtle = new Turtle(pen);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        PenOrientation actual = turtle.getPen().getPenOrientation();
        assertEquals(PenOrientation.PEN_DOWN,actual);
}
@Test
    void test_ThatTurtleHasADefault_CurrentDirectionEAST(){
        turtle = new Turtle(pen);
        turtle.setCurrentDirection(Direction.EAST);
        Direction actual = turtle.getCurrentDirection();
        assertEquals(Direction.EAST, actual);

        turtle.setCurrentDirection(Direction.WEST);
        actual = turtle.getCurrentDirection();
        assertNotEquals(Direction.EAST, actual);
}
@Test
    void test_ThatTurtleCan_TurnRight(){
        turtle = new Turtle(pen);
        turtle.setCurrentDirection(Direction.EAST);
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.SOUTH);
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.WEST);
        turtle.turnRight();
        assertEquals(Direction.NORTH,turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.NORTH);
        turtle.turnRight();
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
}
@Test
    void test_ThatTurtleCan_TurnLeft(){
        turtle = new Turtle(pen);
        turtle.setCurrentDirection(Direction.EAST);
        turtle.turnLeft();
        assertEquals(Direction.NORTH,turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.NORTH);
        turtle.turnLeft();
        assertEquals(Direction.WEST,turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.WEST);
        turtle.turnLeft();
        assertEquals(Direction.SOUTH,turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.SOUTH);
        turtle.turnLeft();
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
}

@Test
    void test_ThatTurtleCanMoveEastWards(){
        turtle = new Turtle(pen);



}
}