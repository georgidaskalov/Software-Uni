package multiD.exercises;

import java.util.Scanner;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        int primaryDSum = primaryDiagSum(matrix);
        int secondaryDSum = secondaryDiagSum(matrix);

        System.out.println(Math.abs(primaryDSum - secondaryDSum));


    }

    private static int secondaryDiagSum(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = 0;
        for (int i = matrix.length -1; i >= 0 ; i--) {
            sum += matrix[i][col++];
        }

        return sum;
    }

    private static int primaryDiagSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }

        return sum;
    }
}
