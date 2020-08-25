package advanced.conditionaExercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoplecount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double pricePerPerson = 0;
        double totalPrice = 0;
        switch (groupType) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 9.80;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 10.46;
                }
                if (peoplecount >= 30) {
                    totalPrice = (pricePerPerson * peoplecount) * 0.85;
                } else {
                    totalPrice = pricePerPerson * peoplecount;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 16;
                }
                if (peoplecount >= 100) {
                    totalPrice = (pricePerPerson * (peoplecount - 10));
                } else {
                    totalPrice = pricePerPerson * peoplecount;
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 20;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 22.50;
                }
                if (peoplecount >= 10 && peoplecount <= 20) {
                    totalPrice = (pricePerPerson * peoplecount) * 0.95;
                } else {
                    totalPrice = pricePerPerson * peoplecount;
                }
                break;

        }
        System.out.printf("Total price: %.2f",totalPrice);

    }
}
