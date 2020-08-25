package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class elevatorv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());

        double courses = Math.ceil(n / p);

        System.out.println((int) courses);



    }
}
