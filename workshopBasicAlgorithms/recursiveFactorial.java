package workshopBasicAlgorithms;

        import java.util.Arrays;
        import java.util.Scanner;

public class recursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        Arrays.fill(arr, n);
        int factorial = factorialRecursively(n);
        System.out.println(factorial);

    }

    public static int factorialRecursively(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursively(n - 1);
    }

    // public static int sumRecursively(int[] arr, int i) {
    //     if (i < arr.length) {
    //         return arr[i] + sumRecursively(arr, i + 1);
    //     }
    //     return 0;
    // }
}
