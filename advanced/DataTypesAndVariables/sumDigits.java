package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (input != 0){
            sum = sum + input % 10;
            input = input/10;
        }
        System.out.println(sum);


    }
}
