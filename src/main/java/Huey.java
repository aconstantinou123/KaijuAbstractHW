public class Huey extends Vehicle {
    protected Huey(Type type, int healthValue, int vehicleNumber) {
        super(type, healthValue, vehicleNumber);
    }

    public String getType() {
        return super.getType() + " Huey " + getVehicleNumber();
    }

}
