package com.javaChapter7;

public class Turtle {
    private  Pen pen;
    private CurrentLocation currentLocation;
    private  Position currentPosition;

    public Turtle(Pen pen){
        this.pen = pen;
        this.currentLocation = currentLocation.EAST;
        this.currentPosition = currentPosition;
    }
    public Pen getPen() {
        return pen;
    }



    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void turnRight() {
        switch (currentLocation){
            case EAST  -> setCurrentDirection(CurrentLocation.SOUTH);
            case SOUTH -> setCurrentDirection(CurrentLocation.WEST); 
            case NORTH -> setCurrentDirection(CurrentLocation.EAST);
            case WEST  -> setCurrentDirection(CurrentLocation.NORTH);
        }
    }

    public void setCurrentDirection(CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setCurrentPosition(Position position) {
        currentPosition = position;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(SketchPad sketchPad, int numberOfSteps) {
        numberOfSteps -=1;
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        PenOrientation currentPenOrientation = getPen().getPenOrientation();
        switch (currentPenOrientation){
            case PEN_UP -> {
                switch (currentLocation){
                    case EAST  ->  currentPosition.setColumnPosition(currentColumn + numberOfSteps);
                    case SOUTH ->  currentPosition.setRowPosition(currentRow  + numberOfSteps);
                    case NORTH ->  currentPosition.setRowPosition(currentRow - numberOfSteps);
                }
            }
            case PEN_DOWN -> {
                switch (currentLocation){

                }
            }
        }

    }
}
