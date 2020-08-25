package FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = e -> System.out.println("Sir "+ e);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
            printStuff(printer,numbers);

    }

    public static <T, C extends Collection<T>> void printStuff (Consumer<T> printer , C collection){
        collection.forEach(printer);
    }

}
