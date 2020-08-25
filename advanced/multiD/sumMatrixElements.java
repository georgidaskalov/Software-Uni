package advanced.multiD;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int totalsum= 0;
        //d[0] = r   d[1] = c
        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);
        for (int r = 0; r < matrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int sum = IntStream.of(arr).sum();
            totalsum += sum;

            matrix[r] = arr;
        }
        System.out.println(totalsum);





    }
}
