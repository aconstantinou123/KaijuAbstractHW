public abstract class Vehicle {

    private Type type;
    private int healthValue;
    private int vehicleNumber;

    protected Vehicle(Type type, int healthValue, int vehicleNumber) {
        this.type = type;
        this.healthValue = healthValue;
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type.type;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setVehicleNumber(int number) {
        this.vehicleNumber = number;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

}
