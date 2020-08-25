package OOP.InterfacesAndAbstraction.MilitaryElite.Military.entities;

import OOP.InterfacesAndAbstraction.MilitaryElite.Military.interfaces.Mission;

public class MissionImpl implements Mission {

    public enum Status {
        IN_PROGRESS,
        FINISHED;
    }

    private String codeName;

    private Status status;

    public MissionImpl(String codeName, Status status) {
        this.codeName = codeName;
        this.status = status;
    }

    @Override
    public void completeMission() {
        this.status = Status.FINISHED;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",this.codeName,getStatus());
    }
}
