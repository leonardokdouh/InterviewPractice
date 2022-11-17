package QAI;

import java.util.Arrays;
/**
 * Given two strings, return true if they are Anagram
 * or False if it's not an Anagram.
 * An Anagram is a word, phrase, or name formed by rearranging the letters of another.
 * Example spar is formed from rasp.
 */

public class QAIAnagramNormal {

    public static void main(String[] args) {
        String firstWord = "hola";
        String secondWord = "olah";

        System.out.println(isAnagram(firstWord, secondWord));
    }


    public static boolean isAnagram(String one, String two){

        char[] firstWord = one.toLowerCase().toCharArray();
        char[] secondWord = two.toLowerCase().toCharArray();
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return (Arrays.equals(firstWord,secondWord));
    }




}
