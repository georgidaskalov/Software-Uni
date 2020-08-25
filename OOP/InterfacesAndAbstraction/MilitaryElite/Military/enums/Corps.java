package OOP.InterfacesAndAbstraction.MilitaryElite.Military.enums;

public enum Corps {

    AIRFORCES("Airforces"),
    MARINES("Marines");

    private final String name;

    Corps(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
