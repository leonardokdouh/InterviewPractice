package Leo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, return true if they are Anagram
 * or False if it's not an Anagram.
 * An Anagram is a word, phrase, or name formed by rearranging the letters of another.
 * Example spar is formed from rasp.
 */
public class anagramsWord {

    public static void main(String[] args) {
        String firstWord = "hidude";
        String secondWord = "dudehi";


        System.out.println(oneMapOnly(firstWord, secondWord));
    }

    //For this exercises i have several ways to solved it
    //I'm thinking that first i can ask if the lenght are the same, if not return false.
    public static boolean isAnagram(String first, String second) {
        //The easy way will be to create to char arrays,
        //Then use the method Arrays.sort and return the Arrays.equals method
        if (first.length() != second.length()) return false;
        char[] firstAux = first.toCharArray();
        char[] secondAux = second.toCharArray();

        Arrays.sort(firstAux);
        Arrays.sort(secondAux);
        return Arrays.equals(firstAux, secondAux);
    }

    public static boolean isAnagramMapII(String first, String second) {
        if (first.length() != second.length()) return false;

        Map<Character, Integer> firstAux = new HashMap<>();
        Map<Character, Integer> secondAux = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            if (firstAux.containsKey(first.charAt(i))) {
                firstAux.replace(first.charAt(i), firstAux.get(first.charAt(i)) + 1);
            } else {
                firstAux.put(first.charAt(i), 1);
            }
            if (secondAux.containsKey(second.charAt(i))) {
                secondAux.replace(second.charAt(i), secondAux.get(second.charAt(i)) + 1);
            } else {
                secondAux.put(second.charAt(i), 1);
            }
        }

        return firstAux.equals(secondAux);
    }

    public static boolean oneMapOnly(String first, String second) {
        if (first.length() != second.length()) return false;
        Map<Character, Integer> auxMap = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            Character letter = first.charAt(i);
            Character secondLetter = second.charAt(i);

            if (auxMap.containsKey(letter)) {
                auxMap.replace(letter, auxMap.get(letter) + 1);
            } else {
                auxMap.put(letter, 1);
            }
            if (auxMap.containsKey(secondLetter)) {
                auxMap.replace(secondLetter, auxMap.get(secondLetter) - 1);
            } else {
                auxMap.put(secondLetter, -1);
            }
        }
        for (Integer mymap : auxMap.values()) {
            if (mymap != 0) return false;
        }
        return true;
    }

}
