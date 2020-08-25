package stacksAndQueues.stacksAndQueueExercise;

import java.util.*;

public class basicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int push = scanner.nextInt();
        int pop = scanner.nextInt();
        int isPresent = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < push; i++) {
            numbers.push(scanner.nextInt());
        }
        for (int i = 0; i < pop; i++) {
            numbers.pop();
        }

        if(numbers.contains(isPresent)){
            System.out.println("true");
        }else {
            int number = getMinEle(numbers);
            System.out.println(number);
        }

    }

    private static int getMinEle(ArrayDeque<Integer> stack) {
        if (stack.isEmpty()){
            return 0;
        }else {
            int min = Collections.min(stack);
            return min;

        }
    }

}
