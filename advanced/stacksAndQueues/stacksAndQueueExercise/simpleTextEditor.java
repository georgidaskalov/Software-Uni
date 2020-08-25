package stacksAndQueues.stacksAndQueueExercise;

import java.util.Scanner;
import java.util.Stack;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOperations = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        var sbHistory = new Stack<String>();

        while (numberOfOperations-- > 0){
            var inputParams = scanner.nextLine().split("\\s+");
            var cmd = inputParams[0];
            var value = inputParams[1];

            switch (cmd){
                case "1":
                    sbHistory.push(sb.toString());
                    sb.append(value);
                    break;
                case "2":
                    sbHistory.push(sb.toString());
                    //sb.length() -= Integer.parseInt(value);
                    break;
                case "3":
                    break;
                case "4":
                    break;


            }


        }

    }
}
