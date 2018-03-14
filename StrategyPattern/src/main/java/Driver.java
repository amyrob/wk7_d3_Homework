public class Driver {
    String name;
    IDriveable vehicle;

    public Driver(String name, IDriveable vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return this.name;
    }

    public IDriveable getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(IDriveable vehicle) {
        this.vehicle = vehicle;
    }
}
