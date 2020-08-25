package OOP.polyMorphismEx.vehicles.vehicles;

import OOP.polyMorphismEx.vehicles.vehicles.Car;
import OOP.polyMorphismEx.vehicles.vehicles.Truck;
import OOP.polyMorphismEx.vehicles.vehicles.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehicleMap = new HashMap<>();

        vehicleMap.put("Car" , new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2])));

        input = scanner.nextLine().split("\\s+");

        vehicleMap.put("Truck" , new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2])));

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[1];
            double param = Double.parseDouble(tokens[2]);

            if (tokens[0].equals("Drive")){
                System.out.println(vehicleMap.get(type).drive(param));
            }else {
                vehicleMap.get(tokens[1]).refuel(param);
            }

        }
        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }

    }

}
