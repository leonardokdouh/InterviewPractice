package QAI;

import java.util.Map;

public class QAIInversePatternII {

    public static void main(String[] args) {

        String letters = "aacbb";
        System.out.println(solution(letters));
    }

    public static String solution(String letterss) {
        StringBuilder strBuilder = new StringBuilder();

        int amountLetters = 0;

        char lastLetter = letterss.charAt(0);

        for (char forLetter : letterss.toCharArray()) {
            if (forLetter != lastLetter) {
                strBuilder.append(amountLetters + "[" + lastLetter + "]");
                amountLetters = 1;
                lastLetter = forLetter;
            } else {
                amountLetters++;
            }
        }
            strBuilder.append(amountLetters + "[" + lastLetter + "]");

        return strBuilder.toString();
    }
}
