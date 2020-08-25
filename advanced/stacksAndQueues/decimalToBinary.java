package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> decimalToBinary = new Stack<>();

        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0){
            System.out.print("0");
        }

        while (number > 0) {
            decimalToBinary.push(number % 2);
            number /= 2;
        }
        int size = decimalToBinary.size();

        for (int i = 0; i < size; i++) {
            System.out.print(decimalToBinary.pop());
        }
    }
}