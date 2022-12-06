package QAI;

import java.util.HashMap;
import java.util.Map;

public class QAICountLetters {


    /**
     *
    "Hello world" count letters
     * // h - 1
     * // e - 1
     * // l - 3 ...

     */

    public static void main(String[] args) {
        String word = "hooola a todos";
        countingLetters(word);

    }


    public static void countingLetters(String word){

        Map<Character, Integer> myWordsMap = new HashMap<>();
        for (int i=0; i<word.length(); i++){
            if(myWordsMap.containsKey(word.charAt(i))){
                myWordsMap.replace(word.charAt(i), myWordsMap.get(word.charAt(i))+1);
            }
            else{
                myWordsMap.put(word.charAt(i), 1);
            }
        }
        System.out.println(myWordsMap);

    }
}
