package com.company;

public class Bedroom {
    private Dimensions dimensions;
    private String floor;
    private String wallColor;

    public Bedroom(Dimensions dimensions, String floor, String wallColor) {
        this.dimensions = dimensions;
        this.floor = floor;
        this.wallColor = wallColor;
    }

    public void cleanBedroom() {
        System.out.println("You clean your room because it's so messy!");
    }

    public void openWindows() {
        System.out.println("You open your bedroom windows");
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
