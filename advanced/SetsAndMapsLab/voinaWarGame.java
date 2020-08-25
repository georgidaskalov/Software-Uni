package SetsAndMapsLab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class voinaWarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> SecondPlayer = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            input = scanner.nextInt();
            firstPlayer.add(input);
        }

        for (int i = 0; i < 20; i++) {
            input = scanner.nextInt();
            SecondPlayer.add(input);
        }

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            } else if (SecondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            int firstPlayercard = firstPlayer.iterator().next();
            firstPlayer.remove(firstPlayercard);
            int secondPlayercard = SecondPlayer.iterator().next();
            SecondPlayer.remove(secondPlayercard);
            if (firstPlayercard == secondPlayercard){
                continue;
            }

            if (firstPlayercard > secondPlayercard) {
                firstPlayer.add(firstPlayercard);
                firstPlayer.add(secondPlayercard);
            } else {
                SecondPlayer.add(firstPlayercard);
                SecondPlayer.add(secondPlayercard);
            }
        }


        if (firstPlayer.isEmpty() || firstPlayer.size() < SecondPlayer.size()){
            System.out.println("Second player win!");
        }else if (SecondPlayer.isEmpty() || SecondPlayer.size() < firstPlayer.size()){
            System.out.println("First player win!");
        }else if (firstPlayer.size() == SecondPlayer.size()){
            System.out.println("Draw!");
        }

    }
}