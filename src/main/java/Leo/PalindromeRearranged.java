package Leo;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranged {

    //given a String determine if it can be rearranged as a palindrome

    public static void main(String[] args) {
        String input = "larutanatural";
        String inputSecond = "amumu";

        System.out.println(isPalindromeNow(inputSecond));
    }

    public static boolean isPalindromeNow(String input) {
        int auxCount = 0;
        Map<Character, Integer> myMapOfLetters = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character letter = input.charAt(i);
            if (myMapOfLetters.containsKey(letter)) {
                myMapOfLetters.replace(letter, myMapOfLetters.get(letter) + 1);
            } else {
                myMapOfLetters.put(letter, 1);
            }
        }
        for (Integer mapita : myMapOfLetters.values()) {
            if (mapita % 2 != 0) auxCount++;
        }
        return !(auxCount > 1);
    }

}
