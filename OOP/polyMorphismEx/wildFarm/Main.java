package OOP.polyMorphismEx.wildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!line.equals("End")){
            String[] animalInput = line.split("\\s+");



            String animalType = animalInput[0];
            String animalName = animalInput[1];
            double animalWeight = Double.parseDouble(animalInput[2]);
            String livingRegion = animalInput[3];

            Animal animal;

            switch (animalType){
                case "Mouse":
                    animal = new Mouse(animalName,animalType , animalWeight, livingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName,animalType , animalWeight, livingRegion);
                    break;
                case "Cat":
                    animal = new Cat(animalName,animalType , animalWeight, livingRegion , animalInput[4]);
                    break;
                default:
                    animal = new Tiger(animalName,animalType , animalWeight, livingRegion);
                    break;
            }
            animals.add(animal);

            String foodLine = scanner.nextLine();
            String[] animalFood = foodLine.split("\\s+");

            int foodQuantity = Integer.parseInt(animalFood[1]);
            Food food = animalFood[0].equals("Meat")
                    ? new Meat(foodQuantity)
                    : new Vegetable(foodQuantity) ;

            animal.makeSound();

            try {
                animal.eat(food);
            }catch (IllegalStateException e){
                System.out.println(e.getMessage());
            }


            line = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }
}
