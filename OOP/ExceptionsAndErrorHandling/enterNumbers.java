package OOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class enterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printAndReadNumbers();


    }


    private static void validateRange(int start, int end) {
        if (start < 1 || start >= end || end > 100) {
            throw new IllegalArgumentException("Range must be between 1 < start < end < 100");
        }
    }

    private static void printAndReadNumbers() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        while (true) {

            try {
                validateRange(start, end);
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
    }
}
