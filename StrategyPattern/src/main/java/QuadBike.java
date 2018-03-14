import com.sun.xml.internal.bind.v2.model.core.ID;

public class QuadBike implements IDriveable {
    int averageSpeed;
    int engineCapacityCc;

    public QuadBike(int averageSpeed, int engineCapacityCc) {
        this.averageSpeed = averageSpeed;
        this.engineCapacityCc = engineCapacityCc;
    }
    public int getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getEngineCapacityCc() {
        return this.engineCapacityCc;
    }

    public int driveDistance(int distance) {
        return distance / this.averageSpeed;
    }
}
