package DefiningClassesExercise.RawData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Car car = new Car();
        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engSpeed = Integer.parseInt(tokens[1]);
            int engPower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];


            Engine engine = new Engine(engSpeed,engPower);
            Cargo cargo = new Cargo(cargoWeight,cargoType);
           // Tire tire = new Tire()
           // car = new Car(model,engine,cargo,);


            car.setModel(model);




        }


    }
    public Tire[] setTires(String[] tokens){
        Tire[] tires = new Tire[4];
        for (int i = 5, j = 0; i < tokens.length-1; i+= 2 , j++) {
            if (j >= 4){
                break;
            }
            double pressure = Double.parseDouble(tokens[i]);
            int age = Integer.parseInt(tokens[i+1]);
            tires[j] = new Tire(age,pressure);
        }
        return tires;
    }

}
