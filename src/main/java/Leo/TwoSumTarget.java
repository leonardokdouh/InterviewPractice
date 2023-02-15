package Leo;
import java.util.*;
public class TwoSumTarget {
    /**
     * Given an int array return true if two elements sum equals a given target
     * */
    public static void main(String[] args) {
    int [] myArray = {3, 5, 1, 3, 7, 10};
    positions(myArray, 8);
    }

    //SI PIDE DEVOLVER POSICIONES DE los que son iguales al target
    public static List<Integer[]> positions (int[] numbers, int target){
        List<Integer[]> myList = new ArrayList<>();
        Map<Integer, Integer> mapNumbers = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            mapNumbers.put(numbers[i], i);
            if(mapNumbers.containsKey(target-numbers[i])){
                Integer [] auxArray= new Integer[2];
                auxArray[0]= i;
                auxArray[1] = mapNumbers.get(target-numbers[i]);
                myList.add(auxArray);
            }
        }
        myList.stream().forEach(numerito->
                System.out.println(Arrays.toString(numerito)));
        return myList;
    }

    public static int[] twoSumBruteForce(int[] numbers, int target){
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //SI PIDE MAP HACER ESTO
    public static boolean canSum(int [] intArray, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for( int i=0; i<intArray.length; i++){
            map.put(intArray[i], i);
            //after the i =0, i will ask if my map contains a key of (target-intArray[i]) i=1 or i=n; -> means that two numbers = target
            if(map.containsKey(target-intArray[i]))  return true;
        }
        return false;
    }

    //SI PIDE HASHSET HACER ESTo
    public static boolean setCanSum(int [] intArray, int target){
        HashSet<Integer> myHashSet = new HashSet<>();
        for( int i=0; i<intArray.length; i++){
            myHashSet.add(intArray[i]);
            //after the i =0, i will ask if my map contains a key of (target-intArray[i]) i=1 or i=n; -> means that two numbers = target
            if(myHashSet.contains(target-intArray[i]))  return true;
        }
        return false;
    }
}
