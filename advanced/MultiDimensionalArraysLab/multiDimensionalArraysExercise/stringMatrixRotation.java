package advanced.MultiDimensionalArraysLab.multiDimensionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //doesnt work
        String command = scanner.nextLine();
        int first = command.indexOf("(");
        int last = command.indexOf(")");
        int length = last - first;

        String number = command.substring(first + 1, length - 1);
        int degrees = Integer.parseInt(number);
        List<String> listOfStrings = new ArrayList<>();
        int maxlength = 0;
        int rows = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {

            rows++;
            listOfStrings.add(input);
            if (input.length() > maxlength) {
                maxlength = input.length();
            }
            input = scanner.nextLine();
        }

        char[][] matrix = new char[rows][maxlength];
        int index = 0;
        int item = 0;

        for (int row = 0; row < matrix[row].length; row++) {
            String word = listOfStrings.get(item);
            int itemLength = word.length();

            for (int col = 0; col < matrix[col].length; col++) {
                if (index == itemLength) {
                    while (index < itemLength) {
                        matrix[row][col] = ' ';
                        index++;
                        col++;
                    }
                    index = 0;
                    break;
                } else {
                    matrix[row][col] = word.charAt(index);
                    index++;
                }
            }
            item++;
            index = 0;
        }
        Rotate(matrix,degrees);

    }

    private static void Rotate(char[][] matrix, int degrees) {
        switch (degrees){
            case 90:
                for (int col = 0; col < matrix[1].length ; col++) {
                    for (int row = matrix[0].length -1; row >= 0 ; row--) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            break;
            case 180:
                for (int r = matrix[0].length - 1; r >= 0; r--)
                {
                    for (int c = matrix[1].length - 1; c >= 0; c--)
                    {
                        System.out.print(matrix[r][c] + " ");
                    }
                    System.out.println();
                }
                break;

            case 270:
                for (int col = matrix[1].length - 1; col >= 0; col--)
                {
                    for (int row = 0; row <= matrix[0].length - 1; row++)
                    {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                break;
            case 360:
                for (int row = 0; row < matrix[0].length; row++)
                {
                    for (int col = 0; col < matrix[1].length; col++)
                    {
                        System.out.print(matrix[row][col]);;
                    }
                    System.out.println();
                }
                break;
        }
    }
}
