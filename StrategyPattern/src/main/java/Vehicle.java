public abstract class Vehicle implements IDriveable {
    int averageSpeed;
    String color;
    int numberOfSeats;

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
}

