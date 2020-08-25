package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Spy;

public class SpyImpl extends Soldierimpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName , String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%n" +
                        "Code Number: <codeNumber>%n",this.getFirstName()
                ,this.getLastName(),this.getId(),this.codeNumber);
    }
}
