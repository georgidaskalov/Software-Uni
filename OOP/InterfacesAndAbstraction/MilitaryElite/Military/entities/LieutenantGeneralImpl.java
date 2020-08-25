package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.LieutenantGeneral;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Private;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("Name: %s %s Id: %d Salary: %.2f%n" +
                "Privates:%n"
                , this.getFirstName()
                , this.getLastName(), this.getId(), this.getSalary()));

        Collections.reverse(privates);
        for (Private aPrivate : privates) {
            sb.append(aPrivate.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
