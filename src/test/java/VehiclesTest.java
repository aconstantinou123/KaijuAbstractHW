import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehiclesTest {

    Vehicles vehicles;
    Godzilla godzilla1;
    Mothra mothra1;
    Humvee humvee1;
    Huey huey1;
    Huey huey2;

    @Before
    public void before(){
        vehicles = new Vehicles();
        godzilla1 = new Godzilla("Steve", 1000, 50);
        mothra1 = new Mothra("Andy", 1500, 75);
        humvee1 = new Humvee(Type.SOVIET, 100, 001, "Humvee");
        huey1 = new Huey(Type.CIVILIAN, 50, 002, "Huey");
        huey2 = new Huey(Type.DESTROYED, 50, 002, "Huey");
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
                godzilla1.attack(1, vehicles));
        assertEquals("Soviet Humvee 1 has been destroyed",
                godzilla1.attack(1, vehicles));
    }
    @Test
    public void canSeeVehicles() {
        vehicles.addVehicle(humvee1);
        vehicles.addVehicle(huey1);
        assertEquals("Soviet Humvee 1 \n" +
                "Civilian Huey 2 \n", vehicles.seeAllVehicles());
    }

    @Test
    public void allDestroyed(){
        vehicles.addVehicle(huey2);
        assertEquals("All vehicles destroyed", vehicles.allDestroyed());
    }

//    @Test
//    public void canAttack(){
//        humvee1.attack(godzilla1);
//        assertEquals(700, godzilla1.getHealthValue());
//    }
}
