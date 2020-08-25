package advanced.conditionaExercise;

import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entryNum = Integer.parseInt(scanner.nextLine());
        int number = entryNum;
        String str = entryNum + "";

        int singleD = 0;

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int firstRes = 1;
            singleD = number % 10;
            number /= 10;
            for (int j = singleD; j > 0; j--) {
                firstRes = firstRes * (j);
            }
            result +=firstRes;
        }
    if (result==entryNum){
        System.out.println("yes");
    }else {
        System.out.println("no");
    }

    }
}
