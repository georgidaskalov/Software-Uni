package advanced.multiD;

import java.util.Arrays;
import java.util.Scanner;

public class printDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int row = 0;
        int col = 0;

        while (row < size && col < size) {

            int element = matrix[row][col];
            System.out.print(element + " ");
            row++;
            col++;
        }
        System.out.println();
        row = size - 1;
        col = 0;
        while (row >= 0 && col < size) {
            int element = matrix[row][col];
            System.out.print(element + " ");
            row--;
            col++;
        }
    }
}