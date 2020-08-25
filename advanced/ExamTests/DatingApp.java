package ExamTests;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(males::push);

        ArrayDeque<Integer> females = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        int matches = 0;
        while (!males.isEmpty() && !females.isEmpty()) {
            int male = males.peek();
            int female = females.peek();
            if (male <= 0) {
                males.pop();
                continue;
            }
            if (female <= 0) {
                females.poll();
                continue;
            }

            if (male % 25 == 0) {
                males.pop();
                males.pop();
                continue;
            }
            if (female % 25 == 0) {
                females.poll();
                females.poll();
                continue;
            }


            //males push pop
            // females offer , poll


            if (male == female) {
                matches++;
                females.poll();
                males.pop();
            } else {
                females.poll();
                males.push(males.pop() - 2);

            }
        }

        System.out.println("Matches: " + matches);
        System.out.println("Males left: " + formatArrayDeque(males));
        System.out.println("Females left: " + formatArrayDeque(females));


    }


    public static String formatArrayDeque(ArrayDeque<Integer> deque) {
        if (deque.isEmpty()) {
            return "none";
        }
        return deque.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
