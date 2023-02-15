package QAI;

import java.util.HashMap;

/**
 * Given two strings, return true if they are Anagram
 * or False if it's not an Anagram.
 *
 * USING HASHMAP ONLY
 *
 * An Anagram is a word, phrase, or name formed by rearranging the letters of another.
 * Example spar is formed from rasp.
 */
public class QAIAnagramHashMap {


    public static void main(String[] args) {
        String firstWord = "cbajaa";
        String secondWord = "aajabc";


        System.out.println(isAnagram(firstWord, secondWord));
    }


    public static boolean isAnagram(String one, String two){

        HashMap<Character, Integer> myMap = new HashMap<>();
        HashMap<Character, Integer> mySecondMap = new HashMap<>();

        if(one.length()!=two.length()) return false;


        for (int i= 0; i<one.length(); i++){

            if(myMap.containsKey(one.charAt(i))){
                myMap.put(one.charAt(i), myMap.get(one.charAt(i))+1);
            } else {
                    myMap.put(one.charAt(i), 1);
            }
            if(mySecondMap.containsKey(two.charAt(i))){
                mySecondMap.put(two.charAt(i), mySecondMap.get(two.charAt(i))+1);

            }else {
                mySecondMap.put(two.charAt(i), 1);
            }

        }

        if(myMap.equals(mySecondMap)) return true;
        else return false;
    }

}
