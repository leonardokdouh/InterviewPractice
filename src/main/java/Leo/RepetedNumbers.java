package Leo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepetedNumbers {

    /**
     * Check if array has repeated numbers
     * <p>
     * 1) Set, meter los numeros, si el size es != return false
     * 2) Set, meter los numeros, siempre y cuando el set no contenga el numero.
     * 3) Meter toddy dentro de un map, si el map tiene key->sumar. Al final pregunta si getKey>1 ->false
     * 4) Doble for: i para c/numero
     */


    public static void main(String[] args) {

        int[] numbers = {2, 4, 5, 1, 10, 14};

        int[] repeatNumbers = {2, 4, 5, 10, 2, 25};

        System.out.println(isForRepeat(repeatNumbers));
    }

    //i can put everything inside a set, if it has a != size, then has repeat.
    public static boolean isRepeat(int[] input) {
        Set mySet = new HashSet<>();

        for (int numbers : input) {
            mySet.add(numbers);
        }
        return (mySet.size() == input.length);

    }

    //i can ask before adding every number inside a Set, if it contains->return false.
    public static boolean isRepeatInOtherSet(int[] input) {
        Set mySet = new HashSet<>();

        for (int numbers : input) {
            if (mySet.contains(numbers)) return false;
            mySet.add(numbers);
        }
        return true;
    }

    //i can put everything inside a Map, then ask if there is any key that has a value bigger than 1-> False
    public static boolean isRepeatInMap(int[] input) {

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int numbers : input) {
            if (myMap.containsKey(numbers)) {
                myMap.replace(numbers, myMap.get(numbers) + 1);
            } else {
                myMap.put(numbers, 1);
            }
        }
        for (int numb : input) {
            if (myMap.get(numb) > 1) return false;
        }
        return true;
    }

    //using a double for loop and ask if i!=j and input[i]==input[j]

    public static boolean isForRepeat( int [] input){
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input.length; j++){
                if(i!=j && input[i]==input[j]) return false;
            }
        }
        return true;
    }

}
