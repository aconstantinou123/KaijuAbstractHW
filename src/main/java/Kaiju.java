import java.util.ArrayList;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    protected Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROAAAAAAR!";
    }

    public String attack(Vehicle vehicle) {
        String result = new String();
        int attackPower = vehicle.getHealthValue() - getAttackValue();
        vehicle.setHealthValue(attackPower);
        if (vehicle.getHealthValue() <= 0) {
           result = vehicle.getType() + " has been destroyed";
           vehicle.setType(Type.DESTROYED);
        }
        else {
            result = this.getName() + " hits the " + vehicle.getType() + " for " + getAttackValue() + " points of damage";
        }
        return result;
    }

    public String attackNumber(int vehicleNumber, Vehicles vehicles) {
        String result = new String();
        for (Vehicle vehicle : vehicles.getVehicles()) {
            if (vehicleNumber == vehicle.getVehicleNumber()) {
                int attackPower = vehicle.getHealthValue() - getAttackValue();
                vehicle.setHealthValue(attackPower);
                if (vehicle.getHealthValue() <= 0) {
                    result = vehicle.getType() + " has been destroyed";
                    vehicle.setType(Type.DESTROYED);
                } else {
                    result = this.getName() + " hits the " + vehicle.getType() + " for " + getAttackValue() + " points of damage";
                }
            }
        }
        return result;
    }

    public abstract String move();
}
