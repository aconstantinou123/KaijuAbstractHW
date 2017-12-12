import java.util.ArrayList;
import java.util.Random;

public abstract class Vehicle {

    private Type type;
    private int healthValue;
    private int vehicleNumber;
    private String vehicle;
    private AttackStrength attackStrength;
    private int initialAttackValue;

    protected Vehicle(Type type, int healthValue, int vehicleNumber, String vehicle) {
        this.type = type;
        this.healthValue = healthValue;
        this.vehicleNumber = vehicleNumber;
        this.vehicle = vehicle;
        this.attackStrength = AttackStrength.NORMAL;
        this.initialAttackValue = 50;
    }

    public String getFullDescription() {
        return this.type.type + " " + vehicle + " " + getVehicleNumber();
    }

    public String getType() {
        return this.type.type;
    }

    public int getInitialAttackValue() {
        return initialAttackValue;
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

    public AttackStrength getAttackStrength() {
        return attackStrength;
    }

    public void setrandomAttackStrength(){
        Random rand = new Random();
        int  randomAttack = rand.nextInt(4) + 0;
        ArrayList<AttackStrength> strengthList = new ArrayList<>();
        strengthList.add(AttackStrength.ZERO);
        strengthList.add(AttackStrength.SCRAPE);
        strengthList.add(AttackStrength.NORMAL);
        strengthList.add(AttackStrength.DOUBLE);
        strengthList.add(AttackStrength.QUADRUNPLE);
        this.attackStrength = strengthList.get(randomAttack);
    }

    public String attack(Kaiju kaiju) {
        String result;
        if (this.type.type != "Destroyed") {
            this.setrandomAttackStrength();
            int attackPower = kaiju.getHealthValue() - (this.initialAttackValue * this.getAttackStrength().strength);
            kaiju.setHealthValue(attackPower);
            if (kaiju.getHealthValue() <= 0) {
                result = kaiju.getName() + " has been destroyed. \n Game Over!";
            } else {
                result = this.getFullDescription() + " " + this.getAttackStrength().description + " " + kaiju.getName()
                        + " for " + (initialAttackValue * getAttackStrength().strength) + " points of damage";
            }
        }
        else{
            result = this.getFullDescription() + " cannot attack";
        }
            return result;
        }




}
