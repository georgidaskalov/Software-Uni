package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class printPartOfAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();


        for (int i = start; i <= end; i++) {
            char c = (char) i;
            sb.append(c);
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}
