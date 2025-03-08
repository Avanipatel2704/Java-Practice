import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Que_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        System.out.println("Total words: " + words.length);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); 
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word occurrences: " + wordCount);
        scanner.close();
    }
}
