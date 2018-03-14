import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(1, 2, "gold");
    }

    @Test
    public void canGetaverageSpeed() {
        assertEquals(1, dodgemCar.getAverageSpeed());
    }

    @Test
    public void canGetNumberOfSeats() {
        assertEquals(2, dodgemCar.getNumberOfSeats());
    }

    @Test
    public void canGetDriveDistance() {
        assertEquals(10, dodgemCar.driveDistance(10) );
    }
}
