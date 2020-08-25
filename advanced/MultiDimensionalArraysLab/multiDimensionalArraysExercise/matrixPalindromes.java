package advanced.MultiDimensionalArraysLab.multiDimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class matrixPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int matrixRow = numbers[0];
        int matrixCol = numbers[1];
        String[][] arr = new String[matrixRow][matrixCol];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < matrixCol; col++) {

                arr[row][col] = "" + (char) ('a' + row) + (char) ('a' + row + col) + (char) ('a' + row);
            }
        }


        for (int row = 0; row < matrixRow; row++) {
            for (int col = 0; col < matrixCol; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
