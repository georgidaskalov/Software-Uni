package workshopBasicAlgorithms.mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[] {82,43,27,38,3,9,10};

        int[] sorted = mergeSort(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(sorted[i] + " ");
        }


    }
    private static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int halfId = arr.length /2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0 , halfId);
        int[] rightHalf = Arrays.copyOfRange(arr, halfId ,arr.length);

        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);


        return mergeToSortedArrays(leftHalf,rightHalf);
    }


    public static int[] mergeToSortedArrays(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            int firstElement = first[firstIndex];
            int secondElement = second[secondIndex];

            if (firstElement < secondElement) {
                merged[firstIndex + secondIndex] = firstElement;
                firstIndex++;
            } else {
                merged[firstIndex + secondIndex] = secondElement;
                secondIndex++;
            }
        }
        while (firstIndex < first.length){
            merged[firstIndex + secondIndex] = first[firstIndex];
            firstIndex++;
        }

        while (secondIndex < second.length){
            merged[firstIndex + secondIndex] = second[secondIndex];
            secondIndex++;
        }

        return merged;
    }
}
