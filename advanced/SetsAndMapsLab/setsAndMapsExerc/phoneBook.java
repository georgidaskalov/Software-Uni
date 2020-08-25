package SetsAndMapsLab.setsAndMapsExerc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> peopleAndNumbers = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            peopleAndNumbers.putIfAbsent(name, number);
            peopleAndNumbers.put(name, number);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")){
            if (peopleAndNumbers.containsKey(input)){
                String key = peopleAndNumbers.get(input);
                System.out.printf("%s -> %s%n",input,key);
            }else {
                System.out.printf("Contact %s does not exist.%n",input);
            }

            input = scanner.nextLine();
        }

    }
}
