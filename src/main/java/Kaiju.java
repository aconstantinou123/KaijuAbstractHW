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

    public String attack(int vehicleNumber, Vehicles vehicles) {
        String result = new String();
            for (int i = 0; i < vehicles.getVehicles().size(); i++) {
                if (vehicleNumber == vehicles.getVehicles().get(i).getVehicleNumber()) {
                    int attackPower = vehicles.getVehicles().get(i).getHealthValue() - getAttackValue();
                    vehicles.getVehicles().get(i).setHealthValue(attackPower);
                    if (vehicles.getVehicles().get(i).getHealthValue() <= 0) {
                        result = vehicles.getVehicles().get(i).getFullDescription() + " has been destroyed";
                        vehicles.getVehicles().get(i).setType(Type.DESTROYED);
                        vehicles.removeVehicle(vehicles.getVehicles().get(i));
                    } else {
                        result = this.getName() + " hits the " + vehicles.getVehicles().get(i).getFullDescription() + " for " + getAttackValue() + " points of damage";
                    }
                }
        }
        return result;
    }

    public void checkDeath() {
        if(this.getHealthValue() <= 0){
            System.exit(0);
        }
    }

    public abstract String move();
}
