package OOP.polyMorphismEx.vehicles.vol2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car" ,addVehicleInMap(input));

        input = scanner.nextLine().split("\\s+");
        vehicleMap.put("Truck" ,addVehicleInMap(input));

        input = scanner.nextLine().split("\\s+");
        vehicleMap.put("Bus",addVehicleInMap(input));


        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[1];
            double param = Double.parseDouble(tokens[2]);

            if (tokens[0].equals("Drive") && type.equals("Bus")){
                System.out.println(((Bus) vehicleMap.get("Bus")).driveWithPassengers(param));
            }else if (tokens[0].contains("Drive")){
                System.out.println(vehicleMap.get(type).drive(param));
            }else if (tokens[0].equals("Refuel")){
                try{
                    vehicleMap.get(type).refuel(param);
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }

        }
        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }

    }

    private static Vehicle addVehicleInMap(String[] input) {
        String vehicleType = input[0];
        double fuelQuantity = Double.parseDouble(input[1]);
        double litrePerKilo = Double.parseDouble(input[2]);
        double tankCap = Double.parseDouble(input[3]);
            if (vehicleType.equals("Car")) {
                return new Car(fuelQuantity, litrePerKilo, tankCap);
            } else if (vehicleType.equals("Truck")) {
                return new Truck(fuelQuantity, litrePerKilo, tankCap);
            } else {
                return new Bus(fuelQuantity, litrePerKilo, tankCap);
            }
        }
    }
