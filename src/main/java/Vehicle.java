public abstract class Vehicle {

    private Type type;
    private int healthValue;
    private int vehicleNumber;
    private String vehicle;

    protected Vehicle(Type type, int healthValue, int vehicleNumber, String vehicle) {
        this.type = type;
        this.healthValue = healthValue;
        this.vehicleNumber = vehicleNumber;
        this.vehicle = vehicle;
    }

    public String getType() {
        return this.type.type + " " + vehicle + " " + getVehicleNumber();
    }

    public String getTypeRegular() {
        return this.type.type;
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
