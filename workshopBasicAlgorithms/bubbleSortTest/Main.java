package workshopBasicAlgorithms.bubbleSortTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{68,100,42,0,69,12,42,36,2,1};

        int[] sorted = bubbleSort(arr);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }

    }
    public static int[] bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
