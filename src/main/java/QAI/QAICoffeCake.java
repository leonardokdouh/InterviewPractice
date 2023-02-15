package QAI;

import java.util.*;

/**
 *
 * Coins = 400;
 * Menu = { "coffee" : 100
 *                  "cake" : 200
 * 		"popcorn" : 225
 * }
 * Write a method that will show all possible
 * combinations that can bought for coins
 *
 Without logic, we know that we can buy:
 1) 4 coffees
 2) 2 Cof & 1 cake
 3) 2 cakes
 4) 1 popcorn & 1 cofe
 5) 1 popcorn
 */
public class QAICoffeCake {

        public static HashMap<String, Integer> menu = new HashMap<>();
        public static final int MINIMUM_VALUE = 100;
        public static void main(String[] args) {
            menu.put("coffee", 100);
            menu.put("cake", 200);
            menu.put("popcorn", 225);

            printAllCombinations();
        }
    public static void printAllCombinations(){
        HashSet<List<String>> solutionSet = new HashSet<>();
        int coins = 400;
        for(Map.Entry<String, Integer> entry : menu.entrySet()){
            List<String> firstStep = new ArrayList<>();
            firstStep.add(entry.getKey());
            availableCombination(coins - entry.getValue(), firstStep, solutionSet);
        }
        System.out.println(solutionSet);
    }
    public static void availableCombination(int coins, List<String> currentBranch, HashSet<List<String>> solutionSet){
        if(coins < MINIMUM_VALUE){
            solutionSet.add(currentBranch);
        } else {
            for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                if (coins >= entry.getValue()) {
                    List<String> auxList = new LinkedList<>(currentBranch);
                    auxList.add(entry.getKey());
                    availableCombination(coins - entry.getValue(), auxList, solutionSet);
                }
            }
        }
    }
}
