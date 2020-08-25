package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.enums.Corps;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary , Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public Corps getCorps() {
        return this.corps;
    }
}
