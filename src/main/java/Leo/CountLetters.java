package Leo;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    /**
     * Count the letters in a given string
     * <p>
     * input 1= "hellomyfriend";
     * input 2 = "hello my friend";
     * input 3 = ?
     */


    public static void main(String[] args) {
        String input1 = "hellomyfriend";
        String input2 = "hello my friend";

        System.out.println("this is input 1: " + countingLetters(input1));
        System.out.println("this is input 2: " + countingLetters(input2));
    }


    public static Map<Character, Integer> countingLetters(String input) {

        // I will create a new String with the replaceAll to remove all the white spaces.
        String word =input.replaceAll(" ","");

        Map<Character, Integer> words = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char actualLetter = word.charAt(i);
            if (words.containsKey(actualLetter)) {
                words.replace(actualLetter, words.get(actualLetter) + 1);
            } else {
                words.put(actualLetter, 1);
            }
        }
        return words;
    }
}


