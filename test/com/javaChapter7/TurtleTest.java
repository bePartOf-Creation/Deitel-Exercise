package com.javaChapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
        Turtle turtle;
        Pen pen;
        SketchPadPosition sketchPadPosition = new SketchPadPosition(0,0);
    @BeforeEach
    void setUp() {
        pen = new Pen();
        turtle = new Turtle(pen);
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
    void test_ThatTurtleCanMoveEastWards_WhenPen_isUP(){
        SketchPad sketchBoard = new SketchPad();
        int numOfSteps = 5;
        turtle.setSketchPadPosition(sketchPadPosition);
        turtle.move(sketchBoard,numOfSteps);
        SketchPadPosition actual = turtle.getSketchPadPosition();
        assertEquals(new SketchPadPosition(0,5),actual);
}
@Test
    void testThat_TurtleCanMoveWestWards_WhenPen_isUP(){
        turtle.setCurrentDirection(Direction.WEST);
        SketchPad sketchBoard = new SketchPad();
        int numOfSteps = 5;
        turtle.setSketchPadPosition(new SketchPadPosition(0,12));
        turtle.move(sketchBoard,numOfSteps);
        SketchPadPosition actual = turtle.getSketchPadPosition();
        assertEquals(new SketchPadPosition(0,7),actual);
}
@Test
    void testTHat_turtleCanMoveNorthWards_WhenPEN_isUp(){
        turtle.setCurrentDirection(Direction.NORTH);
        SketchPad sketchBoard = new SketchPad();
        int numOfSteps= 5;
        turtle.setSketchPadPosition(new SketchPadPosition(12,0));
        turtle.move(sketchBoard,numOfSteps);
        SketchPadPosition actual = turtle.getSketchPadPosition();
        assertEquals(new SketchPadPosition(7,0),actual);
    }
@Test
    void testThat_turtleCanMoveSouthWards_WhenPEN_is_Up(){
        turtle.setCurrentDirection(Direction.SOUTH);
        SketchPad sketchBoard = new SketchPad();
        int numOfSteps = 5;
        turtle.setSketchPadPosition(new SketchPadPosition(10,0));
        turtle.move(sketchBoard,numOfSteps);
        SketchPadPosition actual = turtle.getSketchPadPosition();
        assertEquals(new SketchPadPosition(15,0),actual);
}
@Test
    void testThatTurtleCanMOveEastWards_WhenPEN_isDown(){
    SketchPad sketchBoard = new SketchPad();
    int numOfSteps = 5;
    turtle.setSketchPadPosition(sketchPadPosition);
    turtle.move(sketchBoard,numOfSteps);
    SketchPadPosition actual = turtle.getSketchPadPosition();
    assertEquals(new SketchPadPosition(0,5),actual);
    
}
}