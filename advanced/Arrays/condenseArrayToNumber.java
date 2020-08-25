package advanced.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] cond = new int[numbers.length-1];
        if (numbers.length == 1){
            System.out.println(numbers[0]);
            return;
        }
        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j < cond.length - i; j++) {
                cond[j] = numbers[j] + numbers[j+1];
            }
            numbers = cond;
        }
        System.out.println(cond[0]);
    }
}
