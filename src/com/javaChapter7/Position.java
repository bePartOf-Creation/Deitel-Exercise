package com.javaChapter7;

import java.util.Objects;

public class Position {
    private int rowPosition;
    private int columnPosition;


    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if (obj.getClass() == this.getClass()) {
            Position comparedObject = (Position) obj;//Casting odj to Position & assigned it to variable comparedObject of type Position
            boolean isSameCoordinate = comparedObject.getColumnPosition() == this.getColumnPosition() && comparedObject.getRowPosition() == this.getRowPosition();
    //comparing the equality between the CASTED obj(args) and the object of Position. By comparing
    //casted obj getColumnPosition to Position.getColumnPosition.
    //casted obj getRowPosition to Position.getRowPosition.
            if (isSameCoordinate) {
                isEquals = true;
            }
        }
        return isEquals;


    }

}