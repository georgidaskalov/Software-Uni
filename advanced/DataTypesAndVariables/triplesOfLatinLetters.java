package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char firstChar;
        char secondChar;
        char thirdChar;
        for (int i = 0; i < n; i++) {
            firstChar = (char) ('a' + i);

            for (int j = 0; j < n; j++) {
                secondChar = (char) ('a' + j);
                for (int k = 0; k < n; k++) {

                    thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
 // HOW ARE YOU WORKING DAFUQ?