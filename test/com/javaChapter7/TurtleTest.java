package com.javaChapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Pen turtlePen;
    Turtle turtle;
    SketchPad sketchPad = new SketchPad(20,20);
    @BeforeEach
    void setUp() {
        turtlePen = new Pen();
        turtle = new Turtle(turtlePen);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void turtle_hasAPen(){
        assertNotNull(turtle.getPen());
    }
    @Test
    void turtlePen_canBeSetToDown(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(PenOrientation.PEN_DOWN,turtle.getPen().getPenOrientation());
    }
    @Test
    void turtlePen_canBeSetToUP(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(PenOrientation.PEN_UP,turtle.getPen().getPenOrientation());
    }
    @Test
    void turtle_canHaveCurrentLocation(){
        turtle.setCurrentLocation(CurrentLocation.EAST);
        assertEquals(CurrentLocation.EAST,turtle.getCurrentLocation());
    }
    @Test
    void testThatTurtle_canTurnRight(){
        turtle.setCurrentLocation(CurrentLocation.EAST);
        turtle.turnRight();
        assertEquals(CurrentLocation.SOUTH,turtle.getCurrentLocation());
    }

    @Test
    void turtle_canMoveEastWards_onASketchPad_whilePenIsUP() {
        turtle.setCurrentDirection(CurrentLocation.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);

        turtle.setCurrentPosition(new Position(0, 0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
        turtle.move(sketchPad, 2);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }
    @Test
    void turtle_canMoveSouthWards_onASketchPad_whilePenIsUP(){
        turtle.setCurrentDirection(CurrentLocation.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
        turtle.move(sketchPad, 2);
        assertEquals(new Position(5,0),turtle.getCurrentPosition());
    }
    @Test
    void turtle_canMoveWestWards_onASketchPad_whilePenIsUP(){
        turtle.setCurrentDirection(CurrentLocation.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(0,7));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(0,3),turtle.getCurrentPosition());
        turtle.move(sketchPad, 2);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
    }
    @Test
    void turtle_canMoveNorthWards_onASketchPad_whilePenIsUP(){
        turtle.setCurrentDirection(CurrentLocation.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        turtle.setCurrentPosition(new Position(7,0));
        turtle.move(sketchPad, 5);
        assertEquals(new Position(3,0), turtle.getCurrentPosition());
        turtle.move(sketchPad, 2);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }
    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast(){
        turtle.setCurrentDirection(CurrentLocation.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        turtle.setCurrentPosition(new Position(0, 0));
        int numberOfSteps = 5;
        turtle.move(sketchPad, 5);
        for(int column = 0; column < numberOfSteps; column++){
//            assertEquals(1,sketchPad.getFloor()[0][column]);
        }

        Position position = new Position(2,0);
        System.out.println(position.equals(turtle));
    }
}
