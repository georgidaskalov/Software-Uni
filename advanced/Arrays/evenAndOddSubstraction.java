package advanced.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class evenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int number : numbers){
            if (number % 2 == 0){
                even.add(number);
            }else {
                odd.add(number);
            }
        }
        Integer oddSum = odd.stream().mapToInt(Integer::intValue).sum();
        Integer evenSum = even.stream().mapToInt(Integer::intValue).sum();

        System.out.println(evenSum - oddSum);



    }
}
