public enum Type {
    SOVIET ("Soviet"),
    CIVILIAN ("Civilian"),
    ARMOURED ("Armoured"),
    DESTROYED("Destroyed"),
    STEALTH ("Stealth");


    final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
