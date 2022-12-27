package QAI;

import java.util.HashMap;
import java.util.Map;

public class QAIInversePattern {

    public static void main(String[] args) {

        String letters = "aaacccbbaa";

        //Expected result: 3[a]2[b]

        Map<Character, Integer> lettersMap = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {

            char symbol = letters.charAt(i);

            if (lettersMap.containsKey(symbol)) {

                lettersMap.replace(symbol, lettersMap.get(symbol)+1);
            } else {
                lettersMap.put(symbol, 1);
            }
        }

        for (Map.Entry<Character, Integer> format : lettersMap.entrySet()) {

            System.out.print(format.getValue() + "[" + format.getKey() + "]");

        }
        System.out.println();

        System.out.println(lettersMap);


    }


}
