public class Humvee extends Vehicle {
    protected Humvee(Type type, int healthValue, int vehicleNumber) {
        super(type, healthValue, vehicleNumber);
    }

    public String getType() {
        return super.getType() + " Humvee " + getVehicleNumber();
    }
}
