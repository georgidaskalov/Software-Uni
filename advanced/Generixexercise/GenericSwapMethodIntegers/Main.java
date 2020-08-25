package Generixexercise.GenericSwapMethodIntegers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<GenericSwapInteger<Integer>> boxes = new ArrayList<>();

        while (n-- > 0){
            String line= scanner.nextLine();
            GenericSwapInteger<Integer> box = new GenericSwapInteger<>(Integer.parseInt(line));
            boxes.add(box);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        swap(boxes , firstIndex , secondIndex);

        for (GenericSwapInteger<Integer> box : boxes) {
            System.out.println(box);
        }
    }
    private static <T> void swap(List<T> boxes, int first , int second) {
        T genBox = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, genBox);
    }
}
