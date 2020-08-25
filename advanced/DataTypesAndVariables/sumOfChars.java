package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String read = "";
        int totalSum = 0;
        for (int i = 0; i < n ; i++) {
            read = scanner.nextLine();
            if (read.length() < 2){
                char ch = read.charAt(0);
                int ascii = (int) ch;
                totalSum += ascii;
            }
        }
        System.out.println("The sum equals: " + totalSum);
    }
}
