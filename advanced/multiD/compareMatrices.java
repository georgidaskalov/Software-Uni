package advanced.multiD;

import java.util.Arrays;
import java.util.Scanner;

public class compareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int[][] test1 = new int[r][c];

        for (int rows = 0; rows < r; rows++) {
            String[] tokens = scanner.nextLine().split(" ");
            for (int cols = 0; cols < c; cols++) {
                test1[rows][cols] = Integer.parseInt(tokens[cols]);
            }
        }

        r = scanner.nextInt();
        c = scanner.nextInt();
        scanner.nextLine();
        int[][] test2 = new int[r][c];

        for (int rows = 0; rows < r; rows++) {
            String[] tokens = scanner.nextLine().split(" ");
            for (int cols = 0; cols < c; cols++) {
                test2[rows][cols] = Integer.parseInt(tokens[cols]);
            }
        }
        boolean areMatricesEqual = Arrays.deepEquals(test1,test2);
        if (areMatricesEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
}
