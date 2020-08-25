package advanced.MultiDimensionalArraysLab;

import java.util.Scanner;

public class intersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstCharMatrix = readCharMatrix(scanner, rows);
        char[][] secondCharMatrix = readCharMatrix(scanner, rows);
        char[][] answer = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstCharMatrix[row][col] == secondCharMatrix[row][col]){
                     answer[row][col] = firstCharMatrix[row][col];
                }else {
                    answer[row][col] = '*';
                }
            }
        }
        printCharMatrix(answer);
    }

    private static char[][] readCharMatrix(Scanner scanner, int rows) {
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String strippedString = line.replaceAll("\\s+", "");
            strippedString.toCharArray();
            matrix[row] = strippedString.toCharArray();



        }
        return matrix;
    }

    //private static int[][] readIntMatrix(Scanner scanner) {
    //    String line = scanner.nextLine();
    //    String[] split = line.split("\\s+");
    //    int rows = Integer.parseInt(split[0]);
    //    int cols = Integer.parseInt(split[1]);
//
    //    int[][] matrix = new int[rows][cols];
//
    //    for (int row = 0; row < rows; row++) {
    //        line = scanner.nextLine();
    //        split = line.split("\\s+");
    //        for (int col = 0; col < cols; col++) {
    //            matrix[row][col] = Integer.parseInt(split[col]);
    //        }
    //    }
    //    return matrix;
    //}
//
    //private static void printIntMatrix(int[][] matrix) {
    //    for (int row = 0; row < matrix.length; row++) {
    //        for (int col = 0; col < matrix[row].length; col++) {
    //            System.out.print(matrix[row][col] + " ");
    //        }
    //        System.out.println();
    //    }
    //}
    private static void printCharMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
