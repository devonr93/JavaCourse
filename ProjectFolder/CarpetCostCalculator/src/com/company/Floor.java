package com.company;

public class Floor {
    private double width;
    private double length;

    public double getArea() {
        if(width < 0.0) {
            return 0.0;
        }
        if(length < 0.0) {
            return 0.0;
        }
        return width * length;
    }

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
