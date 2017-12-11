import java.util.ArrayList;

public class Vehicles {

    private ArrayList<Vehicle> vehicles;

    public Vehicles(){
        this.vehicles = new ArrayList<>();
    }


    public int getNumberOfVehicles() {
        return vehicles.size();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
