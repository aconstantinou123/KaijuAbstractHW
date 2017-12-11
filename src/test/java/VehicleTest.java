import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleTest {

    Humvee humvee1;
    Huey huey;

    @Before
    public void before(){
        humvee1 = new Humvee(Type.SOVIET, 100, 001, "Humvee");
        huey = new Huey(Type.CIVILIAN, 50, 002, "Huey");
    }

    @Test
    public void canGetHumveeType() {
        assertEquals("Soviet Humvee 1", humvee1.getType());
    }

    @Test
    public void canHueyType() {
        assertEquals("Civilian Huey 2", huey.getType());
    }

    @Test
    public void canSetHealth() {
        huey.setHealthValue(100);
        assertEquals(100, huey.getHealthValue());
    }

}
