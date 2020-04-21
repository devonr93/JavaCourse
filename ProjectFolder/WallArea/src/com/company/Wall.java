package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = width * height;
        if(area < 0) {
            area = 0;
        }
        return area;
    }

    public double getWidth() {
        if(width < 0) {
            this.width = 0;
        }
        return width;
    }

    public double getHeight() {
        if(height < 0) {
            this.height = 0;
        }
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
