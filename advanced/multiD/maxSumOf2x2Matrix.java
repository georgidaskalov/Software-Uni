package advanced.multiD;


import java.util.Arrays;
import java.util.Scanner;

public class maxSumOf2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        //d[0] = r   d[1] = c
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxValue = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int r = 0; r < matrix.length -1; r++) {
            for (int c = 0; c < matrix[r].length -1; c++) {
                int current = matrix[r][c];
                int right = matrix[r][c +1];
                int below = matrix[r +1][c];
                int diagonal = matrix[r+1][c+1];
                int sum = current + right + below + diagonal;
                if (sum > maxValue){
                    maxValue = sum;
                    row = r;
                    col = c;

                }


            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[row+i][col + j] + " ");
            }
            System.out.println();
        }

        System.out.println(maxValue);

    }
}
