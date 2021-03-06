import java.util.ArrayList;
import java.util.Random;

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

    public String seeAllVehicles(){
        ArrayList<String> list = new ArrayList<>();
        for (Vehicle vehicle : vehicles){
            list.add(String.format("%s \n", vehicle.getFullDescription()));
        }
        String result = String.join("", list);
        return result;
    }

    public String allDestroyed(){
        String result = new String();
        ArrayList<Vehicle> destroyedVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles){
            if (vehicle.getType() == "Destroyed"){
                destroyedVehicles.add(vehicle);
            }
        }

        if (destroyedVehicles.size() == vehicles.size()){
            result =  "All vehicles destroyed";
        }
        return result;
    }

    public Vehicle getRandomVehicle(){
        Random rand = new Random();
        int  randomVehicle = rand.nextInt(vehicles.size()) + 0;
        return vehicles.get(randomVehicle);
    }

    public boolean checkVehiclesDestroyed(){
        boolean result = false;
        if (this.getVehicles().size() == 0) {
            result = true;
        }
        return result;

    }
}
