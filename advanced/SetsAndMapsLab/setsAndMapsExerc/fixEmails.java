package SetsAndMapsLab.setsAndMapsExerc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emailByName = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.toLowerCase().endsWith("us") && !email.toLowerCase().endsWith("uk") &&
                    !email.toLowerCase().endsWith("com")) {
                emailByName.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emailByName.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
