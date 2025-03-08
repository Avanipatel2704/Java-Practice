import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String updated = text.replaceAll("[AEIOUaeiou]", "*");

        System.out.println("Modified string: " + updated);

        scanner.close();
    }
}

