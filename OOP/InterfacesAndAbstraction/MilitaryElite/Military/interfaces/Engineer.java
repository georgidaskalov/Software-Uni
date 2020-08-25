package OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces;

import java.util.Collection;

public interface Engineer extends Private{
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
