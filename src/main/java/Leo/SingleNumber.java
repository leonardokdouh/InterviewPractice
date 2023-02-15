package Leo;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    /**
     *  * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *  * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *  * Example 1:
     *  * Input: nums = [2,2,1]
     *  * Output: 1
     */


    public static void main (String [] args){
        int[] numbs = {2, 5, 6, 4, 4, 2, 5, 6, 210};

        System.out.println(singleNumber(numbs));

    }

    public static int singleNumber(int[] numbers){

        Set mySet = new HashSet<>();
        int aux=0;
        for(int i=0; i<numbers.length; i++){
            if(!mySet.contains(numbers[i])){
                mySet.add(numbers[i]);
                aux+=numbers[i];
            }else {
                mySet.remove(numbers[i]);
                aux-=numbers[i];
            }
        }

        return aux;
    }

/**
 * XOR of a number with itself is 0.
 * XOR of a number with 0 is number itself.
 *
 * Let us consider the above example.
 *
 * res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4
 *
 * Since XOR is associative and commutative, above
 * expression can be written as:
 *
 * res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)
 *     = 7 ^ 0 ^ 0 ^ 0
 *     = 7 ^ 0
 *     = 7
 */
    public static int solution2(int[] inputArray){
        int result = inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            System.out.print(result + " XOR " + inputArray[i] + "= ");
            result = result ^ inputArray[i];
            System.out.println(result);
        }
        return result;
    }
}
