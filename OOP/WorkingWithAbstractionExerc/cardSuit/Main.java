package OOP.WorkingWithAbstractionExerc.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print(scanner);
    }
    public static void print(Scanner scanner){
        String input = scanner.nextLine();
        if (input.equals("Card Suits")){
            System.out.println("Card Suits:");
            for (cardSuits number : cardSuits.values()){
                System.out.printf("Ordinal value: %d; Name value: %s",number.ordinal(), number);
                System.out.println();
            }
        }
    }
}
