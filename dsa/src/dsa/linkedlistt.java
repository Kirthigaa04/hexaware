package dsa;
import java.util.*;

class Main {

    public static String ArrayChallenge(String[] strArr) {
        // Step 1: Initialize the cache and Challenge Token
        List<String> cache = new ArrayList<>();
        int cacheSize = 5;
        String challengeToken = "glivqoa30f2";

        // Step 2: Simulate the LRU cache behavior
        for (String charElement : strArr) {
            // If the character is already in the cache, remove it and add it to the front
            if (cache.contains(charElement)) {
                cache.remove(charElement);
            } else if (cache.size() == cacheSize) {
                // If the cache is full, remove the least recently used element (last one)
                cache.remove(0);
            }
            cache.add(charElement); // Add the element to the most recent position
        }

        // Step 3: Join the cache elements into a hyphen-separated string
        StringBuilder cacheString = new StringBuilder();
        for (int i = 0; i < cache.size(); i++) {
            cacheString.append(cache.get(i));
            if (i < cache.size()) {
                cacheString.append("-");
            }
        }
        // Remove the last hyphen
        String result = cacheString.toString();
        if (result.endsWith("-")) {
            result = result.substring(0, result.length() - 1);
        }

        // Step 4: Remove characters found in Challenge Token (case insensitive)
        Set<Character> tokenSet = new HashSet<>();
        for (char c : challengeToken.toLowerCase().toCharArray()) {
            tokenSet.add(c);
        }

        StringBuilder finalResult = new StringBuilder();
        for (char c : result.toCharArray()) {
            // Only append characters that are not in the token set
            if (!tokenSet.contains(Character.toLowerCase(c))) {
                finalResult.append(c);
            }
        }

        // Step 5: If the final string is empty, return "EMPTY"
        if (finalResult.length() == 0) {
            return "EMPTY";
        }

        return finalResult.toString();
    }

    public static void main(String[] args) {
        // Keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine().split(",")));
        s.close();
    }
}