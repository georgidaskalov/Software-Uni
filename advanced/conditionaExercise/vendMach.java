package advanced.conditionaExercise;

import java.util.Scanner;

public class vendMach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coinAmount = 0;
        String input = "";

        while (true){
            input = scanner.nextLine();
            if (input.equals("Start")){
                break;
            }
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                coinAmount += coin;
            }else {
                System.out.printf("Cannot accept %.2f",coin);
            }
        }

        double price = 0;
        String inputx2 = "";
        Boolean isTrue = false;

        while (true) {
            inputx2 = scanner.nextLine();
            switch (inputx2){
                case "Nuts":
                    price = 2;
                    isTrue = true;
                    break;
                case "Water":
                    price = 0.7;
                    isTrue = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isTrue = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isTrue = true;
                    break;
                case "Coke":
                    price = 1;
                    isTrue = true;
                    break;
            }
            if (inputx2.equals("End")){
                break;
            }
            if (coinAmount < price){
                System.out.println("Sorry, not enough money");
            }else if (isTrue){
                System.out.println("Purchased " + inputx2);
                coinAmount -= price;
            }else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f",coinAmount);
    }
}
