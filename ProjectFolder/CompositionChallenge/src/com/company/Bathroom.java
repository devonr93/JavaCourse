package com.company;

public class Bathroom {
    private Dimensions dimensions;
    private String floor;
    private String wallColor;

    public Bathroom(Dimensions dimensions, String floor, String wallColor) {
        this.dimensions = dimensions;
        this.floor = floor;
        this.wallColor = wallColor;
    }

    public void exhaustFan() {
        System.out.println("The bathroom exhaust fan starts to run.");
    }

    public void takeShower() {
        System.out.println("You run the shower and get in.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getFloor() {
        return floor;
    }

    public String getWallColor() {
        return wallColor;
    }
}
