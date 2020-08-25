package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterCap = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            waterCap += quantity;
            if (waterCap > 255) {
                waterCap-= quantity;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.printf("%d",waterCap);
    }
}
