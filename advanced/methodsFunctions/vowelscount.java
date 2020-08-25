package advanced.methodsFunctions;

import java.util.Scanner;

public class vowelscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(vowelCount(input));

    }


    private static int vowelCount(String input) {
        int counter = 0;
        String charTable = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {

                char letter = input.charAt(i);
                if (charTable.contains(letter + "")) {
                    counter++;
                }
            }
        return counter;
    }
}
