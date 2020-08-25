package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class hotpotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kids = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String kid[] = kids.split("\\s+");

        Deque<String> queue = new ArrayDeque<>(Arrays.asList(kid));
        int cycle = 0;


        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(div -> number % div == 0);
    }
}
