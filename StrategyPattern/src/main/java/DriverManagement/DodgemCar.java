package DriverManagement;

import Behaviours.IDriveable;

public class DodgemCar extends Vehicle implements IDriveable {
    private int voltage;
    public DodgemCar(int averageSpeed, int numberOfSeats, String color, int voltage) {
        super(averageSpeed, color, numberOfSeats);

    }
}
