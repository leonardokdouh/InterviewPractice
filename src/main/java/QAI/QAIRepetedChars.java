package QAI;

import java.util.HashMap;
import java.util.Map;

public class QAIRepetedChars {


    public static void main(String[] args) {

        String lala = "Hello my dear friend my";
        uniqueWords(lala);
    }

    public static void uniqueWords(String str){

        //str = str.replace(" ", "");
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            } else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Letter: " + entry.getKey()
                    + ". " + "Amount of times that was found: " + entry.getValue());
        }

    }
}
