package advanced.methodsFunctions;

import java.util.Scanner;

public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        nxn(n);

    }

    private static void nxn(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n ; j++) {
                System.out.print(n + " ");
            }
        }
    }
}
