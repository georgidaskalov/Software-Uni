package advanced.conditionaExercise;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int number = firstNum;
        String str = firstNum + "";
        int solo = 0;

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int firstRes = 1;
            solo = number % 10;
            number /= 10;
            for (int j = solo;j>0;j--){

                firstRes = firstRes * (j);
            }
            result +=firstRes;
        }
        if (result==firstNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }        // HARD AF
    }
}