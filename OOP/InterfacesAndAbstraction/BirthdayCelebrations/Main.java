package OOP.InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String type = tokens[0];
            String nameOrModel = tokens[1];
            switch (type) {

                case "Citizen": {
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];
                    birthables.add(new Citizen(nameOrModel, age, id, birthDate));
                    break;
                }
                case "Pet": {
                    String birthDate = tokens[2];
                    Pet pet = new Pet(nameOrModel, birthDate);
                    birthables.add(pet);
                    break;
                }
                case "Robot":
                    String id = tokens[2];
                    Robot robot = new Robot(nameOrModel, id);
                    break;
                default:
                    break;
            }

            line = scanner.nextLine();
        }

        String year = scanner.nextLine();
        boolean hasOutput =false;
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
                hasOutput = true;

            }
        }

        if (!hasOutput){
            System.out.println("<no output>");
        }
    }
}
