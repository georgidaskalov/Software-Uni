package advanced.DataTypesAndVariables;

import java.util.Scanner;

public class spiceMustFLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int harvest = 0;
        int days = 0;

        if (number >= 100){
            do {
                days++;
                harvest = (harvest + number) - 26;
                number = number -10;
            }while (number >= 100);{
                harvest -= 26;
                System.out.printf("%d%n%d", days, harvest);
            }
        }else {
            System.out.printf("%d%n%d",0 ,0);
        }


    }
}
