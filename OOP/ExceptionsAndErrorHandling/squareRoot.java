package OOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            getSqrt(number);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Good bye");
        }

    }
    private static void getSqrt(int n){
        double sqrt = Math.sqrt(n);
        if (Double.isNaN(sqrt)){
            throw new ArithmeticException("Invalid number");
        }
        System.out.println(sqrt);
    }
}
