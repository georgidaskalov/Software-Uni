package advanced.Arrays;

import java.util.Scanner;

public class reverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i] + " ");
        }

    }
}
