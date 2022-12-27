package QAI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QAICoffeCakeONEONLY {
    public static void main(String[] args) {

        Map<String, Integer> menu = new HashMap<>();
        menu.put("coffee", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 225);
        int coins = 400;

        List<String> combinations = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            combinations.add(entry.getKey());
        }

        for (String name : combinations) {
            Map<String, Integer> aux = new HashMap<>();
            aux.putAll(menu);
            aux.remove(name);
            int result = 0;
            for (Map.Entry<String, Integer> entr : aux.entrySet()) {
                result = result + entr.getValue();
            }
            if (result <= coins) {
                for (Map.Entry<String, Integer> e : aux.entrySet()) {
                    System.out.print(e.getValue() + " ");
                }
            }
            System.out.println("-----------------");

        }

    }
}
