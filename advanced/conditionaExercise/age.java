package advanced.conditionaExercise;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String ageGroup = "";
        if (age >= 0 && age < 3){
            ageGroup = "baby";
        }else if (age > 2 && age < 14){
            ageGroup = "child";
        }else if (age > 13 && age < 20) {
            ageGroup = "teenager";
        }else if (age > 19 && age < 66){
            ageGroup = "adult";
        }else if (age >= 66){
            ageGroup = "elder";
        }

        System.out.println(ageGroup);
    }
}
