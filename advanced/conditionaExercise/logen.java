package advanced.conditionaExercise;

import java.util.Scanner;

public class logen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String reverse = "";
        int counter = 0;
        for (int i = username.length() -1 ; i >= 0; i-- ){
            reverse += username.charAt(i);

        }
        String password = scanner.nextLine();
        while (!password.equals(reverse)){

            counter++;
            if (counter == 4){
                System.out.println("User " + username + " blocked!");
                return;
            }

            System.out.println("Incorrect password. Try again.");

            password = scanner.nextLine();
        }
        System.out.printf("User %s logged in.",username);

        }
    }