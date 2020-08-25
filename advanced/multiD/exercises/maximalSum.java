package multiD.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class maximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = sizes[0];
        int m = sizes[1];

        int[][] matrix = new int[n][m];


        for (int i = 0; i < n; i++) {
            matrix[i]= Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int r = 0,c  =0;
        for (int row = 1; row < matrix.length -1; row++) {
            for (int col = 1; col < matrix[row].length-1; col++) {
                int sum = getSum(matrix,row,col);
                if (sum > maxSum){
                    maxSum = sum;
                    r = row;
                    c = col;
                }
            }
        }

        System.out.println("Sum = " +maxSum);
        r--;
        c--;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int row, int col) {
        int sum =0;

        row--;
        col--;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j <col+3 ; j++) {
                sum+= matrix[i][j];
            }
        }

        /*
        sum += matrix[row][col];
        sum += matrix[row-1][col];
        sum += matrix[row+1][col];
        sum += matrix[row][col-1];
        sum += matrix[row][col+1];
        sum += matrix[row+1][col+1];
        sum += matrix[row-1][col-1];
        sum += matrix[row-1][col+1];
        sum += matrix[row+1][col-1];
*/
        return sum;
    }
}