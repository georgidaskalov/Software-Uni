package advanced.methodsFunctions;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int min = getMin(getMin(first, second),third);
        print(min);

    }

    private static void print(int min) {
        System.out.println(min);
    }

    static int getMin(int first, int second) {

        if (first > second){
            return second;
        }else {
            return first;
        }

    }

}
