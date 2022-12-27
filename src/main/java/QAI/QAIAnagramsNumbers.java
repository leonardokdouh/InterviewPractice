package QAI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QAIAnagramsNumbers {
    public static void main(String[] args) {
        String line = "231 546 123 456 231 312 4556 ";
        String[] splitted = line.split(" ");
        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < splitted.length; i++){
            char[] solution = splitted[i].toCharArray();
            Arrays.sort(solution);
            String sorted = new String(solution);
            if(map.containsKey(sorted)){
                String aux = map.get(sorted);
                aux = aux + " "  + splitted[i];
                map.put(sorted,aux);
            }else{
                map.put(sorted,splitted[i]);
            }
        }

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            if (entry.getValue().split(" ").length>1){
                System.out.println("Are numeric anagrams");
            }else {
                System.out.println("Has no anagrams");
            }
        }
    }
}
