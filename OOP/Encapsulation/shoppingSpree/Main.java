package OOP.Encapsulation.shoppingSpree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");
        Map<String, Person> peopleByNames = buildPeopleMap(input);

        input = scanner.nextLine().split(";");
        Map<String, Product> productsByNames = buildProductMap(input);

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            try{
                peopleByNames.get(personName).buyProduct(productsByNames.get(productName));
                System.out.printf("%s bought %s%n",personName,productName);
            }catch (IllegalStateException e){
                System.out.println(e.getMessage());
            }


            line = scanner.nextLine();
        }

        for (Person value : peopleByNames.values()) {
            System.out.println(value.toString());
            
        }

    }

    public static Map<String, Person> buildPeopleMap(String[] input) {
        Map<String, Person> peopleByName = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            Person p = new Person(name, money);
            peopleByName.putIfAbsent(name, p);
        }
        return peopleByName;
    }

    public static Map<String, Product> buildProductMap(String[] input) {
        Map<String, Product> productsByName = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            Product p = new Product(name, money);
            productsByName.putIfAbsent(name, p);
        }
        return productsByName;
    }

}
