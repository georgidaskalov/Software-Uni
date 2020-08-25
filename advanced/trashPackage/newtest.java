package trashPackage;

import java.util.ArrayDeque;
import java.util.Scanner;

public class newtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();

        String line = scanner.nextLine();
        String current = "";

        while (!"Home".equals(line)) {
            if ("back".equals(line)) {
                if (browser.isEmpty()) {
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if (!current.equals("")){
                    browser.push(current);
                }

                current = line;
            }
            System.out.println(current);

            line = scanner.nextLine();
        }


    }
}
