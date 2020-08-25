package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Soldier;

public abstract class Soldierimpl implements Soldier {
    private int id;
    private String firstName;
    private String lastName;


    public Soldierimpl(int id , String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
