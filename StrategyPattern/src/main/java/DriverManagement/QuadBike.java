package DriverManagement;

import Behaviours.IDriveable;

public class  QuadBike extends Vehicle implements IDriveable {

    int engineCapacityCc;

    public QuadBike(int averageSpeed, int engineCapacityCc, String color, int numberOfSeats) {
        super(averageSpeed, color, numberOfSeats);
        this.engineCapacityCc = engineCapacityCc;
    }

    public int getEngineCapacityCc() {
        return this.engineCapacityCc;
    }

}
