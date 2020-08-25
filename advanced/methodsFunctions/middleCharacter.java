package advanced.methodsFunctions;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);


        int length = input.length();
        if (length%2 == 0){
            String result = sb.subSequence(length/2 -1, length/2 +1).toString();
            System.out.println(result);
        }else {

            char resultx = sb.charAt(length /2);
            System.out.println(resultx);
        }

    }
}
