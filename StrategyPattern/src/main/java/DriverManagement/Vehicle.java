package DriverManagement;


public abstract class Vehicle {
    private int averageSpeed;
    private String color;
    private int numberOfSeats;

    public Vehicle(int averageSpeed, String color, int numberOfSeats) {
        this.averageSpeed = averageSpeed;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }
    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
}

