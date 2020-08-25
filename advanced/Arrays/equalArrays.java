package advanced.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean isIdentical = true;
        int sum = 0;
        for (int i = 0; i < firstNumbers.length; i++) {
            sum += firstNumbers[i];
            if (firstNumbers[i] != secondNumbers[i]) {
                System.out.printf("advanced.Arrays are not identical. Found difference at %d index.", i);
                isIdentical = false;
                return;
            }
        }
        if (isIdentical = true) {
            System.out.printf("advanced.Arrays are identical. Sum: %d", sum);
        }
    }
}
