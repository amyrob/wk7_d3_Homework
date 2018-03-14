import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {
    Driver driver;
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(1, 2, "Gold");
        driver = new Driver("Jussi", dodgemCar);

    }
    @Test
    public void canGetName() {
        assertEquals("Jussi", driver.getName());
    }

    @Test
    public void canGetVehicle() {
        assertEquals(dodgemCar, driver.getVehicle());
    }

    @Test
    public void canSetVehicle() {
        QuadBike quadBike = new QuadBike(25, 25, "British Racing Green", 2);
        driver.setVehicle(quadBike);
        assertEquals(quadBike, driver.getVehicle());
    }

    @Test
    public void canGetJourneyTimeForSpecificVehicle() {
        assertEquals(10, driver.getVehicle().driveDistance(10));
    }
}
