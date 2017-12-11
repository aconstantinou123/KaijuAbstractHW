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
        humvee1 = new Humvee(Type.SOVIET, 100, 001);
        huey1 = new Huey(Type.CIVILIAN, 50, 002);

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
        assertEquals("Godzilla stomps his feet!", godzilla1.move());
    }

    @Test
    public void mothraCanMove() {
        assertEquals("Mothra flys high into the sky!", mothra1.move());
    }

    @Test
    public void canRoar() {
        assertEquals("ROAAAAAAR!", godzilla1.roar());
    }

    @Test
    public void canAttack() {
        godzilla1.attack(humvee1);
        assertEquals(50, huey1.getHealthValue());
    }
    @Test
    public void canAttack_2() {
        assertEquals("Steve hits the Soviet Humvee 1 for 50 points of damage", godzilla1.attack(humvee1));
    }

    @Test
    public void canAttack_Kill() {
        assertEquals("Civilian Huey 2 has been destroyed", godzilla1.attack(huey1));
        assertEquals("Destroyed Huey 2", huey1.getType());
    }
}
