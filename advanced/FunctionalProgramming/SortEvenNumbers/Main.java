package FunctionalProgramming.SortEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> input = readInput(new Scanner("4, 2, 1, 3, 5, 7, 1, 4, 2, 12"));

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        Predicate<Integer> isOdd = (number) -> number % 2 != 0;

        System.out.println(isEven.test(3));
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer integer : input) {
            if (isEven.test(integer)){
                evenNumbers.add(integer);
            }else {
                oddNumbers.add(integer);
            }
        }
        System.out.println(evenNumbers);

        String output = evenNumbers.stream().map(number -> number.toString())
                .collect(Collectors.joining(", "));
        System.out.println(output);

        String sortedOutput = evenNumbers.stream().sorted().map(number -> number.toString())
                .collect(Collectors.joining(", "));
        System.out.println(sortedOutput);
    }

    private static List<Integer> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] tokens = line.split(", +");
        return Arrays.stream(tokens)
                .map(string -> Integer.valueOf(string)).collect(Collectors.toList());
    }
}
