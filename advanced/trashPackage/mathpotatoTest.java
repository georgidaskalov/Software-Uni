package trashPackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class mathpotatoTest {
    private static Deque<String> queue;
    private static int n;
    private static int cycle;

    static {
        Scanner scanner = new Scanner(System.in);
        queue = new ArrayDeque<>();
        cycle = 1;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        readInput();
        playTheGame();
        System.out.println("Last is " + queue.poll());

    }

    private static void playTheGame() {
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
    }

    private static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] persons = scanner.nextLine().split("\\s+");
        n = Integer.valueOf(scanner.nextLine());
        for (String person : persons) {
            queue.offer(person);
        }
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(div -> number % div == 0);
    }
}
