package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class reverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int divisible = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);
        System.out.println(numbers.stream().filter( n -> n % divisible != 0)
                .map(String::valueOf).collect(Collectors.joining(" "))
                );



    }
}
