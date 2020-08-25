package SetsAndMapsLab.setsAndMapsExerc;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class setOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedHashSet<Integer> first = readSetOfNumbers(n, scanner);
        LinkedHashSet<Integer> second = readSetOfNumbers(m, scanner);

        first.retainAll(second);

        String collect = first.stream().map(i -> i + " ").collect(Collectors.joining());
        System.out.println(collect);

    }

    private static LinkedHashSet<Integer> readSetOfNumbers(int count, Scanner scan) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        while (count-- > 0){
            set.add(scan.nextInt());
        }

        return set;
    }
}
