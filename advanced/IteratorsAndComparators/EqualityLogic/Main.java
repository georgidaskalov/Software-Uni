package IteratorsAndComparators.EqualityLogic;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> treeSet = new TreeSet<>();
        HashSet<Person> hashSet = new HashSet<>();


        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person p = new Person(name, age);

            treeSet.add(p);
            hashSet.add(p);
        }
        System.out.println(treeSet.size());
        System.out.println(hashSet.size());


    }
}
