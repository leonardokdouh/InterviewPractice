package QAI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QAICoffeCakeOurs {
//PRIMERO CARGO EL MAPA CON LOS PRODUYCT Y $$$
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Coffe", 100);
        menu.put("Cake", 150);
        menu.put("Popcorn", 200);
        coins2(menu, 400);
    }

    public static void coins2(Map<String, Integer> menu, int amount){
        String[] productsComb = new String[menu.size()];
        List<String> combinations = new ArrayList<>();
        int index = 0;

        //overload the string array with the products
        for (String product: menu.keySet()){
            productsComb[index] = product;
            index++;
        }

        // condicion while
        for (int i = 0; i < productsComb.length; i++){
            for (int j = i; j < productsComb.length - 1; j++){
                String product1 = productsComb[i];
                String product2 = productsComb[j + 1];
                if (menu.get(product1) + menu.get(product2) < amount){
                    //es una combinacion valida
                    String validCombination = product1 + " " + product2;
                    combinations.add(validCombination);
                }
            }
        }

        for (String lista: combinations){
            System.out.println("Valid Combination" + lista);
        }
    }


}
