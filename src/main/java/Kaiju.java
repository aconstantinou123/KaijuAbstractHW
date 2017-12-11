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

    public abstract void attack(Vehicle vehicle);

    public abstract String move();
}
