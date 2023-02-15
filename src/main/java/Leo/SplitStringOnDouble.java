package Leo;

import java.util.Arrays;

public class SplitStringOnDouble {
    /**
     * * String asdfGGkjcl, split it on the doubled symbol and print length of both strings
     */


    public static void main(String[] args) {
        String word="asdfGGkjcl";
        String regex = "([a-zA-Z])\\1";

        solution(word);
    }
    public static void solution (String line){
        String regex = "([a-zA-Z])\\1";
        String[] aux = line.split(regex);
        Arrays.stream(aux).forEach(auxSplit -> {
            System.out.println(auxSplit + ": " + auxSplit.length());
        });
    }
}
