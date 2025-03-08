import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number:");
            arr[i] = scanner.nextInt();
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        int[] result = new int[uniqueNumbers.size()];
        int i = 0;
        for (int num : uniqueNumbers) {
            result[i++] = num;
        }
        System.out.println("Array without duplicates: " + Arrays.toString(result));

        scanner.close();

    }
}
