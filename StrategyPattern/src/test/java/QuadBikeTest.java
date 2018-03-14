import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(25, 50);
    }

    public void canGetaverageSpeed() {
        assertEquals(1, quadBike.getAverageSpeed());
    }

    @Test
    public void canGetEngineCapacityCc() {
        assertEquals(50, quadBike.getEngineCapacityCc());
    }

    @Test
    public void canGetDriveDistance() {
        assertEquals(2, quadBike.driveDistance(50) );
    }
}
