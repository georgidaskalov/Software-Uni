package workshopBasicAlgorithms.binarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[]{1, 5, 8, 12, 42, 69, 99, 127};
        int resultIndex = binarySearch(arr, 1);

        System.out.println(resultIndex);
    }

    private static int binarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midIndex = start + (end - start) / 2;

            if (i == arr[midIndex]) {
                return midIndex;
            } else if (i > arr[midIndex]) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }

        }
        return -1;
    }
}
