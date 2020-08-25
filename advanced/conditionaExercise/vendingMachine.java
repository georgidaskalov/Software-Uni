package advanced.conditionaExercise;

        import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coinSum = 0;
        int total = 0;
        String input = "";

        while (true) {
            input = scanner.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                coinSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }
        double price = 0;
        String inputx2 = "";
        Boolean IsItTrue = false;

        while (true) {
            inputx2 = scanner.nextLine();
            switch (inputx2) {
                case "Nuts":
                    price = 2;
                    IsItTrue = true;
                    break;
                case "Water":
                    price = 0.7;
                    IsItTrue = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    IsItTrue = true;
                    break;
                case "Soda":
                    price = 0.8;
                    IsItTrue = true;
                    break;
                case "Coke":
                    price = 1;
                    IsItTrue = true;
                    break;
            }
            if (inputx2.equals("End")) {
                break;
            }
            if (coinSum < price) {
                System.out.println("Sorry, not enough money");
            } else if (IsItTrue) {
                System.out.println("Purchased " + inputx2);
                coinSum -= price;
            }else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", coinSum);

    }
}
