package IteratorsAndComparators.StrategyPattern;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> byName = new TreeSet<>(new PersonComparatorByName());
        TreeSet<Person> byAge = new TreeSet<>(new PersonComparatorByAge());


        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person p = new Person(name, age);

            byName.add(p);
            byAge.add(p);
        }

        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);

    }
}
