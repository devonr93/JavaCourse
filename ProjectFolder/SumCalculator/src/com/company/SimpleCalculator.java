package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        // Set the value of firstNumber
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        // Set the value of secondNumber
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        // Add field values of firstNumber and secondNumber
        return getSecondNumber() + getFirstNumber();
    }

    public double getSubtractionResult() {
        // Needs to return the result of subtracting field values of secondNumber
        // from the firstNumber
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        // Needs to return result of multiplying
        // field values of firstNumber and secondNumber
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        // Needs to return result of dividing
        // field values of firstNumber by the secondNumber
        // If the value of secondNumber is 0 then return 0
        if (getSecondNumber() == 0) return 0;

        return getFirstNumber() / getSecondNumber();
    }

}
