package Leo;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String firstInput = "Hi my name is Leonardo nice to meet you";

        String secondInput = "Hi my name is Ricardito, my pleasure";

        System.out.println(countingWords(firstInput));

        System.out.println("Now we have the other input: ");

        System.out.println(countingWords(secondInput));
    }

    public static Map<String, Integer> countingWords(String line) {

        Map<String, Integer> myWordsMap = new HashMap<>();

        String regx = "[^a-zA-Z ]";
        line = line.toUpperCase();
        String[] aux = line.replace(regx, "").split(" ");

        for (String words : aux) {
            String actualWord = words;
            if (myWordsMap.containsKey(actualWord)) {
                myWordsMap.replace(actualWord, myWordsMap.get(actualWord) + 1);
            } else {
                myWordsMap.put(actualWord, 1);
            }
        }
        return myWordsMap;
    }
}
