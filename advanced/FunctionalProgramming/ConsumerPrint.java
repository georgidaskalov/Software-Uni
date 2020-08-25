package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(System.out::println);

        // String input = scanner.nextLine();
        // List<String> stringCollection = new ArrayList<>();
        // String[] tokens = input.split("\\s+");

        // stringCollection.addAll(Arrays.asList(tokens));

        // Consumer<String> print = s -> System.out.println(s);

        // stringCollection.stream()
        //         .forEach(print);

        // OR




    }
}
