package QAI;

import java.util.HashMap;
import java.util.Map;

public class QAICountWords {

    public static void main(String[] args) {
        String word = "hooola a todos a a a    a";
        countWords(word);

    }

    public static void countWords(String word){
        String [] arrayOfWords = word.split("[\\s]+");

        for (String holis: arrayOfWords){
            System.out.println(holis);
        }

        Map<String, Integer> myWordsMap = new HashMap<>();

        for (int i=0; i<arrayOfWords.length; i++){
            if(myWordsMap.containsKey(arrayOfWords[i])){
                myWordsMap.replace(arrayOfWords[i], myWordsMap.get(arrayOfWords[i])+1);

            }else {
                myWordsMap.put(arrayOfWords[i], 1);
            }
        }


        System.out.println(myWordsMap);
        }


}
