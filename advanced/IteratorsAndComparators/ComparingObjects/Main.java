package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];
            Person p = new Person(name, age, town);

            people.add(p);
            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine()) -1;
        Person person = people.get(n);

        int count = 0;
        for (Person p : people) {
            if (p.compareTo(person) == 0){
                count++;
            }
        }

        if (count ==1){
            System.out.println("No matches");
        }else {
            System.out.println(String.format("%d %d %d",count, people.size() - count , people.size()));
        }

    }
}
