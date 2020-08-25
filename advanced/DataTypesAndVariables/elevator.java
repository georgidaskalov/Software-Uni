package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int courses = n / p;
        int ostatuk = n % p;

        if (ostatuk == 0){

            System.out.println(courses);
        }else {
            System.out.println(courses +1);
        }

    }
}
