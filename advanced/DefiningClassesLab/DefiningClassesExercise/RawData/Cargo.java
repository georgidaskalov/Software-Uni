package DefiningClassesExercise.RawData;

public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int cargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public Cargo() {

    }

    public String getType(String cargoType){
        return this.cargoType;
    }

}
