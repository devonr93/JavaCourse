package com.company;

public class Kitchen {
    private Dimensions dimensions;
    private String floor;
    private String wallColor;

    public Kitchen(Dimensions dimensions, String floor, String wallColor) {
        this.dimensions = dimensions;
        this.floor = floor;
        this.wallColor = wallColor;
    }

    public void useSink() {
        System.out.println("You turn on the faucet and water begins to flow.");
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
