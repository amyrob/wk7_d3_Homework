public class DodgemCar extends Vehicle {

    public DodgemCar(int averageSpeed, int numberOfSeats, String color) {
        super(averageSpeed, color, numberOfSeats);

        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

}
