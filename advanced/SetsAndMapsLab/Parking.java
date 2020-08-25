package SetsAndMapsLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();

        while (!"END".equals(input)){
            String[] split = input.split(", ");


            if ("IN".equals(split[0])){
                parking.add(split[1]);
            }else if ("OUT".equals(split[0])){
                parking.remove(split[1]);
            }

            input = scanner.nextLine();
        }

        if (!parking.isEmpty()){
            for (String s : parking) {
                System.out.println(s);
            }
        }else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
