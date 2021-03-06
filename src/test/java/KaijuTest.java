import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Godzilla godzilla1;
    Mothra mothra1;
    Humvee humvee1;
    Huey huey1;

    @Before
    public void before() {
        godzilla1 = new Godzilla("Steve", 1000, 50);
        mothra1 = new Mothra("Andy", 1500, 75);
        humvee1 = new Humvee(Type.SOVIET, 100, 001, "Humvee");
        huey1 = new Huey(Type.CIVILIAN, 50, 002, "Huey");

    }

    @Test
    public void canGetName() {
        assertEquals("Steve", godzilla1.getName());
    }

    @Test
    public void canSetAttackValue() {
        godzilla1.setAttackValue(100);
        assertEquals(100, godzilla1.getAttackValue());
    }

    @Test
    public void godzillacanMove() {
        assertEquals("Godzilla stomps his feet and moves towards another vehicle!", godzilla1.move());
    }

    @Test
    public void mothraCanMove() {
        assertEquals("Mothra flys high into the sky before diving towards another vehicle!", mothra1.move());
    }

    @Test
    public void canRoar() {
        assertEquals("ROAAAAAAR!", godzilla1.roar());
    }
}
