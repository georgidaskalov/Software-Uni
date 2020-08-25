package advanced.methodsFunctions;

import java.util.Scanner;

public class characterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        char x = firstChar.charAt(0);
        char z = secondChar.charAt(0);

        printTheCharsBetweenTwoChars(x, z);

    }

    private static void printTheCharsBetweenTwoChars(char x, char z) {

        int minChar = Math.min(x, z);
        int maxChar = Math.max(x, z);
        for (int i = minChar + 1; i < maxChar; i++) {

            System.out.print((char) i + " ");
        }
    }
}
