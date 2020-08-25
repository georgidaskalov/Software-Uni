package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class hotpotatov2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kids = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String kid[] = kids.split("\\s+");
        boolean isPrime = false;
        int cycle = 1;
        int currentRound = 1;
        Deque<String> queue = new ArrayDeque<>(Arrays.asList(kid));

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            String currentChild = queue.poll();
            if (currentRound % n != 0){
                queue.offer(currentChild);
            }else {
                System.out.println("Removed " + currentChild);
            }
            currentRound++;
        }
        System.out.println("Last is " +queue.poll());
    }
}
