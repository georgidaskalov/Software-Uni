package SetsAndMapsLab.setsAndMapsExerc;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class periodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> compounds = new TreeSet<>();
        while (n-- > 0){
            compounds.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        }
        compounds.forEach(e -> System.out.print(e + " "));


    }
    // compounds.addAll(advanced.Arrays.stream(scanner.nextLine().split(\\s+))
    // .collect(Collectors.toSet()));
}
