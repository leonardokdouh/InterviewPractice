package QAI;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 */

public class QAISingleNumber {

    public static void main(String[] args) {
        int [] myArrays = new int[]{2, 2, 4, 5, 4, 5, 10};

        System.out.println(singleNumber(myArrays));

    }

        public static  int singleNumber (int [] inputArray){
        Integer number= null;
            Map<Integer, Integer> auxMap = new HashMap<>();

            for (int i = 0; i < inputArray.length; i++){
                if (auxMap.containsKey(inputArray[i])){
                    auxMap.put(inputArray[i], auxMap.get(inputArray[i]) + 1);
                }else{
                    auxMap.put(inputArray[i], 1);
                }
            }

            for (Integer key : auxMap.keySet()){
                if (auxMap.get(key) == 1){
                    number=  key;
                }
            }

        return number;

    }


}
