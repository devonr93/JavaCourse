package com.company;

public class Main {

    public static void main(String[] args) {
	Dimensions dimensions = new Dimensions(12, 12);
	Kitchen kitchen = new Kitchen(dimensions, "bamboo", "purple");

	Bathroom bathroom = new Bathroom(dimensions, "tile", "beige");

	Bedroom bedroom = new Bedroom(dimensions, "carpet", "gray");

	House house = new House(bedroom, bathroom, kitchen);
	house.enterHouse();

	kitchen.getFloor();

	bathroom.exhaustFan();
	bathroom.takeShower();

	bedroom.cleanBedroom();
	bedroom.getWallColor();

	kitchen.getDimensions();
	house.turnOffLights();
	house.leaveHouse();
    }
}
