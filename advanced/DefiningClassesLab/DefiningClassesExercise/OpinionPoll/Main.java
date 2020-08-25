package advanced.DefiningClassesLab.DefiningClassesExercise.OpinionPoll;

import java.util.*;


public class Main {
    private static List<Person> people;

    static {
        people = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            people.add(new Person(name,age));
        }

        people.stream().filter(a -> a.age >30).sorted(Comparator.comparing(p -> p.name))
                .forEach(person -> System.out.printf("%s - %d%n",person.name,person.age));
    }


    private static class Person {
        String name;
        int age;

        public Person() {

        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
