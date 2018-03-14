public class DodgemCar implements IDriveable {
    int averageSpeed;
    int numberOfSeats;

    public DodgemCar(int averageSpeed, int numberOfSeats) {
        this.averageSpeed = averageSpeed;
        this.numberOfSeats = numberOfSeats;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}
