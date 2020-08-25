package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.enums.Corps;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Engineer;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Private;
import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();

    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableCollection(this.repairs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("Name: %s %s Id: %d Salary: %.2f%n" +
                        "Corps:%s%n" +
                        "Repairs:%n"
                , this.getFirstName()
                , this.getLastName(), this.getId(), this.getSalary(),this.getCorps().getName()));

        for (Repair repair : repairs) {
            sb.append(repair.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
