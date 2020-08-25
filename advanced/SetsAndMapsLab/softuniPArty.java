package SetsAndMapsLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class softuniPArty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        Set<String> guestList = new TreeSet<>();

        while (!"PARTY".equals(input)){
            guestList.add(input);
            input = scanner.nextLine().trim();
        }

        while (!"END".equals(input)){
                guestList.remove(input);

            input = scanner.nextLine().trim();
        }

        System.out.println(guestList.size());
        for (String guest : guestList){
            System.out.println(guest);
        }
    }
}
