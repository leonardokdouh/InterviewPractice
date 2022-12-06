import java.util.HashMap;
import java.util.Map;

public class PalindromeRearraging {
    /**
     *
     * Given a string, find out if its characters can be rearranged to form a palindrome.
     *
     * Example
     *
     * For inputString = "aabb", the output should be
     * solution(inputString) = true.
     *
     * We can rearrange "aabb" to make "abba", which is a palindrome.
     *
     */

    public static void main(String[] args) {



    }



    boolean solution(String inputString) {
        inputString = inputString.toLowerCase();
        int odds = 0;
        Map<Character, Integer> auxMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++){
            Character letter = inputString.charAt(i);
            if (auxMap.containsKey(letter)){
                auxMap.put(letter, auxMap.get(letter) + 1);
            }else{
                auxMap.put(letter, 1);
            }
        }
        for (Character letra : auxMap.keySet()){
            if (auxMap.get(letra) % 2 != 0){
                odds++;
            }
        }
        return (odds < 2);
    }
}
