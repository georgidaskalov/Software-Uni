package advanced.conditionaExercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        StringBuilder sb = new StringBuilder(username);
        String reversedUsername = sb.reverse().toString();
        int counter = 0;

        while (true) {
            if (!password.equals(reversedUsername)){
                counter++;
                if (counter == 4){
                    System.out.println("User " + username + " blocked!");
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            }else {
                System.out.printf("User %s logged in.",username);
                break;
            }
            password = scanner.nextLine();
        }
    }
}
