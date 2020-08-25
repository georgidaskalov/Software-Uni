package advanced.MultiDimensionalArraysLab.multiDimensionalArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();


        int counter = 1;

        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> numbers = new ArrayList<>();

            for (int col = 0; col < cols; col++) {
                numbers.add(counter++);
            }
            matrix.add(numbers);
        }

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {

            int[] tokens = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int row = tokens[0];
            int col = tokens[1];
            int radius = tokens[2];


            for (int i = col - radius; i <= col + radius; i++) {
                if (row >= 0 && row < matrix.size() && i >= 0 && i < matrix.get(row).size()) {
                    matrix.get(row).set(i, -1);
                }
            }
            for (int i = row - radius; i <= row + radius; i++) {
                if (row >= 0 && i < matrix.size() && col >= 0 && col < matrix.get(i).size()) {
                    matrix.get(i).set(col, -1);
                }
            }
            for (ArrayList<Integer> integers : matrix) {
                removeNegativeNumber(integers);
            }
            matrix.removeIf(ArrayList::isEmpty);

            input = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    private static void removeNegativeNumber(ArrayList<Integer> currentRow) {
        currentRow.removeIf(e -> e == -1);

    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
