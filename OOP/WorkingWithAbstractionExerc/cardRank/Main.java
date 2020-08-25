package OOP.WorkingWithAbstractionExerc.cardRank;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print(scanner);


    }

    public static void print(Scanner scanner){
        String input = scanner.nextLine();
        if (input.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            for (CardRank card : CardRank.values()){
                System.out.printf("Ordinal value: %d; Name value: %s",card.ordinal(), card);
                System.out.println();
            }
        }
    }
}
