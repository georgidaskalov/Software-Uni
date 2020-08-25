package advanced.multiD.exercises;

import java.util.Scanner;

public class fillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");

        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix;
        if (pattern.equals("A")) {
            matrix = fillPatternA(n);

        } else {
            matrix = fillPatternB(n);
        }
        printMatrix(matrix);

    }

    private static int[][] fillPatternA(int n) {
        int value = 1;
        int[][] matrix = new int[n][n];
        for (int col = 0; col < matrix.length; col++) {

            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = value++;
            }
        }
        return matrix;
    }

    private static int[][] fillPatternB(int n) {
        int value = 1;
        int[][] matrix = new int[n][n];
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 ==0) {

                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = value++;
                }
            }else {
                for (int row = n -1; row >= 0; row--) {
                    matrix[row][col] = value++;
                }
            }
        }
        return matrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
