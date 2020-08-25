package advanced.MultiDimensionalArraysLab.multiDimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class maximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = getIntsMatrix(scanner);


        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = getIntsMatrix(scanner);
        }

        int maxSum = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;

        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int currentSum = calculateMatrixSum(matrix, row, col);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMaxSubMatrix(matrix, indexCol, indexRow);
    }

    private static void printMaxSubMatrix(int[][] matrix, int indexCol, int indexRow) {
        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol -1; col <= indexCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        sum += matrix[row][col];

        sum += matrix[row][col + 1];

        sum += matrix[row][col - 1];

        sum += matrix[row + 1][col];

        sum += matrix[row - 1][col];

        sum += matrix[row - 1][col - 1];

        sum += matrix[row + 1][col + 1];

        sum += matrix[row + 1][col - 1];

        sum += matrix[row - 1][col + 1];


        return sum;

    }

    private static int[] getIntsMatrix(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
    }
}
