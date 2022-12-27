package QAI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QAICoinsREDDIT {
    public static void main(String[] args) {
        Map<String, Integer> myMenu = new HashMap<>();
        myMenu.put("Coffe", 100);
        myMenu.put("Cake", 200);
        myMenu.put("PopCorn", 225);
        myMenu.put("any", 25);

        creatCombinatios(myMenu, 400);
        //i will call my method that checks if the combinations are added to created list.
    }

    public static void creatCombinatios(Map<String, Integer> menuProcuts, int money) {

        List<String> names = new ArrayList<>();
        int index = 0;

        for (String products : menuProcuts.keySet()) {
            names.add(products);
        }

        for (String name : names) {
            menuProcuts.remove(name);
            int wastedMoney = 0;
            String combiinations = " ";

            for (Map.Entry<String, Integer> data : menuProcuts.entrySet()) {
                wastedMoney += data.getValue();
                combiinations = combiinations + data.getKey();
            }

            if (wastedMoney < money) {
                System.out.print(combiinations);
            }
        }
    }

}
