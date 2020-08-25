package advanced.MultiDimensionalArraysLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class positionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readmatrix(scanner);

        int number = scanner.nextInt();
        Deque<String> answer = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (number == matrix[row][col]) {
                    String matchingPair = row + " " + col;
                    answer.offer(matchingPair);
                }
            }
        }
        if (answer.isEmpty()) {
            System.out.println("not found");
        } else {
            while (!answer.isEmpty()) {
                System.out.println(answer.poll());

            }
        }

        // printIntMatrix(matrix);

    }

    private static int[][] readmatrix(Scanner scanner) {
        String line = scanner.nextLine();   // rows
        String[] split = line.split("\\s+");  // split cols
        int rows = Integer.parseInt(split[0]);
        int cols = Integer.parseInt(split[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            split = line.split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(split[col]);
            }
        }
        return matrix;
    }

    private static void printIntMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
