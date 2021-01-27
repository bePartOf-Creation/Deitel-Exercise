package com.javaChapter7;

public class Pen {

    private PenOrientation penOrientation;

    public Pen(){
        penOrientation = PenOrientation.PEN_UP;
    }

    public void setPenOrientation(PenOrientation penOrientation,CurrentLocation currentLocation){
        this.penOrientation = penOrientation;
    }
    public PenOrientation getPenOrientation() {
        return penOrientation;
    }


    public void setPenOrientation(PenOrientation penOrientation) {
        this.penOrientation = penOrientation;
    }
}
