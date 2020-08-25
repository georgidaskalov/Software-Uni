package stacksAndQueues.stacksAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            if (command[0].equals("1")) {
                queue.push(Integer.parseInt(command[1]));
            } else if (command[0].equals("2")) {
                queue.pop();
            } else if (command[0].equals("3")) {
                int max = getMaxEle(queue);
                System.out.println(max);
            }


        }

    }

    private static int getMaxEle(ArrayDeque<Integer> queue) {
        if (queue.isEmpty()) {
            return 0;
        } else {
            int max = Collections.max(queue);
            return max;

        }
    }
}