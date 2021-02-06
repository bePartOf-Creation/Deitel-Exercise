package com.javaChapter7;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private SketchPadPosition position;

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

    public void setSketchPadPosition(SketchPadPosition position) {
        this.position = position;
    }

    public void move(SketchPad sketchBoard, int numOfSteps) {
        switch (pen.getPenOrientation()){
            case PEN_UP -> {
                SketchPadPosition sketchPadPosition = getSketchPadPosition();
                int currentColumn = sketchPadPosition.getNoOfColumns();
                int currentRows = sketchPadPosition.getNoOfRows();

                switch (currentDirection){
                    case EAST -> {
                        sketchPadPosition.setNoOfColumns(currentColumn + numOfSteps);
                    }case WEST -> {
                        sketchPadPosition.setNoOfColumns(currentColumn - numOfSteps);
                    }case NORTH -> {
                        sketchPadPosition.setNoOfRows(currentRows - numOfSteps);
                    }case SOUTH -> {
                        sketchPadPosition.setNoOfRows(currentRows + numOfSteps);
                    }
                }
            }
            case PEN_DOWN -> {
                SketchPadPosition sketchPadPosition = getSketchPadPosition();
                int currentColumn = sketchPadPosition.getNoOfColumns();
                int currentRows = sketchPadPosition.getNoOfRows();
                int [][] floor = sketchBoard.getFloor();
                switch (currentDirection){
                    case EAST -> {
                        for(int column = currentColumn; column < numOfSteps; column++){
                            floor[currentRows][column] = 1;
                        }
                        sketchPadPosition.setNoOfColumns(numOfSteps);
                    }
                    case SOUTH -> {
                        for(int row = currentRows; row < numOfSteps; row++){
                            floor[row][currentColumn] = 1;
                        }
                        sketchPadPosition.setNoOfRows(numOfSteps);
                    }
                }
            }
        }

    }

    public SketchPadPosition getSketchPadPosition() {
        return position;
    }
}
