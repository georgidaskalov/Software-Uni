package Generixexercise.GenericSwapMethod;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<GenericSwapMethod<String>> boxes = new ArrayList<>();

        while (n-- > 0){
            String line= scanner.nextLine();
            GenericSwapMethod<String> box = new GenericSwapMethod<>(line);
            boxes.add(box);
        }

         int firstIndex = scanner.nextInt();
         int secondIndex = scanner.nextInt();
         swap(boxes , firstIndex , secondIndex);

        for (GenericSwapMethod<String> box : boxes) {
            System.out.println(box);
        }

    }


    private static <T> void swap(List<T> boxes, int first , int second) {
        T genBox = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, genBox);
    }
}
