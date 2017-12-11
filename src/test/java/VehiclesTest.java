import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehiclesTest {

    Vehicles vehicles;
    Godzilla godzilla1;
    Mothra mothra1;
    Humvee humvee1;
    Huey huey1;

    @Before
    public void before(){
        vehicles = new Vehicles();
        godzilla1 = new Godzilla("Steve", 1000, 50);
        mothra1 = new Mothra("Andy", 1500, 75);
        humvee1 = new Humvee(Type.SOVIET, 100, 001);
        huey1 = new Huey(Type.CIVILIAN, 50, 002);
    }
    @Test
    public void canGetVehiclesSize(){
        assertEquals(0, vehicles.getNumberOfVehicles());
    }

    @Test
    public void canAddVehicle(){
        vehicles.addVehicle(humvee1);
        assertEquals(1, vehicles.getNumberOfVehicles());
        vehicles.addVehicle(huey1);
        assertEquals(2, vehicles.getNumberOfVehicles());
    }

    @Test
    public void canRemoveVehicle(){
        vehicles.addVehicle(humvee1);
        vehicles.removeVehicle(humvee1);
        assertEquals(0, vehicles.getNumberOfVehicles());
    }

    @Test
    public void canAttack_2() {
        vehicles.addVehicle(humvee1);
        assertEquals("Steve hits the Soviet Humvee 1 for 50 points of damage",
                godzilla1.attackNumber(1, vehicles));
    }
}
