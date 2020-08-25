package workshopBasicAlgorithms;

import java.util.Scanner;

public class recursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] digits = new int[input.length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }
        int i = 0;
        System.out.println(recursiveSum(digits, i));

    }

    private static int recursiveSum(int[] digits, int i) {
        if (i < digits.length) {
            int currentElement = digits[i];
            int sumSoFar = recursiveSum(digits, i + 1);
            return currentElement + sumSoFar;
        }
        return 0;
    }
}
