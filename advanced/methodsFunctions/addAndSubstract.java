package advanced.methodsFunctions;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class addAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstInt,secondInt);
        int result = substact(sum,thirdInt);
        System.out.println(result);

    }

    private static int substact(int sum, int thirdInt) {

        return sum - thirdInt;
    }
}
