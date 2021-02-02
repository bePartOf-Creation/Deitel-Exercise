package com.javaChapter7;

public class SketchPadPosition {
    private int noOfColumns;
    private int noOfRows;

    public SketchPadPosition(int noOfRows, int noOfColumns) {
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if(obj.getClass() == this.getClass()){
            SketchPadPosition comparedObject = (SketchPadPosition) obj;
            if(comparedObject.noOfColumns == this.noOfColumns && comparedObject.noOfRows == this.noOfRows){
                isEquals = true;
            }
        }
        return isEquals;
    }
}

