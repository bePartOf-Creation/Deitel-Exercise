package com.javaChapter7;

public class SketchPad {

    private final int[][] floor;

    public SketchPad(int numberOfRow, int numberOfColumn) {
        this.floor = new int[numberOfRow][numberOfColumn];
    }
    public int[][] getFloor() {
        return floor;
    }
}
