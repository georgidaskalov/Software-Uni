package stacksAndQueues.stacksAndQueueExercise;

import java.util.*;
import java.util.stream.Collectors;

public class reverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}