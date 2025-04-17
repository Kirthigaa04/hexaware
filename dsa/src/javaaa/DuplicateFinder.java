package javaaa;
import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        findDuplicates(input);
    }
    public static void findDuplicates(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (char c : chars) {
            if (!uniqueChars.add(c)) {
                duplicateChars.add(c);
            }
        }

        if (duplicateChars.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate characters: " + duplicateChars);
        }
    }
}
