package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class predicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(str -> str.length() <= n)
                .collect(Collectors.joining(System.lineSeparator())));


    }
}
