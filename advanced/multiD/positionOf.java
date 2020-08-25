package multiD;

import java.util.Arrays;
import java.util.Scanner;

public class positionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int r = 0; r < matrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[r] = arr;
        }
        int searchNum = Integer.parseInt(scanner.nextLine());
        boolean foundOrNot = false;
        for (int ro = 0; ro < matrix.length; ro++) {
            for (int co = 0; co < matrix[ro].length; co++) {
                if (matrix[ro][co] == searchNum){
                    System.out.println(ro + " " + co);
                    foundOrNot = true;
                }
            }
        }
        if (!foundOrNot){
            System.out.println("not found");
        }

    }
}
