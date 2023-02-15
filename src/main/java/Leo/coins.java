package Leo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class coins {

    /**
    Coins = 400;
    Menu = { "coffee" : 100
        "cake" : 200
        "popcorn" : 225
    }
    Write a method that will show all possible combinations
     that can bought for coins */

    //Please i will take one minute to think about
    // Una buena: escribir que voy a usar lista o alguna mierda cosa de que vea
    // que intentas usar el cerebro. Escribirla
    // TOMARSE 1 minuto para pensar y simular que no tenemos puta idea del ejercicio

    // ej falopa. 1) i will save the menu in two arrays, one for product and other for price
    // 1') Since the positions will be similar listProd[o] listPrice[0].
    // 2) In a for loop ask for the next element and if the money is available, add it.


    //No, it will work, but i am not really sure about it. It will be better to use a map
    //like Map<String, Integer> Menu . Create a list just with the products Name, to
    // iterate after in my Menu (since i have the menu, i can use keySet() method from map)
    //that creates a Set from the map keys.
    // So First i will create a map to add everything in the menu

    public static void main(String[] args) {

        Map<String, Integer> myMenu = new HashMap<>();
        myMenu.put("Coffe", 100);
        myMenu.put("Cake", 200);
        myMenu.put("PopCorn", 225);

        createCombinatios(myMenu, 400);
    }

    public static void createCombinatios(Map<String, Integer> menuProducts, int moneyAvailable){
        List<String> listOfProducts = new ArrayList <>();
        for(String product: menuProducts.keySet()){
            listOfProducts.add(product);
        }
        for(String actualProduct : listOfProducts){
            int combinationCost=0;
            int actualProductPrice = menuProducts.get(actualProduct); //Coffe -> 100;
            menuProducts.remove(actualProduct);  //remuevo coffe.

            for (Map.Entry<String, Integer> prodPrice : menuProducts.entrySet()) {
                combinationCost += prodPrice.getValue();
            }
                //Entramos con cake - popcorn -> 200 + 225 =425

            if(combinationCost<=moneyAvailable){  //425<moneyAvailable (500)
                System.out.println("this combination cost: " + combinationCost);
                for(Map.Entry<String, Integer> data : menuProducts.entrySet()){ //menuProduct = cake-pop
                    System.out.print(" - " + data.getKey());
                }
            }
            menuProducts.put(actualProduct, actualProductPrice);
            System.out.println(" ");
        }
    }
}






















