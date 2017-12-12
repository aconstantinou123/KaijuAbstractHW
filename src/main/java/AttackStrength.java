public enum AttackStrength {
    ZERO("misses", 0),
    SCRAPE ("scrapes", 1),
    NORMAL ("hits", 2),
    DOUBLE ("deals double damage to", 4),
    QUADRUNPLE("scores a critical hit and deals quad damage to", 8);

    final String description;
    final int strength;


    AttackStrength(String description, int strength) {
        this.description = description;
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public int getStrength() {
        return strength;
    }

}
