package com.javaChapter7;

public enum CurrentLocation {
    EAST,WEST,NORTH,SOUTH;

    private CurrentLocation currentLocation;

    public void setCurrentLocation(CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }
}
