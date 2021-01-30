package com.javaChapter7;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = Direction.EAST; //Turtle's Default Direction is EAST
    }
    public Pen getPen() {
        return pen;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case EAST -> setCurrentDirection(Direction.SOUTH);
            case SOUTH -> setCurrentDirection(Direction.WEST);
            case WEST -> setCurrentDirection(Direction.NORTH);
            case NORTH -> setCurrentDirection(Direction.EAST);
        }
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> setCurrentDirection(Direction.NORTH);
            case NORTH -> setCurrentDirection(Direction.WEST);
            case WEST -> setCurrentDirection(Direction.SOUTH);
            case SOUTH -> setCurrentDirection(Direction.EAST);

        }
    }
}
