package trashPackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class deqyeest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";

        Deque<String> history = new ArrayDeque<>();

        while (true) {
            String line = scanner.nextLine();


            switch (line) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = line;
                    history.push(line);

            }

            System.out.println(output);

        }
    }
}
