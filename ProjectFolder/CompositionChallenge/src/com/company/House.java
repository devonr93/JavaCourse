package com.company;

public class House {
    private Bedroom bedroom;
    private Bathroom bathroom;
    private Kitchen kitchen;

    public House(Bedroom bedroom, Bathroom bathroom, Kitchen kitchen) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
    }

    public void enterHouse() {
        System.out.println("You open the door and walk into the house...");
    }

    public void leaveHouse() {
        System.out.println("You lock the door behind you as you leave your house.");
    }

    public void turnOffLights() {
        System.out.println("You turn off all of the lights in the house.");
    }

    public void turnOnLights() {
        System.out.println("You turn on all of the lights in the house.");
    }

    private Bedroom getBedroom() {
        return bedroom;
    }

    private Bathroom getBathroom() {
        return bathroom;
    }

    private Kitchen getKitchen() {
        return kitchen;
    }
}
