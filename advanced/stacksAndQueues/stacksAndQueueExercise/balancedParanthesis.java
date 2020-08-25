package stacksAndQueues.stacksAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class balancedParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parantheses = scanner.nextLine();
        ArrayDeque<Character> brackets = new ArrayDeque<>();

        String lookupTable = "({[";
        Boolean areBalanced = true;
        for (int i = 0; i < parantheses.length() ; i++) {
            char symbol = parantheses.charAt(i);

            if (lookupTable.contains(symbol+ "")){
                brackets.push(symbol);
            }else {
                if (brackets.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char top = brackets.pop();

                if (!(top == '(' && symbol == ')' || top == '[' && symbol == ']' || top == '{' && symbol == '}')){
                    areBalanced = false;
                    break;
                }

            }
        }

        String output = areBalanced ? "YES" : "NO";
        System.out.println(output);

    }
}
